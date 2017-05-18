package com.epam.homeworks.hw5_xml.reflection;

import com.epam.homeworks.hw5_xml.jaxb.model.Bank;

import java.lang.reflect.Field;

public class MainReflection
{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException
    {
        Class nameClass = Class.forName("com.epam.homeworks.hw5_xml.jaxb.model.Bank");
        String className = nameClass.getSimpleName().toUpperCase();
        System.out.println("name class " + className.toString());

        // Создание obj bank
        Bank bank = (Bank) nameClass.newInstance();
//        System.out.println(bank);

        // получаем поля и сетим
        Field fName = nameClass.getDeclaredField("name");
        fName.setAccessible(true);
        fName.set(bank, "Aval Bank");

        // получаем поля и сетим
        Field fCountry = nameClass.getDeclaredField("country");
        fCountry.setAccessible(true);
        fCountry.set(bank, "UK");

        Field fTypeOfContibution = nameClass.getDeclaredField("typeOfContibution");
        fTypeOfContibution.setAccessible(true);
        fTypeOfContibution.set(bank, "Deposit");

        Field fDepositor = nameClass.getDeclaredField("depositor");
        fDepositor.setAccessible(true);
        fDepositor.set(bank, "Krimskiy");

        Field fieldAccountId = nameClass.getDeclaredField("accountId");
        fieldAccountId.setAccessible(true);
        Class typeAccountId = fieldAccountId.getType();
        fieldAccountId.set(bank, (getValueOfField(typeAccountId, "555666")));

        Field fieldAmmountDeposit = nameClass.getDeclaredField("amountOnDeposit");
        fieldAmmountDeposit.setAccessible(true);
        Class typeAmountOnDeposit = fieldAmmountDeposit.getType();
        fieldAmmountDeposit.set(bank,(getValueOfField(typeAmountOnDeposit, "100000")));

        Field fieldProfitability = nameClass.getDeclaredField("profitability");
        fieldProfitability.setAccessible(true);
        Class typeProfitability = fieldProfitability.getType();
        fieldProfitability.set(bank,(getValueOfField(typeProfitability, "24.9")));

        Field fieldTimeConstraints = nameClass.getDeclaredField("timeConstraints");
        fieldTimeConstraints.setAccessible(true);
        Class typeOfTimeConstraints = fieldTimeConstraints.getType();
        fieldTimeConstraints.set(bank,(getValueOfField(typeOfTimeConstraints, "12")));

        System.out.println("**********************************");
        System.out.println("MODIFY CLASS by REFLECTION " + bank);
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
        throw new IllegalArgumentException("type is wrong " + type);
    }
}
