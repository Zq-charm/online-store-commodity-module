package com.hld.item.item.Util;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class JsonUtil {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public JsonUtil() {
    }

    public static String objectToJson(Object data) {
        try {
            String string = MAPPER.writeValueAsString(data);
            return string;
        } catch (JsonProcessingException var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, new Class[]{beanType});

        try {
            List<T> list = (List)MAPPER.readValue(jsonData, javaType);
            return list;
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }
}
