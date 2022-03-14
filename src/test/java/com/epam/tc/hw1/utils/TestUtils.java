package com.epam.tc.hw1.utils;

import com.epam.tc.hw1.entities.User;
import com.epam.tc.hw1.site.SiteJdi;

public class TestUtils {

    public static void checkLoggedIn(final User user) {
        SiteJdi.homePage.getUsername().shouldBe().text(user.username);
    }
}
