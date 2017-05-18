package yfain.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserrialization {
    public static void main(String[] args) throws ClassNotFoundException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Employee desEemployee = null;

        try {
            fileInputStream = new FileInputStream("EmployeeObj.ser");
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                desEemployee = (Employee) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                System.out.println("Deserrialization is finished:");
                System.out.println("********************");
                System.out.println(desEemployee.toString());

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
