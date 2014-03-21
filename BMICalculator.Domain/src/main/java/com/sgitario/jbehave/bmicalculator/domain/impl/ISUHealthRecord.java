package com.sgitario.jbehave.bmicalculator.domain.impl;

import com.sgitario.jbehave.bmicalculator.domain.HealthRecord;

public class ISUHealthRecord implements HealthRecord {

    // --- Instance Variables --------------------------------------------------

    /** Height of the patient */
    private float height;

    /** Patient's mass */
    private float mass;

    // --- Constructors --------------------------------------------------------

    public ISUHealthRecord() {
    }

    public ISUHealthRecord(float height, float weight) {
            this.height = height;
            this.mass = weight;
    }

    // --- Getters and Setters -------------------------------------------------

    public float getHeight() {
            return height;
    }

    public void setHeight(float height) {
            this.height = height;
    }

    public float getWeight() {
            return mass;
    }

    public void setWeight(float weight) {
            this.mass = weight;
    }
}
