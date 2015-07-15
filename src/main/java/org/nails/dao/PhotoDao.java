package org.nails.dao;

import org.nails.hibernate.entity.Picture;

import java.util.List;

/**
 * Created by Aleksander on 22.06.2015.
 */
public interface PhotoDao extends BaseDao {
    public List getAllPictures(int albumId);
}
