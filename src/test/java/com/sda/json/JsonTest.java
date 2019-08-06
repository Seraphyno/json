package com.sda.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

public class JsonTest {

    @Test
    public void a_createJsonObject() {
        JSONObject jsonObject = buildObject();

        System.out.println(jsonObject);
    }

    @Test
    public void b_parseJson() {
        JSONObject jsonObject = buildObject();
        Object tags = jsonObject.get("tags");
        Object title = jsonObject.get("title");

        System.out.println("Tags: " + tags);
        System.out.println("Title: " + title);
    }

    private JSONObject buildObject() {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("title", "1001 nights");
        jsonObject.put("author", "Sheherezada");
        jsonObject.put("page_count", 2000);
        jsonObject.put("read", true);
        jsonObject.put("price", 10.32);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add("fiction");
        jsonArray.add("tales");
        jsonArray.add("fantasy");

        jsonObject.put("tags", jsonArray);

        return jsonObject;
    }
}
