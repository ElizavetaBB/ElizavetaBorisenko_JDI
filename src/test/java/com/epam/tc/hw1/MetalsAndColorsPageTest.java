package com.epam.tc.hw1;

import static com.epam.tc.hw1.data.TestData.getExpectedMetalsAndColorsData;
import static org.assertj.core.api.Assertions.assertThat;

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

        assertThat(SiteJdi.metalsAndColorsPage.getResultPanel())
                .as("Test the result panel contains expected rows")
                .isEqualTo(getExpectedMetalsAndColorsData(metalsColorsData));
    }

}
