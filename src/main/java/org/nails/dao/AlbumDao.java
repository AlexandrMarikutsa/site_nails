package org.nails.dao;

import org.nails.hibernate.entity.Album;

import java.util.List;

public interface AlbumDao extends BaseDao {
    public List<Album> getAllAlbums();
}
