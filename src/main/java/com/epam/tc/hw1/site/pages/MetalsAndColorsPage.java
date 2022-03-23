package com.epam.tc.hw1.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.tc.hw1.entities.MetalsColorsData;
import com.epam.tc.hw1.site.sections.MetalsAndColorsForm;
import com.epam.tc.hw1.site.sections.ResultPanel;

@Url("/metals-colors.html")
@Title("Metals and Colors")
public class MetalsAndColorsPage extends WebPage {

    @Css("form")
    private MetalsAndColorsForm metalsAndColorsForm;

    @Css(".info-panel-body-result")
    private ResultPanel resultPanel;

    public void fillMetalsAndColorsForm(MetalsColorsData metalsColorsData) {
        metalsAndColorsForm.fillForm(metalsColorsData);
        metalsAndColorsForm.submit();
    }

    public ResultPanel getResultPanel() {
        return resultPanel;
    }

}
