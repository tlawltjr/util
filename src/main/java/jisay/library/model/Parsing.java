package jisay.library.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.json.simple.parser.ParseException;

public interface Parsing {
    <O> O parse(String response, String key, TypeReference<?> type) throws JsonProcessingException, ParseException;
}
