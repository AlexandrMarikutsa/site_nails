package org.nails.dao;


import org.nails.hibernate.entity.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserDao extends BaseDao{

    public void addUser(User user);
    public User loadUserByUsername(String email) throws UsernameNotFoundException;
}
