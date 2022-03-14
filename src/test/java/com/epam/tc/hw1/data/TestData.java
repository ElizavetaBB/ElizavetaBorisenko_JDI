package com.epam.tc.hw1.data;

import com.epam.tc.hw1.entities.MetalsColorsData;

public class TestData {

    public static final String JSON_FILE_PATH = "src/test/resources/JDI_ex8_metalsColorsDataSet.json";

    public static String getExpectedMetalsAndColorsData(MetalsColorsData metalsColorsData) {
        return getSummaryResult(metalsColorsData) + "\n"
                + getElementsResult(metalsColorsData) + "\n"
                + getColorResult(metalsColorsData) + "\n"
                + getMetalResult(metalsColorsData) + "\n"
                + getVegetablesResult(metalsColorsData);
    }

    private static String getSummaryResult(MetalsColorsData metalsColorsData) {
        return String.format("Summary: %d",
                Integer.parseInt(metalsColorsData.summary[0]) + Integer.parseInt(metalsColorsData.summary[1]));
    }

    private static String getElementsResult(MetalsColorsData metalsColorsData) {
        return String.format("Elements: %s",
                String.join(", ", metalsColorsData.elements));
    }

    private static String getColorResult(MetalsColorsData metalsColorsData) {
        return String.format("Color: %s", metalsColorsData.color);
    }

    private static String getMetalResult(MetalsColorsData metalsColorsData) {
        return String.format("Metal: %s", metalsColorsData.metals);
    }

    private static String getVegetablesResult(MetalsColorsData metalsColorsData) {
        return String.format("Vegetables: %s", String.join(", ", metalsColorsData.vegetables));
    }
}
