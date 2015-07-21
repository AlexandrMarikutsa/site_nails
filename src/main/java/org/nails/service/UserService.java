package org.nails.service;

import org.nails.hibernate.entity.User;

public interface UserService {
    public void addUser(User user);

    public String validateEmail(User guest);
}
