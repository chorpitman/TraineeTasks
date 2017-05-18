package com.epam.homeworks.hw5_xml.jaxb;

import com.epam.homeworks.hw5_xml.jaxb.model.Bank;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class JAXBParseXml {
    public static void main(String[] args) throws URISyntaxException {
        try {
            URL url = JAXBParseXml.class.getClassLoader().getResource("BankDeposits.xml");
            if (url != null) {
                File inputFile = new File(url.toURI());
                JAXBContext jaxbContext = JAXBContext.newInstance(Bank.class);

                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Bank bank = (Bank) jaxbUnmarshaller.unmarshal(inputFile);
                System.out.println(bank);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
