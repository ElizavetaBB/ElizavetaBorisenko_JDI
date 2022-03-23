package com.epam.tc.hw1.utils;

import static com.epam.tc.hw1.data.TestData.getColorResult;
import static com.epam.tc.hw1.data.TestData.getElementsResult;
import static com.epam.tc.hw1.data.TestData.getMetalResult;
import static com.epam.tc.hw1.data.TestData.getSummaryResult;
import static com.epam.tc.hw1.data.TestData.getVegetablesResult;

import com.epam.tc.hw1.entities.MetalsColorsData;
import com.epam.tc.hw1.entities.User;
import com.epam.tc.hw1.site.SiteJdi;

public class TestUtils {

    public static void checkLoggedIn(final User user) {
        SiteJdi.homePage.getUsername().shouldBe().text(user.username);
    }

    public static void checkResultPanel(MetalsColorsData metalsColorsData) {
        SiteJdi.metalsAndColorsPage.getResultPanel().getSummary().is().text(getSummaryResult(metalsColorsData));
        SiteJdi.metalsAndColorsPage.getResultPanel().getElements().is().text(getElementsResult(metalsColorsData));
        SiteJdi.metalsAndColorsPage.getResultPanel().getColor().is().text(getColorResult(metalsColorsData));
        SiteJdi.metalsAndColorsPage.getResultPanel().getMetal().is().text(getMetalResult(metalsColorsData));
        SiteJdi.metalsAndColorsPage.getResultPanel().getVegetables().is().text(getVegetablesResult(metalsColorsData));
    }

}
