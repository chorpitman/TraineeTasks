package com.epam.designpattern.factory_method;

import com.epam.designpattern.factory_method.makers.impl.EclipseMaker;
import com.epam.designpattern.factory_method.makers.IdeMaker;
import com.epam.designpattern.factory_method.makers.impl.IntelijMaker;
import com.epam.designpattern.factory_method.product.Ide;

import java.util.Objects;

/**
 * Created by Oleg_Chorpita on 10/13/2016.
 */
public class Main {
    public static void main(String[] args) {
        String CONST = "EC";
        Ide ide = getIde(CONST).makeIDE();
        ide.createIde();

    }

    private static IdeMaker getIde(String arg) {
        if (Objects.equals(arg, "EC")) {
            return new EclipseMaker();
        }
        if (Objects.equals(arg, "INT")) {
            return new IntelijMaker();
        }
        throw new IllegalArgumentException("PSDC");
    }
}
