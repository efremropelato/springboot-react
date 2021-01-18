package it.filippetti.app.service;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.annotations.RemoteProperty;

import java.util.Date;

@DataTransferObject
public class User {

    @RemoteProperty
    private Integer id;
    @RemoteProperty
    private String name;
    @RemoteProperty
    private Integer age;
    @RemoteProperty
    private String city;
    @RemoteProperty
    private Date createAt;

    public User(Integer id, String name, Integer age, String city, Date createAt) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.createAt = createAt;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

}