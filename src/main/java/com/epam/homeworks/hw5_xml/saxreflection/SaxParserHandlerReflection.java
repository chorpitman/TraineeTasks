package com.epam.homeworks.hw5_xml.saxreflection;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.lang.reflect.Field;
import java.util.Stack;

public class SaxParserHandlerReflection<T> extends DefaultHandler {

    private T object;
    private Stack<String> stack = new Stack<>();
    Class<T> nameClass;

    public SaxParserHandlerReflection(Class<T> clazz) {
        nameClass = clazz;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //if 1st element try to create instance and add to stack the name of field
        if (stack.isEmpty()) {
            char[] chars = qName.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            String className = new String(chars);

            try {
                if (!className.equals(nameClass.getSimpleName())) {
                    throw new IllegalArgumentException("wrong element " + className);
                }
                object = (T)nameClass.newInstance();

            } catch (/*ClassNotFoundException |*/ IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
        stack.push(qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        stack.pop();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //set value to field of object. field is current element in stack
        String word = new String(ch, start, length).trim();
        if (!word.isEmpty()) {
            try {
                Field fieldName = nameClass.getDeclaredField(stack.peek()); //name
                Class type = nameClass.getDeclaredField(stack.peek()).getType();
                fieldName.setAccessible(true);
                fieldName.set(object, getValueOfField(type, word));

            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public T getObject() {
        return object;
    }


    private static Object getValueOfField(Class type, String value)
    {
        if (long.class == type || Long.class == type)
        {
            return Long.parseLong(value);
        }
        if (int.class == type || Integer.class == type)
        {
            return Integer.parseInt(value);
        }
        if (double.class == type || Double.class == type)
        {
            return Double.parseDouble(value);
        }
        if (String.class == type)
        {
            return value;
        }
        throw new IllegalArgumentException("TYPE is wrong DEBIL" + type);
    }
}
