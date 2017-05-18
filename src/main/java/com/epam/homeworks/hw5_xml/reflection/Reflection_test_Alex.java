package com.epam.homeworks.hw5_xml.reflection;

import com.epam.homeworks.hw5_xml.jaxb.model.Bank;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection_test_Alex {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException,
            InvocationTargetException {

        Class clazz = Class.forName("com.epam.homeworks.hw5_xml.jaxb.model.Bank");
        Bank bank = (Bank)clazz.newInstance();
        System.out.println(bank);
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(bank, "APPLE");
        System.out.println(bank);

        Field field1 = clazz.getDeclaredField("accountId");
        field1.setAccessible(true);

        Class type = field1.getType();
        System.out.println(type);
        System.out.println(long.class.equals(type));
        System.out.println(Long.class == type);
        long xx = 0;
        if (long.class == type || Long.class == type){
            xx = Long.parseLong("145");
        }
        System.out.println(xx);

        String c = "java.lang.Long";
        String[] c2 = c.split("\\.");
        c2[2] = "qwerty";
        System.out.println(c2);
        String c3 = c.join(".", c2);
        System.out.println(c3);

//        Class cls = Class.forName("java.lang.Long");
        String typeItem = type.getName();
        char[] chars = typeItem.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        String className = new String(chars);
        String[] strings = className.split("\\.");
        Class cls = Class.forName(className);

        /*Constructor[] constructor = cls.getConstructors();
        Object lg = constructor[1].newInstance("15");
        System.out.println(lg);*/

        Method method = cls.getMethod("parse" + className, String.class);
        Object o = method.invoke(null, "67");
        System.out.println(o);
//        System.out.println(field);
//        Govno nameValue = (Govno)field.get(bank);
//        field.set




    }
}
