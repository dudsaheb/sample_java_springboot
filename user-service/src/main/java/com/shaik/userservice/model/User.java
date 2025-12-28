package com.shaik.userservice.model;

public class User{

    private long id;
    private String name;
    private String email;
    private String password;

    public User(){

    }

    public User(long id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}