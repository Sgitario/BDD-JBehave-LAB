package com.sgitario.jbehave.bmicalculator.web.selenium;

import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;

import com.thoughtworks.selenium.Selenium;

public class BeforeAndAfterScenarioSteps {

        // --- Instance Variables --------------------------------------------------
        
        private Selenium selenium;

        // --- Constructors --------------------------------------------------------
        
        public BeforeAndAfterScenarioSteps(Selenium selenium) {
                this.selenium = selenium;
        }

        // --- Methods (JBehave) ---------------------------------------------------
        
        @BeforeStory
        public void startSelenium() {
                if (selenium != null) {
                        selenium.start();
                }
        }

        @AfterStory
        public void stopSelenium() {
                if (selenium != null) {
                        selenium.stop();
                }
        }
}
