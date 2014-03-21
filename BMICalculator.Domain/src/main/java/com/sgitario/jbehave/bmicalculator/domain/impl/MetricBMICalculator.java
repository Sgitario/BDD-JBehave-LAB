package com.sgitario.jbehave.bmicalculator.domain.impl;

import com.sgitario.jbehave.bmicalculator.domain.BMICalculator;
import com.sgitario.jbehave.bmicalculator.domain.BodyMassIndex;
import com.sgitario.jbehave.bmicalculator.domain.HealthRecord;

public class MetricBMICalculator implements BMICalculator {

    /**
     * Calculates a metric BMI.
     * 
     * @param healthRecord
     *            Person's health record from which are taken the mass and
     *            height needed for the calculation.
     * 
     * @return Returns the corresponding body mass index.
     */
    public BodyMassIndex calculate(HealthRecord healthRecord) {
            float weight = healthRecord.getWeight();
            float height = healthRecord.getHeight();

            // Calculating Body Mass Index
            double bmiValue = weight / (height * height);

            return new BodyMassIndexImpl(bmiValue);
    }
}
