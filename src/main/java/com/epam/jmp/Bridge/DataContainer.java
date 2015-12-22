package com.epam.jmp.Bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * not changed structure
 */
public class DataContainer {

    private String              selectedData;
    private static List<String> values = new ArrayList<>();
    static {
        values.add("value 1");
        values.add("value 2");
        values.add("value 3");
        values.add("value 4");
        values.add("value 5");
    }

    public List<String> getData() {

        return values;
    }

    public String getSelectData() {

        return this.selectedData;
    }

    void setSelectedData(String value) {

        selectedData = value;
    }
}
