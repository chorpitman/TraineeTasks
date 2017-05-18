package com.epam.java18.lambda.links;

public class HightTempearture {
    private int hTemp;

    public HightTempearture(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp(HightTempearture ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HightTempearture ht2) {
        return hTemp<ht2.hTemp;
    }
}
