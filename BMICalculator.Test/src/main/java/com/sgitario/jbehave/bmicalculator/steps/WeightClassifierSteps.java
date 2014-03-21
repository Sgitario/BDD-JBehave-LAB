package com.sgitario.jbehave.bmicalculator.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;

import com.sgitario.jbehave.bmicalculator.domain.BodyMassIndex;
import com.sgitario.jbehave.bmicalculator.domain.WeightCategory;
import com.sgitario.jbehave.bmicalculator.domain.WeightClassifier;
import com.sgitario.jbehave.bmicalculator.domain.impl.BodyMassIndexImpl;
import com.sgitario.jbehave.bmicalculator.domain.impl.WeightClassifierImpl;

public class WeightClassifierSteps {

    // --- Instance Variables --------------------------------------------------
    
    private WeightClassifier weightClassifier;

    // --- Constructors --------------------------------------------------------
    
    public WeightClassifierSteps() {
    }

    // --- Methods (JBehave) ---------------------------------------------------
    
    @Given("Weight Classifier is started")
    public void initializeWeightClassifier() {
            weightClassifier = new WeightClassifierImpl();
    }

    // @Then("And for the calculated bmi $bmi, the weight classifier shows: $weight-category")
    @Then("for the calculated bmi value <bmi>, the weight classifier shows: <weight-category>")
    public void validateWeightCategoryForGivenBmi_PARAMETRIZED(
                    @Named("bmi") double bmiValue,
                    @Named("weight-category") String expectedWeightCategory) {
            validateWeightCategoryForGivenBmi(bmiValue, expectedWeightCategory);
    }

    @Then("for the calculated bmi value $bmi, the weight classifier shows: $weightCategory")
    public void validateWeightCategoryForGivenBmi_NOT_PARAMETRIZED(
                    @Named("bmi") double bmiValue,
                    @Named("weightCategory") String expectedWeightCategory) {
            validateWeightCategoryForGivenBmi(bmiValue, expectedWeightCategory);
    }

    // --- Methods (Auxiliary) -------------------------------------------------
    
    private void validateWeightCategoryForGivenBmi(
                    @Named("bmi") double bmiValue,
                    @Named("weight-category") String expectedWeightCategory) {
            BodyMassIndex bmi = new BodyMassIndexImpl(bmiValue);
            WeightCategory actualWeightCategory = weightClassifier.assess(bmi);
            assertThat(actualWeightCategory.getStringValue(),
                            is(equalTo(expectedWeightCategory)));
    }

}
