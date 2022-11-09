package com.autumn.learn.jvm.t4.proxy;

import jvm.t4.User;

public class UserService {

    public void save(User user){
        System.out.println("save...");
    }

    public void update(User user){
        System.out.println("update...");
    }

}
