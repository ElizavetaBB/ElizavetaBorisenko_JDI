package com.epam.tc.hw1.site.sections;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import com.epam.tc.hw1.entities.User;

public class LoginForm extends Form<User> {

    @Css("#name")
    private TextField login;

    @Css("#password")
    private TextField password;

    @Css("[type=submit]")
    private Button enter;

}
