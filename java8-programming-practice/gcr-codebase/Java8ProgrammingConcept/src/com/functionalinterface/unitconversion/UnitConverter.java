package com.functionalinterface.unitconversion;

import java.util.function.DoubleUnaryOperator;

public interface UnitConverter {

    static double convert(double value, DoubleUnaryOperator converter) {
        return converter.applyAsDouble(value);
    }
}
