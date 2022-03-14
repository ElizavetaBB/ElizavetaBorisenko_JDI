package com.epam.tc.hw1.utils;

import com.epam.tc.hw1.entities.MetalsColorsData;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;

public class JsonFileReader {

    public static HashMap<String, MetalsColorsData> readMetalsColorsFileDataSet(final String path)
            throws FileNotFoundException {
        Gson gson = new Gson();
        Type jsonMapType = new TypeToken<HashMap<String, MetalsColorsData>>() {}.getType();
        Reader reader = new FileReader(path);
        return gson.fromJson(reader, jsonMapType);
    }
}
