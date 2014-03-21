package com.sgitario.jbehave.bmicalculator.web.selenium;

import com.sgitario.jbehave.bmicalculator.web.WebConstants;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

public class BmiPageFactory {

        private final Selenium selenium;
        private final ConditionRunner conditionRunner;

        public BmiPageFactory(Selenium selenium, ConditionRunner conditionRunner) {
                this.selenium = selenium;
                this.conditionRunner = conditionRunner;
        }

        public Class<? extends AbstractBmiPage> getCurrentPageType() {
                String pageHeading = getCurrentPageHeading();
                if (WebConstants.HEADING_MAIN_PAGE.equalsIgnoreCase(pageHeading)) {
                        return BmiMainPage.class;
                }//
                else if (WebConstants.HEADING_RESULTS_PAGE
                                .equalsIgnoreCase(pageHeading)) {
                        return BmiResutlsPage.class;
                }
                return null;
        }

        public BmiMainPage createBmiMainPage() {
                return new BmiMainPage(selenium, conditionRunner);
        }

        public BmiResutlsPage createBmiResultsPage() {
                return new BmiResutlsPage(selenium, conditionRunner);
        }

        // --- Methods (Auxiliary) -------------------------------------------------

        private String getCurrentPageHeading() {
                return selenium.getText("xpath=//*[@id='"
                                + WebConstants.ID_PAGE_HEADING + "']");
        }
}
