package com.sgitario.jbehave.bmicalculator.web.selenium;

import org.jbehave.web.selenium.SeleniumPage;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

public class AbstractBmiPage extends SeleniumPage {

        // --- Constructors --------------------------------------------------------

        public AbstractBmiPage(Selenium selenium, ConditionRunner conditionRunner) {
                super(selenium, conditionRunner);
        }

        // --- Methods (Page) ------------------------------------------------------

        protected String getElementValueById(String htmlElemId) {
                return getText("xpath=//*[@id='" + htmlElemId + "']");
        }
}