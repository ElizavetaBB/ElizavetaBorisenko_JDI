package com.epam.tc.hw1.data;

import com.epam.tc.hw1.entities.User;

public class UsersData {

    public static final User DEFAULT_USER = new User().set(u -> {
        u.login = "Roman";
        u.password = "Jdi1234";
        u.username = "ROMAN IOVLEV";
    });
}
