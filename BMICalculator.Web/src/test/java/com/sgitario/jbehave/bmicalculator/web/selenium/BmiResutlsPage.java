package com.sgitario.jbehave.bmicalculator.web.selenium;

import com.sgitario.jbehave.bmicalculator.web.WebConstants;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

public class BmiResutlsPage extends AbstractBmiPage {

        private Selenium selenium;

        public BmiResutlsPage(Selenium selenium, ConditionRunner conditionRunner) {
                super(selenium, conditionRunner);
                this.selenium = selenium;
        }

        public String getUrl() {
                return selenium.getLocation();
        }

        public String getBmiValue() {
                return getElementValueById(WebConstants.ID_BMI_VALUE);
        }

        public String getHeading() {
                return getElementValueById(WebConstants.ID_PAGE_HEADING);
        }

        public String getWeightCategory() {
                return getElementValueById(WebConstants.ID_WEIGHT_CATEGORY);
        }
}
