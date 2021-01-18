package it.filippetti.app.service;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RemoteProxy(name = "UserService")
public class UserService {

    @RemoteMethod
    public String hello() {
        return "hello";
    }

    @RemoteMethod
    public User user() {
        User test = new User(1, "Efrem", 42, "Monguzzo", new Date());
        return test;
    }

    @RemoteMethod
    public List<User> list() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Efrem", 42, "Monguzzo", new Date()));
        list.add(new User(2, "Roberta", 42, "Monguzzo", new Date()));
        list.add(new User(3, "Marco", 39, "Perugia", new Date()));
        list.add(new User(4, "Luca", 50, "Ancona", new Date()));
        System.out.print(list.toString());
        return list;
    }
}
