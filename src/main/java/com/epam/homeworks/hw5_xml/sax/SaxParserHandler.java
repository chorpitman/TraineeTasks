package com.epam.homeworks.hw5_xml.sax;

import com.epam.homeworks.hw5_xml.jaxb.model.Bank;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserHandler extends DefaultHandler {
    private boolean isName;
    private boolean isCountry;
    private boolean isTypeOfContibution;
    private boolean isDepositor;
    private boolean isAccountId;
    private boolean isAmountOnDeposit;
    private boolean isProfitability;
    private boolean isTimeConstraints;
    private Bank bank = new Bank();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("bank")) {
            System.out.println("[PlayerAlarm Element] : " + qName);
        } else if (qName.equalsIgnoreCase("name")) {
            isName = true;
        } else if (qName.equalsIgnoreCase("country")) {
            isCountry = true;
        } else if (qName.equalsIgnoreCase("typeOfContibution")) {
            isTypeOfContibution = true;
        } else if (qName.equalsIgnoreCase("depositor")) {
            isDepositor = true;
        } else if (qName.equalsIgnoreCase("accountId")) {
            isAccountId = true;
        } else if (qName.equalsIgnoreCase("amountOnDeposit")) {
            isAmountOnDeposit = true;
        } else if (qName.equalsIgnoreCase("profitability")) {
            isProfitability = true;
        } else if (qName.equalsIgnoreCase("timeConstraints")) {
            isTimeConstraints = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("bank")) {
            System.out.println("[End Element] : " + qName);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (isName) {
            System.out.println("[name]: " + new String(ch, start, length));
            bank.setName(new String(ch, start, length));
            isName = false;
        } else if (isCountry) {
            System.out.println("[country]: " + new String(ch, start, length));
            bank.setCountry(new String(ch, start, length));
            isCountry = false;
        } else if (isTypeOfContibution) {
            System.out.println("[typeOfContibution]: " + new String(ch, start, length));
            bank.setTypeOfContibution(new String(ch, start, length));
            isTypeOfContibution = false;
        } else if (isDepositor) {
            System.out.println("[depositor]: " + new String(ch, start, length));
            bank.setDepositor(new String(ch, start, length));
            isDepositor = false;
        } else if (isAccountId) {
            System.out.println("[accountId]: " + new String(ch, start, length));
            bank.setAccountId(Long.parseLong(new String(ch, start, length)));
            isAccountId = false;
        } else if (isAmountOnDeposit) {
            System.out.println("[amountOnDeposit]: " + new String(ch, start, length));
            bank.setAmountOnDeposit(Integer.parseInt(new String(ch, start, length)));
            isAmountOnDeposit = false;
        } else if (isProfitability) {
            System.out.println("[profitability]: " + new String(ch, start, length));
            bank.setProfitability(Double.parseDouble(new String(ch, start, length)));
            isProfitability = false;
        } else if (isTimeConstraints) {
            System.out.println("[timeConstraints]: " + new String(ch, start, length));
            bank.setTimeConstraints(Long.parseLong(new String(ch, start,length)));
            isTimeConstraints = false;
        }
    }

    public Bank getBank() {
        return bank;
    }
}
