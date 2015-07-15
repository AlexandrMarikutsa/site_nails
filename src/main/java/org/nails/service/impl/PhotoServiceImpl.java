package org.nails.service.impl;

import org.nails.dao.PhotoDao;
import org.nails.hibernate.entity.Album;
import org.nails.hibernate.entity.Picture;
import org.nails.service.AlbumService;
import org.nails.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.swing.*;
import javax.transaction.Transactional;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by Aleksander on 13.06.2015.
 */
@Service
@Transactional
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    ServletContext servletContext;

    @Autowired
    private AlbumService albumService;

    @Autowired
    private PhotoDao photoDao;

    @Override
    public void deletePhoto(int photoId){
        photoDao.delete(photoDao.read(photoId,Picture.class));
    }

   @Override
    public void addPhoto(int albumId,String photoName) {
       Picture picture = new Picture();
       picture.setName(photoName);
       picture.setDirectory("/pictures_nails/"+photoName+".png");
       Album album = albumService.readAlbumById(albumId);
       picture.setDirectoryMini("/pictures_nails/"+photoName+"-mini.png");
       picture.setAlbum(album);
       photoDao.create(picture);
    }

    @Override
    public List<Picture> readAllPictures(int albumId) {
        return photoDao.getAllPictures(albumId);
    }

    @Override
    public Picture readPhotoById(int photoId) {
        return (Picture)photoDao.read(photoId,Picture.class);
    }

    @Override
    public BufferedImage scaleImage(int WIDTH, int HEIGHT, String filename) {
        BufferedImage bi = null;
        try {
            ImageIcon ii = new ImageIcon(filename);//path to image
            bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = (Graphics2D) bi.createGraphics();
            g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
            g2d.drawImage(ii.getImage(), 0, 0, WIDTH, HEIGHT, null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return bi;
    }

    @Override
    public String uploadPhoto(int albumId, MultipartFile file, String photoName) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        if (!file.isEmpty()) {
            if (file.getOriginalFilename().endsWith(".jpg") ||
                    file.getOriginalFilename().endsWith(".gif") ||
                    file.getOriginalFilename().endsWith(".png")) {
                try {
                    byte[] bytes = file.getBytes();
                    BufferedOutputStream stream =
                            new BufferedOutputStream(new FileOutputStream(new File(servletContext.getRealPath("/") + "/pictures_nails/" + photoName + ".png")));
                    stream.write(bytes);
                    stream.close();
                    BufferedImage pic = scaleImage(80, 60, servletContext.getRealPath("/") + "/pictures_nails/" + photoName + ".png");
                    ImageIO.write(pic, "png", baos);
                    byte[] bytesMini = baos.toByteArray();
                    BufferedOutputStream streamMini =
                            new BufferedOutputStream(new FileOutputStream(new File(servletContext.getRealPath("/") + "/pictures_nails/" + photoName + "-mini" + ".png")));
                    streamMini.write(bytesMini);
                    streamMini.close();
                    addPhoto(albumId,photoName);
                } catch (Exception e) {
                    return "You failed to upload " + photoName + " => " + e.getMessage();
                }
            }else{
                return  "Format of uploading photo is not correctly.";
            }
        }
        else {
            return "You failed to upload " + photoName + " because the file was empty.";
        }
        return "redirect:/album/{albumId}";
    }

    @Override
    public void updatePhoto(String photoName, int photoId, int albumId) {
        Picture picture = (Picture) photoDao.read(photoId, Picture.class);
        picture.setName(photoName);
        picture.setAlbum(albumService.readAlbumById(albumId));
        photoDao.update(picture);
    }

    @Override
    public void deletePhotoFromFolder(int photoId){
        Picture picture = (Picture)photoDao.read(photoId,Picture.class);
        String path = servletContext.getRealPath(picture.getDirectory());
        File deleteFile = new File(path);
        deleteFile.delete();
        String pathMini = servletContext.getRealPath(picture.getDirectoryMini());
        File deleteFileMini = new File(pathMini);
        deleteFileMini.delete();
    }
}