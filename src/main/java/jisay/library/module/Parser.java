package jisay.library.module;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jisay.library.model.Func;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Parser implements Func {

    @Override
    public <O> O parse(String response, String key) throws JsonProcessingException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject) parser.parse(response);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        if(object.get(key) instanceof JSONArray) {
            JSONArray array = (JSONArray) object.get(key);
            O result = mapper.readValue(array.toJSONString(), new TypeReference<>() {});
            return result;
        }else{
            JSONObject jsonObject = (JSONObject) object.get(key);
            O result = mapper.readValue(jsonObject.toJSONString(), new TypeReference<>() {});
            return result;

        }

    }

}
