package org.nails.dao;

import org.nails.hibernate.entity.Album;

import java.util.List;

/**
 * Created by Aleksander on 16.06.2015.
 */
public interface AlbumDao extends BaseDao {
    public List<Album> getAllAlbums();
    public Album getAlbumById(int albumId);
}
