package org.nails.service;

import org.nails.hibernate.entity.Album;

import java.util.List;

/**
 * Created by Aleksander on 13.06.2015.
 */
public interface AlbumService {
    public void createAlbum();
    public void uodateAlbum();
    public void deleteAlbum();
    public List<Album> readAlbums();
    public Album readAlbumById(int albumId);
}
