package org.nails.service;

import org.nails.hibernate.entity.Picture;
import org.springframework.cache.annotation.Cacheable;

import java.awt.image.BufferedImage;
import java.util.List;

public interface PhotoService {
    public void deletePhoto(int photoId);

    public void deletePhotoFromFolder(int photoId);

    public void addPhoto(int albumId, String photoName);

//    @Cacheable(value = "defaultCache", key = "#albumId")
    public List<Picture> readAllPictures(int albumId);

    public Picture readPhotoById(int photoId);

    public BufferedImage scaleImage(int WIDTH, int HEIGHT, String filename);

    public String uploadPhoto(int albumId, byte[] bytes, String photoName);

    public void updatePhoto(String photoName, int photoId, int albumId);
}
