package org.nails.hibernate.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.nails.Role;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends BaseEntity implements Serializable {

    @NotEmpty(message = "Password should be not empty")
    @Size(min = 6, max = 100, message = "Your password must be between 6 and 30 characters")
    @Column(name = "u_password", unique = false, nullable = false, length = 100)
    private String password;

    @NotEmpty(message = "Confirm password should be not empty")
    @Size(min = 6, max = 100, message = "Confirm password must be between 6 and 30 characters")
    private String confirmPassword;

    @Column(name = "first_name", length = 25, nullable = false)
    @NotEmpty(message = "Name should be not empty")
    private String firstName;

    @ManyToMany
    @JoinTable(name = "user_comments", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "comment_id")})
    private List<Comment> comments;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Album> albums = new ArrayList<Album>();

    @Column(name = "last_name", length = 25, nullable = false)
    @NotEmpty(message = "Surname should be not empty")
    private String lastName;

    @NotEmpty(message = "Email should be not empty")
    @Email
    @Column(name = "e_mail", length = 40, nullable = false)
    private String email;

    @Column(name = "phone_number", length = 40, nullable = false)
    private String phoneNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "b_day")

    private Date birthDay;
    @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private Role role;

    public User() {
    }

    public User(String password, String firstName, String lastName, String email,
                String phoneNumber, Date birthDay, String confirmPassword) {
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.confirmPassword = confirmPassword;

    }

    ;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
