package com.epam.podgotovka.multy;

public class Client {

    public static void main( String args [] ) {

        String filename = "test.txt";
        String filename2 = "test.txt";

        Reader reader = new Reader( filename ) ;
        Writer writer = new Writer( filename2 ) ;

        while(true) {
            reader.run();
            writer.run();
        }

    }
}


