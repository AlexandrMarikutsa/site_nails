package org.nails.hibernate.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Aleksander on 09.06.2015.
 */
@Entity
@Table(name = "album")
public class Album extends BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private String name;
    private String description;
    private Date creationDate = new Date();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "album")
    private List<Picture> pictures = new ArrayList<Picture>();
//    private String[] labels;
//    private List<Picture> pictures = new ArrayList<Picture>();

    public Album() {
    }
    public Album(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
