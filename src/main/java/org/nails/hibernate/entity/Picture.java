package org.nails.hibernate.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "picture")
public class Picture extends BaseEntity {

    private String name;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "picture")
    private List<Comment> comments = new ArrayList<Comment>();

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    private String directory;

    @Column(name = "directory_mini")
    private String directoryMini;

    public Picture() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getDirectoryMini() {
        return directoryMini;
    }

    public void setDirectoryMini(String directoryMini) {
        this.directoryMini = directoryMini;
    }
}