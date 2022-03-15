package com.epam.tc.hw1.site.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.html.elements.common.Text;

public class ResultPanel {

    @Css(".summ-res")
    private Text summary;

    @Css(".elem-res")
    private Text elements;

    @Css(".col-res")
    private Text color;

    @Css(".met-res")
    private Text metal;

    @Css(".sal-res")
    private Text vegetables;

    public Text getSummary() {
        return summary;
    }

    public Text getElements() {
        return elements;
    }

    public Text getColor() {
        return color;
    }

    public Text getMetal() {
        return metal;
    }

    public Text getVegetables() {
        return vegetables;
    }

}
