package com.epam.tc.hw1.site.sections;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import com.epam.tc.hw1.entities.MetalsColorsData;

public class MetalsAndColorsForm extends Form<MetalsColorsData> {

    @Css("[name=custom_radio_odd]")
    private RadioButtons summaryOdd;

    @Css("[name=custom_radio_even")
    private RadioButtons summaryEven;

    @Css("#elements-checklist input")
    private Checklist elementsChecklist;

    @JDropdown(root = "#colors",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    private Dropdown colors;

    @JDropdown(root = "#metals",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    private Dropdown metals;

    @JDropdown(root = "#salad-dropdown",
            value = "[data-toggle='dropdown']",
            list = "li",
            expand = ".caret")
    private Dropdown vegetables;

    @XPath("//*[@id='salad-dropdown']/button")
    public static Button saladButton;

    @Css("#submit-button")
    private Button submit;

    public void fillForm(MetalsColorsData metalsColorsData) {
        summaryOdd.select(metalsColorsData.summary[0]);
        summaryEven.select(metalsColorsData.summary[1]);
        elementsChecklist.select(metalsColorsData.elements);
        colors.select(metalsColorsData.color);
        metals.select(metalsColorsData.metals);
        saladButton.click();
        vegetables.select(vegetables.value().getText()); // unselect "Vegetables"
        vegetables.select(metalsColorsData.vegetables);
    }

}
