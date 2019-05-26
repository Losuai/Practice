package StringPractice;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.sun.org.apache.xerces.internal.xs.StringList;
import org.apache.commons.lang.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> a = Arrays.asList(new String[]{"a,b,c"});
//        List<List<String>> b;
        String[][] ss = {{"a","b","1"},{"c","b","1"}};
        String s = StringUtils.join(a, ",");
        System.out.println(s);
        String[] b;
        b = StringUtils.split(s,",");
        for (String z: b
             ) {
            System.out.println(z);
        }
        System.out.println(JSONArray.toJSONString(Arrays.asList(a)));
        Map<String, Object> aaa = new HashMap<>();
        aaa.put("s", Arrays.asList(ss));
        System.out.println(JSONObject.toJSONString(aaa));
        String z[][] = {{"aa","bb","cc"}};
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key", z);
        System.out.println(jsonObject.toString());
        ObjectMapper objectMapper = new ObjectMapper();

//        objectMapper.convertValue(objectMapper.convertValue(this, HashMap.class), );
    }
}
