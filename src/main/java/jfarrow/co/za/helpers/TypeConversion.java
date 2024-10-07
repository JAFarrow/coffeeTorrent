package jfarrow.co.za.helpers;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

    public static String sha1AndUrlEncode(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] hashBytes = digest.digest(input.getBytes("UTF-8"));
            String hexString = hashBytesToString(hashBytes);
            return URLEncoder.encode(hexString, "UTF-8");
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException("Input Conversion Errored", e);
        }
    }

    public static String hashBytesToString(byte[] hashBytes) {
        StringBuilder hexSB = new StringBuilder();
        for (byte b: hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexSB.append("0");
            hexSB.append(hex);
        }
        return hexSB.toString();
    }
} 
