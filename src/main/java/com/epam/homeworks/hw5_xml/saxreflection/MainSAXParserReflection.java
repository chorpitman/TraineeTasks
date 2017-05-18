package com.epam.homeworks.hw5_xml.saxreflection;

import com.epam.homeworks.hw5_xml.jaxb.model.Bank;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class MainSAXParserReflection {
    public static void main(String[] args) throws URISyntaxException {
        URL url = MainSAXParserReflection.class.getClassLoader().getResource("BankDeposits.xml");
        if (url != null) {
            File file = new File(url.toURI());
            SAXParserFactory factory = SAXParserFactory.newInstance();
            try {
                SAXParser saxParser = factory.newSAXParser();
                SaxParserHandlerReflection<Bank> saxParserHandler = new SaxParserHandlerReflection<>(Bank.class);
                try {
                    saxParser.parse(file, saxParserHandler);
                    Bank bank = saxParserHandler.getObject();
                    System.out.println(bank);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (ParserConfigurationException | SAXException e) {
                e.printStackTrace();
            }

        }

    }
}