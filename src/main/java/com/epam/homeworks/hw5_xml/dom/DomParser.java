package com.epam.homeworks.hw5_xml.dom;

import java.io.File;
import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParser {
    public static void main(String[] args) {
        try {
            URL url = DomParser.class.getClassLoader().getResource("BankDeposits.xml");
            File inputFile = new File(url.toURI());

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement();
            System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("bank");
            System.out.println("****************************");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                System.out.println("Current Element : " + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("[name] : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("[country] : " + eElement.getElementsByTagName("country").item(0).getTextContent());
                    System.out.println("[typeOfContibution] : " + eElement.getElementsByTagName("typeOfContibution").item(0).getTextContent());
                    System.out.println("[depositor] : " + eElement.getElementsByTagName("depositor").item(0).getTextContent());
                    System.out.println("[accountId] : " + eElement.getElementsByTagName("accountId").item(0).getTextContent());
                    System.out.println("[amountOnDeposit] : " + eElement.getElementsByTagName("amountOnDeposit").item(0).getTextContent());
                    System.out.println("[profitability] : " + eElement.getElementsByTagName("profitability").item(0).getTextContent());
                    System.out.println("[timeConstraints] : " + eElement.getElementsByTagName("timeConstraints").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}