package com.epam.designpattern.factory_method.product.impl;

import com.epam.designpattern.factory_method.product.Ide;

/**
 * Created by Oleg_Chorpita on 10/13/2016.
 */
public class Intelij implements Ide {
    @Override
    public void createIde() {
        System.out.println("created new ide IDEA");
    }
}
