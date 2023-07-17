package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> newMap = new TreeMap<>();

        for (Map.Entry<String, Integer> map : sourceMap.entrySet()) {
            int length = map.getKey().length();
            if (newMap.containsKey(length)) {
                Set<String> value = newMap.get(length);
                value.add(map.getKey());
            } else {
                Set<String> value = new HashSet<>();
                value.add(map.getKey());
                newMap.put(length, value);
            }
        }

        return newMap;
    }
}
