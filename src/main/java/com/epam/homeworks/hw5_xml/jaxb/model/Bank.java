package com.epam.homeworks.hw5_xml.jaxb.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "bank")
@XmlType(propOrder = {"name", "country", "typeOfContibution", "depositor", "accountId", "amountOnDeposit", "profitability", "timeConstraints",})
public class Bank {

    private String name;
    private String country;
    private String typeOfContibution;
    private String depositor;
    private long accountId;
    private int amountOnDeposit;
    private double profitability;
    private long timeConstraints;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTypeOfContibution() {
        return typeOfContibution;
    }

    public void setTypeOfContibution(String typeOfContibution) {
        this.typeOfContibution = typeOfContibution;
    }

    public String getDepositor() {
        return depositor;
    }

    public void setDepositor(String depositor) {
        this.depositor = depositor;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public int getAmountOnDeposit() {
        return amountOnDeposit;
    }

    public void setAmountOnDeposit(int amountOnDeposit) {
        this.amountOnDeposit = amountOnDeposit;
    }

    public double getProfitability() {
        return profitability;
    }

    public void setProfitability(double profitability) {
        this.profitability = profitability;
    }

    public long getTimeConstraints() {
        return timeConstraints;
    }

    public void setTimeConstraints(long timeConstraints) {
        this.timeConstraints = timeConstraints;
    }

    @Override
    public String toString() {
        return "[bank] " +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", typeOfContibution='" + typeOfContibution + '\'' +
                ", depositor='" + depositor + '\'' +
                ", accountId=" + accountId +
                ", amountOnDeposit=" + amountOnDeposit +
                ", profitability=" + profitability +
                ", timeConstraints=" + timeConstraints;
    }
}
