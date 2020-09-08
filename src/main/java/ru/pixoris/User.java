package ru.pixoris;

import java.util.HashMap;

public class User {
    private final String id;
    private final String name;
    private final String age;

    public User(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public HashMap<String, String> genUser () {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("id", this.id);
        map.put("name", this.name);
        map.put("age", this.age);
        return map;
    }
}
