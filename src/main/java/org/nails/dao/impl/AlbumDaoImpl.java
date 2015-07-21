package org.nails.dao.impl;

import org.nails.dao.AlbumDao;
import org.nails.hibernate.entity.Album;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AlbumDaoImpl extends BaseDaoImpl implements AlbumDao {
    @Override
    public List<Album> getAllAlbums() {
        return sessionFactory.getCurrentSession().createCriteria(Album.class).list();
    }

}
