package yfain.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serrialization {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setfName("Alex");
        employee.setlName("Manson");
        employee.setSalary(50000);

        try {
            FileOutputStream fileOutputStream = null;
            ObjectOutputStream objectOutputStream = null;
            fileOutputStream = new FileOutputStream("EmployeeObj.ser");
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(employee);
                objectOutputStream.flush();
                objectOutputStream.close();
                fileOutputStream.close();
                System.out.println("Serrialization is Finished...");
                System.out.println(employee);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
