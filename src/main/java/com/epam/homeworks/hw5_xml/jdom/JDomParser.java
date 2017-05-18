package com.epam.homeworks.hw5_xml.jdom;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class JDomParser {
    public static void main(String[] args) {
        try {
            URL url = JDomParser.class.getClassLoader().getResource("BankDeposits.xml");
            File inputFile = new File(url.toURI());

            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(inputFile);
            System.out.println("Root element : " + document.getRootElement().getName());

            Element classElement = document.getRootElement();
            List<Element> bankList = classElement.getChildren();
            System.out.println("******************************");

            for (int i = 0; i < bankList.size(); i++) {
                Element depositsElements = bankList.get(i);

                System.out.println("[" + depositsElements.getName() + "] " + depositsElements.getText());
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
