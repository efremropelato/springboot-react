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
        User test = new User(1, "小明", 11, "上海", new Date());
        return test;
    }

    @RemoteMethod
    public List<User> list() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "小明", 11, "上海", new Date()));
        list.add(new User(2, "小红", 12, "北京", new Date()));
        list.add(new User(3, "小兰", 13, "广州", new Date()));
        list.add(new User(4, "小镇", 14, "香港", new Date()));
        return list;
    }
}
