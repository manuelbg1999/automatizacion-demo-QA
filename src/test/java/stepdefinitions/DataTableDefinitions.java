package stepdefinitions;


import io.cucumber.java.DataTableType;
import model.Data;

import java.util.Map;

public class DataTableDefinitions {

    @DataTableType
    public Data data(Map<String, String> entry) {
        return new Data(
                entry.get("fullname"),
                entry.get("email"),
                entry.get("currentaddress"),
                entry.get("permanetaddress"),
                entry.get("texto")

        );
    }


}
