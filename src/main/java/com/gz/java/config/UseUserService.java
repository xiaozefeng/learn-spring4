package com.gz.java.config;


public class UseUserService {

    private  UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String sayHi(String word) {
        return userService.sayHi(word);
    }
}
