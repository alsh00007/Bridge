package com.epam.jmp.Bridge;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComponentListBox {

    private DataContainer dataContainer = new DataContainer();

    public Map<String, Object> getData() {

        Map<String, Object> mapDataValue = new LinkedHashMap<>();
        int idx = 0;
        for (String dataValue : dataContainer.getData()) {
            mapDataValue.put(dataValue, String.valueOf(idx++));
        }
        return mapDataValue;
    }

    public String getSelectedData() {

        return dataContainer.getSelectData();
    }

    public void setSelectedData(String selectedData) {

        dataContainer.setSelectedData(selectedData);
    }

}
