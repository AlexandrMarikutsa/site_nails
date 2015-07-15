package org.nails.service.impl;

import org.nails.dao.AlbumDao;
import org.nails.hibernate.entity.Album;
import org.nails.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Aleksander on 13.06.2015.
 */
@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    AlbumDao albumDao;

    @Override
    public void createAlbum() {

    }

    @Override
    public void uodateAlbum() {

    }

    @Override
    public void deleteAlbum() {

    }

    @Override
    public List<Album> readAlbums() {
        List<Album> albums = albumDao.getAllAlbums();
        return albums;
    }

    @Transactional
    public Album readAlbumById(int albumId) {
        return albumDao.getAlbumById(albumId);
    }
}
