package com.test.calc.control;

import com.test.calc.common.PrintType;
import com.test.calc.decorator.DecoratorIF;
import com.test.calc.decorator.HTMLDecorator;
import com.test.calc.decorator.TextDecorator;
import com.test.calc.decorator.XMLDecorator;

public class DecoratorFactory {
    public static DecoratorIF getDecorator(PrintType printType) {
        DecoratorIF result = new TextDecorator();
        switch (printType) {
            case HTML -> result = new HTMLDecorator();
            case TEXT -> result = new TextDecorator();
            case XML -> result = new XMLDecorator();
        }
        return result;
    }
}