package com.epam.tc.hw1.data;

import com.epam.tc.hw1.entities.MetalsColorsData;

public class TestData {

    public static final String JSON_FILE_PATH = "src/test/resources/JDI_ex8_metalsColorsDataSet.json";

    public static String getSummaryResult(MetalsColorsData metalsColorsData) {
        return String.format("Summary: %d",
                Integer.parseInt(metalsColorsData.summary.get(0))
                        + Integer.parseInt(metalsColorsData.summary.get(1)));
    }

    public static String getElementsResult(MetalsColorsData metalsColorsData) {
        return String.format("Elements: %s",
                String.join(", ", metalsColorsData.elements.toArray(String[]::new)));
    }

    public static String getColorResult(MetalsColorsData metalsColorsData) {
        return String.format("Color: %s", metalsColorsData.color);
    }

    public static String getMetalResult(MetalsColorsData metalsColorsData) {
        return String.format("Metal: %s", metalsColorsData.metals);
    }

    public static String getVegetablesResult(MetalsColorsData metalsColorsData) {
        return String.format("Vegetables: %s", String.join(", ", metalsColorsData.vegetables.toArray(String[]::new)));
    }

}
