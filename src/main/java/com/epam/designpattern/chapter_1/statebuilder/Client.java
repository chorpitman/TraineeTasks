package com.epam.designpattern.chapter_1.statebuilder;

import java.util.Date;

public class Client {
    private final int phone;
    private final String name;
    private final Date registrationDate;
    private final String lastName;
    private final String surName;
    private final String adress;
    private final int inssuranceNumber;
    private final Date birthDate;


    public Client(int phone, String name, Date registrationDate, String lastName, String surName, String adress, int inssuranceNumber, Date birthDate) {
        this.phone = phone;
        this.name = name;
        this.registrationDate = registrationDate;
        this.lastName = lastName;
        this.surName = surName;
        this.adress = adress;
        this.inssuranceNumber = inssuranceNumber;
        this.birthDate = birthDate;
    }

    public int getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public Date getRegistrationDate() {
        return new Date(this.registrationDate.getTime());
    }

    public static class Builder {
        private  int phone;
        private  String name;
        private  Date registrationDate;
        private  String lastName;
        private  String surName;
        private  String adress;
        private  int inssuranceNumber;
        private  Date birthDate;


        public Builder setPhone(int phone) {
            this.phone = phone;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRegistrationDate(Date registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setSurName(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public Builder setInssuranceNumber(int inssuranceNumber) {
            this.inssuranceNumber = inssuranceNumber;
            return this;
        }

        public Builder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Client build() {
            return new Client(phone, name, new Date(), lastName, surName, adress, inssuranceNumber, birthDate);
        }
    }
}
