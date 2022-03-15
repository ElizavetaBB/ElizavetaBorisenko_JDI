package com.epam.tc.hw1.site.pages;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.tc.hw1.entities.HeaderMenuData;
import com.epam.tc.hw1.entities.User;
import com.epam.tc.hw1.site.sections.LoginForm;

@Url("/index.html")
@Title("Home Page")
public class HomePage extends WebPage {

    @Css("form")
    private LoginForm loginForm;

    @Css("#user-name")
    private Label username;

    @Css(".profile-photo")
    private Button userIcon;

    @UI(".uui-navigation.nav.navbar-nav.m-l8 li")
    private Menu headerMenu;

    public void login(final User user) {
        userIcon.click();
        loginForm.loginAs(user);
    }

    public Label getUsername() {
        return username;
    }

    public void openMetalsAndColorsPage(final HeaderMenuData menuItem) {
        headerMenu.select(menuItem.getHeaderItem());
    }

}
