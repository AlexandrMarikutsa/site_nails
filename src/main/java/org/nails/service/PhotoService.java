package org.nails.service;

import org.nails.hibernate.entity.BaseEntity;
import org.nails.hibernate.entity.Picture;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Locale;

/**
 * Created by Aleksander on 13.06.2015.
 */
public interface PhotoService {
    public void deletePhoto(int photoId);
    public void deletePhotoFromFolder(int photoId);
    public void addPhoto(int albumId, String photoName);
    public List<Picture> readAllPictures(int albumId);
    public BaseEntity readPhotoById(int photoId);
    public BufferedImage scaleImage(int WIDTH, int HEIGHT, String filename);
    public String uploadPhoto(int albumId, MultipartFile file, String photoName);
    public void updatePhoto(String photoName,int photoId,int albumId);
}
