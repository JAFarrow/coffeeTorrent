package jfarrow.co.za.helpers;

import java.util.HashMap;

public class TypeConversion {
    public static HashMap<String, Object> objectToHashMap(Object parsedMap) throws IllegalArgumentException {
        if (parsedMap instanceof HashMap<?, ?>) {
            @SuppressWarnings("unchecked")
            HashMap<String, Object> map = (HashMap<String, Object>) parsedMap;
            return map;
        } else {
            throw new IllegalArgumentException("Parsed Object not a HashMap");
        }
    }
} 
