package com.epam.jmp.Bridge;

import java.util.List;

public class ComponentTable {

    private static DataContainer dataContainer = new DataContainer();

    public List<String> getData() {

        return dataContainer.getData();
    }

    public String getSelectedData() {

        return dataContainer.getSelectData();
    }

    public void setSelectedData(String selectedData) {

        dataContainer.setSelectedData(selectedData);
    }
}
