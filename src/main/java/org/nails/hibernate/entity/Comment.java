package org.nails.hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "comment")
public class Comment extends BaseEntity {

    private String comment;

    @ManyToOne
    @JoinColumn(name = "picture_id")
    private Picture picture;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_comments", joinColumns = {@JoinColumn(name = "comment_id")}, inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private List<User> users;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
