package org.nails.dao.impl;

        import org.hibernate.SessionFactory;
        import org.hibernate.criterion.Restrictions;
        import org.nails.dao.PhotoDao;
        import org.nails.hibernate.entity.Picture;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import javax.transaction.Transactional;
        import java.util.List;

@Service
@Transactional
public class PhotoDaoImpl extends BaseDaoImpl implements PhotoDao {
    int summaZaprosovAllPictures = 1;

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Picture> getAllPictures(int albumId) {
        System.out.println("Koli4estvo zaprosov allPictures =  " + summaZaprosovAllPictures++);
        return sessionFactory.getCurrentSession().createCriteria(Picture.class).add(Restrictions.eq("album.id", albumId)).setCacheable(true).list();
    }
}
