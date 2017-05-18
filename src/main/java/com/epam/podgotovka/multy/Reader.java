package com.epam.podgotovka.multy;


public class Reader implements Runnable {

    public String filename;

    public Reader( String filename ) {
        this.filename = filename;
    }

    @Override
    public void run() {

        synchronized( this.filename ) {
            System.out.println( "reading a file:" + this.filename );
        }

    }
}
