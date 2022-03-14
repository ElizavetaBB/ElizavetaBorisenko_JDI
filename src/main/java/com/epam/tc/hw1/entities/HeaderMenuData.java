package com.epam.tc.hw1.entities;

public enum HeaderMenuData {
    HOME("Home"),
    CONTACT_FORM("Contact form"),
    SERVICE("Service"),
    METALS_AND_COLORS("Metals & Colors");

    private final String headerItem;

    HeaderMenuData(String headerItem) {
        this.headerItem = headerItem;
    }

    public String getHeaderItem() {
        return headerItem;
    }
}
