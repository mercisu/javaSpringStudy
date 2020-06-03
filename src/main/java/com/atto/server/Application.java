package com.atto.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        initMap();
    }

    public static void initMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("1.key:" + entry.getKey() + ", value:" + entry.getValue());
        }

        for(Map.Entry entry : map.entrySet()) {
            System.out.println("2.key:" + entry.getKey() + ", value:" + entry.getValue());
        }

        for(String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("3.key:" + key +", value:" + value);
        }

        Iterator<Map.Entry<String, String>> iteratorE = map.entrySet().iterator();
        while (iteratorE.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorE.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("4.key:" + key +", value:" + value);
        }

        Iterator<String> iteratorS = map.KeySet().iterator();
        while (iteratorS.hasNext()) {
            String key = iteratorS.next();
            String value = map.get(key);
            System.out.println("4.key:" + key +", value:" + value);
        }
    }
}
