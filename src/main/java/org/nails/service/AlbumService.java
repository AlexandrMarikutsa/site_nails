package org.nails.service;

import org.nails.hibernate.entity.Album;

import java.util.List;

public interface AlbumService {
    public void createAlbum();

    public void uodateAlbum();

    public void deleteAlbum();

    public List<Album> readAlbums();

    public Album readAlbumById(int albumId);
}
