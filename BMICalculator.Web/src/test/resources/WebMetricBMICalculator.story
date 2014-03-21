Meta:
@author          Jose Carvajal
@date:           21.03.2014
@topic:          Behaviour Driven Development with Java
@licence:        Some rights reserved. CC BY 3.0, 2014

Scenario: User opens BMI Calculator main page
Given an user is on the BMI Calculator main page
Then the BMI Calculator main page should be displayed

Scenario: User populates only mass value and BMI calculation request fails

Given an user is on the BMI Calculator main page
When the user populates the form only with value for mass 80 kg
And the user clicks on the Calculate button
Then the user is brought back to BMI Calculator main page
And an error message is displayed: Problem during BMI calculation.

Scenario: User populates only height value and BMI calculation request fails

Given an user is on the BMI Calculator main page
When the user populates the form only with value for height 1.95 m
And the user clicks on the Calculate button
Then the user is brought back to BMI Calculator main page
And an error message is displayed: Problem during BMI calculation.

Scenario: User opens BMI Calculator performs successfull request
Given an user is on the BMI Calculator main page
When the user populates the form with values for mass 50 kg and height 1.99 m
And the user clicks on the Calculate button
Then the user is brought to BMI Result Analysis page
And user's body mass index is 12.625944137573242
And user's weight category is Severely Underweight