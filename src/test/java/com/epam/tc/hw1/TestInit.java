package com.epam.tc.hw1;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.tc.hw1.data.UsersData.DEFAULT_USER;
import static com.epam.tc.hw1.utils.TestUtils.checkLoggedIn;

import com.epam.tc.hw1.site.SiteJdi;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class TestInit {

    @BeforeClass
    static void setUp() {
        initElements(SiteJdi.class);
        SiteJdi.open();
        SiteJdi.homePage.login(DEFAULT_USER);
        checkLoggedIn(DEFAULT_USER);
    }

    @AfterClass
    static void teardown() {
        killAllSeleniumDrivers();
    }

}
