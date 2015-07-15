package org.nails.hibernate.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Aleksander on 09.06.2015.
 */
@Entity
@Table(name = "comment")
public class Comment  extends BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "picture_id")
    private Picture picture;

    @ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinTable(name = "user_comments", joinColumns = { @JoinColumn(name = "comment_id") }, inverseJoinColumns = { @JoinColumn(name = "user_id") })
    private List<User> users;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
