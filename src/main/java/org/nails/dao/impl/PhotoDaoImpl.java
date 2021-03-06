package org.nails.dao.impl;

        import org.hibernate.SessionFactory;
        import org.hibernate.criterion.Restrictions;
        import org.nails.dao.PhotoDao;
        import org.nails.hibernate.entity.Picture;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import java.util.List;

@Service
public class PhotoDaoImpl extends BaseDaoImpl implements PhotoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Picture> getAllPictures(int albumId) {
        return sessionFactory.getCurrentSession().createCriteria(Picture.class).add(Restrictions.eq("album.id", albumId)).list();
    }
}
