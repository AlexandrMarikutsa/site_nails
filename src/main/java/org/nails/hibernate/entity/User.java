package org.nails.hibernate.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User extends BaseEntity{

    @Column(name = "U_PASSWORD", unique = false, nullable = false, length = 100)
    private String password;

    @NotNull(message = "Confirm password should be not null")
    private String confirmPassword;

    @Column(name = "FIRST_NAME", length = 25, nullable = false)
    @NotBlank(message = "Name should be not empty")
    private String firstName;

    @ManyToMany
    @JoinTable(name="user_comments", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns={@JoinColumn(name="comment_id")})
    private List<Comment> comments;

    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Album> albums = new ArrayList<Album>();

    @Column(name = "LAST_NAME", length = 25, nullable = false)
    @NotBlank(message = "Surname should be not empty")
    private String lastName;

    @Column(name = "E_MAIL", length = 40, nullable = false)
    private String email;

    @Column(name = "PHONE_NUMBER", length = 40, nullable = false)
    private String phoneNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "B_DAY")
    private Date birthDay;
    @Column(name = "USER_ROLE")
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(){};
    public User(String password, String firstName, String lastName, String email,
                String phoneNumber, Date birthDay, String confirmPassword){
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.confirmPassword = confirmPassword;

    };

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
