package com.epam.podgotovka.modifierFinal;

class Light {
    //const
    final public static double KWH_PRICE = 3.25;
    int noOfWatts;

    final public void setWatts(int watt){
        noOfWatts = watt;
    }

    public void setKWH() {
//        KWH_PRICE = 4.1; //нельзя
    }
}