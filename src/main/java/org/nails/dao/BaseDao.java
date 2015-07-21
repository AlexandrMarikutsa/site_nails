package org.nails.dao;

import org.nails.hibernate.entity.BaseEntity;

public interface BaseDao {
    public void create(BaseEntity obj);

    public void update(BaseEntity obj);

    public void delete(BaseEntity obj);

    public BaseEntity read(int id, Class clazz);
}
