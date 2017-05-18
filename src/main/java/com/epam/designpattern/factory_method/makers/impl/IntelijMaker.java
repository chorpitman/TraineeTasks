package com.epam.designpattern.factory_method.makers.impl;

import com.epam.designpattern.factory_method.makers.IdeMaker;
import com.epam.designpattern.factory_method.product.Ide;
import com.epam.designpattern.factory_method.product.impl.Intelij;

/**
 * Created by Oleg_Chorpita on 10/13/2016.
 */
public class IntelijMaker implements IdeMaker {
    @Override
    public Ide makeIDE() {
        return new Intelij();
    }
}
