package org.nails.service;

import org.nails.hibernate.entity.RegistrationResponse;
import org.nails.hibernate.entity.User;

import java.text.ParseException;

/**
 * Created by Aleksander on 09.06.2015.
 */
public interface UserService {
    public RegistrationResponse addUser(User user) throws ParseException;
}
