package com.sgitario.jbehave.bmicalculator.web.selenium;

import com.sgitario.jbehave.bmicalculator.web.WebConstants;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

public class BmiMainPage extends AbstractBmiPage {

        // --- Constructors --------------------------------------------------------

        public BmiMainPage(Selenium selenium, ConditionRunner conditionRunner) {
                super(selenium, conditionRunner);
        }

        // --- Methods (Page Functionality Related) --------------------------------

        public void open() {
                open("/BmiCalcWeb/bmi");
        }

        public String getHeading() {
                return getElementValueById(WebConstants.ID_PAGE_HEADING);
        }

        public void clickCalculateButton() {
                clickButtonWithName(WebConstants.ID_CALCULATE_BTTN);
        }

        public void populateMassValue(float weight) {
                populateDoubleField(WebConstants.ID_MASS, weight);
        }

        public void populateHeightValue(float height) {
                populateDoubleField(WebConstants.ID_HEIGHT, height);
        }

        public String getErrorMessage() {
                return getElementValueById(WebConstants.ID_ERR_MSG);
        }

        // --- Methods (Auxiliary) -------------------------------------------------

        private void populateDoubleField(String fieldId, double value) {
                type("xpath=//*[@id='" + fieldId + "']", Double.toString(value));
        }

        private void clickButtonWithName(String idCalculateBttn) {
                click("xpath=//*[@id='" + idCalculateBttn + "']");
        }
}