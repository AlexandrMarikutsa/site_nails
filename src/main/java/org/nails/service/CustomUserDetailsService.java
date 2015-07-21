package org.nails.service;


import org.nails.dao.UserDao;
import org.nails.exception.UserNotFoundException;
import org.nails.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        org.nails.hibernate.entity.User user = userDao.loadUserByUsername(email);
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        try {
            return new User(user.getEmail(),
                    user.getPassword(),
                    getAuthorities(user.getRole()));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<GrantedAuthority> getAuthorities(Role role) {
        return getGrantedAuthorities(role.toString());
    }

    public static List<GrantedAuthority> getGrantedAuthorities(String role) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(role));
        return authorities;
    }
}
