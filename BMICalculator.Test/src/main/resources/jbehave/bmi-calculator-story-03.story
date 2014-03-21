Meta:
@author          Jose Carvajal
@date:           21.03.2014
@topic:          Behaviour Driven Development with Java
@licence:        Some rights reserved. CC BY 3.0, 2014

Scenario:  Check whether a bmi is Overweight

Given Weight Classifier is started
Then for the calculated bmi value 25.14285659790039, the weight classifier shows: Overweight

Scenario:  Check whether a bmi is Severely Underweight

Given Weight Classifier is started
Then for the calculated bmi value 15, the weight classifier shows: Severely Underweight

Scenario:  Check whether a bmi is UNDERWEIGHT

Given Weight Classifier is started
Then for the calculated bmi value 17, the weight classifier shows: UNDERWEIGHT

Scenario:  Check whether a bmi is NORMAL

Given Weight Classifier is started
Then for the calculated bmi value 20, the weight classifier shows: NORMAL

Scenario:  Check whether a bmi is OBESE_CLASS_1

Given Weight Classifier is started
Then for the calculated bmi value 32, the weight classifier shows: Obese Class I

Scenario:  Check whether a bmi is OBESE_CLASS_2

Given Weight Classifier is started
Then for the calculated bmi value 38, the weight classifier shows: Obese Class II

Scenario:  Check whether a bmi is OBESE_CLASS_3

Given Weight Classifier is started
Then for the calculated bmi value 80, the weight classifier shows: Obese Class III