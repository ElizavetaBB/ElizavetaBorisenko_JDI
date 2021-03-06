package com.epam.tc.hw1;

import static com.epam.tc.hw1.utils.TestUtils.checkResultPanel;

import com.epam.tc.hw1.entities.HeaderMenuData;
import com.epam.tc.hw1.entities.MetalsColorsData;
import com.epam.tc.hw1.site.SiteJdi;
import com.epam.tc.hw1.utils.MetalsAndColorsDataProvider;
import org.testng.annotations.Test;

public class MetalsAndColorsPageTest extends TestInit {

    @Test (dataProviderClass = MetalsAndColorsDataProvider.class, dataProvider = "Data for metals and colors form")
    public void openMetalsColorsPage(MetalsColorsData metalsColorsData) {
        SiteJdi.homePage.openMetalsAndColorsPage(HeaderMenuData.METALS_AND_COLORS);
        SiteJdi.metalsAndColorsPage.checkOpened();
        SiteJdi.metalsAndColorsPage.fillMetalsAndColorsForm(metalsColorsData);
        checkResultPanel(metalsColorsData);
    }

}
