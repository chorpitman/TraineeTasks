package com.epam.podgotovka.multy;

public class Writer implements Runnable {

    public String filename;

    public Writer( String filename ) {
        this.filename = filename;
    }

    @Override
    public void run() {

        synchronized( this.filename ) {
            System.out.println( "writing to a file:" + this.filename );
        }

    }
}
