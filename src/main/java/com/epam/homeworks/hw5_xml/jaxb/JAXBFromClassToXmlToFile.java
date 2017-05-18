package com.epam.homeworks.hw5_xml.jaxb;

import com.epam.homeworks.hw5_xml.jaxb.model.Bank;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JAXBFromClassToXmlToFile {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setName("Privat");
        bank.setCountry("Ukraine");
        bank.setTypeOfContibution("GeneralDelivery");
        bank.setDepositor("Kastramskoy");
        bank.setAccountId(123456789);
        bank.setAmountOnDeposit(999888777);
        bank.setProfitability(22.5);
        bank.setTimeConstraints(84);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Bank.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //TODO Спросить у Саши как записать в ресурсы
            File file = new File("d:\\1.xml");
            jaxbMarshaller.marshal(bank, file);
            jaxbMarshaller.marshal(bank, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
