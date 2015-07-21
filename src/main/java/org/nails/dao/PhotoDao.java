package org.nails.dao;


import java.util.List;

public interface PhotoDao extends BaseDao {
    public List getAllPictures(int albumId);
}
