package com.epam.designpattern.factory_method.makers.impl;

import com.epam.designpattern.factory_method.makers.IdeMaker;
import com.epam.designpattern.factory_method.product.impl.Eclipse;
import com.epam.designpattern.factory_method.product.Ide;

/**
 * Created by Oleg_Chorpita on 10/13/2016.
 */
public class EclipseMaker implements IdeMaker {
    @Override
    public Ide makeIDE() {
        return new Eclipse();
    }
}
