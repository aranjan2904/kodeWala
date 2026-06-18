package com.kodewala.map2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class Driver10 {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(101, "Abhishek");
        map.put(102, "Rahul");

        System.out.println(map);

        System.out.println(map.get(101));
        
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
