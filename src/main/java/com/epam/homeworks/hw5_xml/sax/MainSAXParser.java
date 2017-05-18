package com.epam.homeworks.hw5_xml.sax;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class MainSAXParser {
    public static void main(String[] args) throws URISyntaxException {
        URL url = MainSAXParser.class.getClassLoader().getResource("BankDeposits.xml");
        if (url != null) {
            File file = new File(url.toURI());
            SAXParserFactory factory = SAXParserFactory.newInstance();
            try {
                SAXParser saxParser = factory.newSAXParser();
                SaxParserHandler saxParserHandler = new SaxParserHandler();
                try {
                    saxParser.parse(file, saxParserHandler);
                    System.out.println(saxParserHandler.getBank());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (ParserConfigurationException | SAXException e) {
                e.printStackTrace();
            }
        }
    }
}
