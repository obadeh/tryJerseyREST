package org.project2.model;

import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Comment {

    private long id;
    private String messege;
    private Date created;
    private String author;


    public Comment(long id, String messege, String author) {
        this.id = id;
        this.messege = messege;
        this.created = new  Date();
        this.author = author;
    }

    public Comment(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
