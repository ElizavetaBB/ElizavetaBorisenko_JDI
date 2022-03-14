package com.epam.tc.hw1.utils;

import com.epam.tc.hw1.data.TestData;
import com.epam.tc.hw1.entities.MetalsColorsData;
import java.io.FileNotFoundException;
import java.util.HashMap;
import org.testng.annotations.DataProvider;

public class MetalsAndColorsDataProvider {

    @DataProvider(name = "Data for metals and colors form")
    public static Object[][] getFormData() throws FileNotFoundException {
        HashMap<String, MetalsColorsData> map = JsonFileReader.readMetalsColorsFileDataSet(TestData.JSON_FILE_PATH);
        Object[][] data = new Object[map.size()][];
        String[] keySet = map.keySet().toArray(new String[0]);
        for (int i = 0; i < map.size(); i++) {
            data[i] = new Object[] {map.get(keySet[i])};
        }
        return data;
    }
}
