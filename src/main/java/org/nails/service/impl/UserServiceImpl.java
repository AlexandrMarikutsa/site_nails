package org.nails.service.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.nails.dao.UserDao;
import org.nails.hibernate.entity.RegistrationResponse;
import org.nails.hibernate.entity.Role;
import org.nails.hibernate.entity.User;
import org.nails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Aleksander on 09.06.2015.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd");

    @Override
    public RegistrationResponse addUser(User guest) throws ParseException {

        RegistrationResponse registrationResponse = validateForm(guest);

        if (registrationResponse.isSuccess()) {
            User user = new User();
            user.setPassword(DigestUtils.md5Hex(guest.getPassword()));
            user.setConfirmPassword(DigestUtils.md5Hex(guest.getConfirmPassword()));
            user.setFirstName(guest.getFirstName());
            user.setLastName(guest.getLastName());
            user.setEmail(guest.getEmail());
            user.setPhoneNumber(guest.getPhoneNumber());
            user.setRole(Role.ROLE_USER);
            user.setBirthDay(guest.getBirthDay());
            userDao.create(user);
        }
        return registrationResponse;
    }
    public RegistrationResponse validateForm(User guest) {
        RegistrationResponse registrationResponse = new RegistrationResponse();
        if (userDao.getUserByEmail(guest.getEmail()) != null) {
            registrationResponse.setSuccess(false);
            registrationResponse.setErrorMessage("Email already in use");
            return registrationResponse;

        } else if (guest.getEmail().equals("")) {
            registrationResponse.setSuccess(false);
            registrationResponse.setErrorMessage("Email is empty");
            return registrationResponse;
        } else if (guest.getFirstName().equals("")) {
            registrationResponse.setSuccess(false);
            registrationResponse.setErrorMessage("First name is empty");
            return registrationResponse;
        } else if (guest.getLastName().equals("")) {
            registrationResponse.setSuccess(false);
            registrationResponse.setErrorMessage("Last name is empty");
            return registrationResponse;
        } else if (guest.getPassword().length() < 6) {
            registrationResponse.setSuccess(false);
            registrationResponse.setErrorMessage("Password length should be more than 6 characters");
            return registrationResponse;
        } else if (!guest.getPassword().equals(guest.getConfirmPassword())) {
            registrationResponse.setSuccess(false);
            registrationResponse.setErrorMessage("Password doesn't match");
            return registrationResponse;
        } else {
            registrationResponse.setSuccess(true);
            return registrationResponse;
        }
    }

}
