package com.epam.tc.hw1.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.tc.hw1.site.pages.HomePage;
import com.epam.tc.hw1.site.pages.MetalsAndColorsPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class SiteJdi {

    public static HomePage homePage;

    public static MetalsAndColorsPage metalsAndColorsPage;

    public static void open() {
        homePage.open();
    }

}
