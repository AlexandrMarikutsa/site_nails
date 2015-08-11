package org.nails.dao.impl;

import org.nails.dao.AlbumDao;
import org.nails.hibernate.entity.Album;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AlbumDaoImpl extends BaseDaoImpl implements AlbumDao {
    int summaZaprosovAllAlbums = 1;

    @Override
    public List<Album> getAllAlbums() {
        System.out.println("Koli4estvo zaprosov allAlbums =  " + summaZaprosovAllAlbums++);
        return sessionFactory.getCurrentSession().createCriteria(Album.class).setCacheable(true).list();
    }

}
