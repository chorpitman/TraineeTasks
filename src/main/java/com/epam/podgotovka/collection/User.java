package com.epam.podgotovka.collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class User implements Cloneable {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
//        User user = new User("Ben", 15);
//        User copy = null;// make clone of user

        Map<String, Object> hashMap = new HashMap<String, Object>() {{
            put("ele", new Object());
            put("ele1", new Object());
            put("ele2", new Object());
            put("ele3", new Object());
        }};


        for (Iterator<String> i = hashMap.keySet().iterator(); i.hasNext(); ) {
            String key = i.next();
            i.remove();
        }
    }
}