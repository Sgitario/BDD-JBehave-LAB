package com.sgitario.jbehave.bmicalculator.domain.impl;

import com.sgitario.jbehave.bmicalculator.domain.BodyMassIndex;

public class BodyMassIndexImpl implements BodyMassIndex {

    private double value;

    public BodyMassIndexImpl(double value) {
            this.value = value;
    }

    public double value() {
            return value;
    }
}
