package com.codegym;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary {
    private Map<String, String> data = new TreeMap<>();

    public String addEntry(String key, String value) {
        return this.data.put(key, value);
    }

    public String removeEntry(String key) {
        return this.data.remove(key);
    }

    //tra ý nghĩa
    public String lookupWord(String key) {
        String value = this.data.get(key);
        return value;
    }// in ra các từ khóa

    public void displayAllKeys() {
        Set<String> allKeys = this.data.keySet();
        for (String key : allKeys) {
            System.out.println(key);
        }
    }

    public int getSize() {
        return this.data.size();
    }
    public void removeAll(){
        this.data.clear();
    }
}
