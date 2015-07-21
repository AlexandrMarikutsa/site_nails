package org.nails.service.impl;

import org.nails.dao.UserDao;
import org.nails.Role;
import org.nails.hibernate.entity.User;
import org.nails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void addUser(User guest) {
        guest.setRole(Role.ROLE_USER);
        userDao.create(guest);
    }

    public String validateEmail(User guest) {
        if (userDao.loadUserByUsername(guest.getEmail()) != null)
            return "Email already in use";
        return null;
    }
}
