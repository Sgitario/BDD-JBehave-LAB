Meta:
@author          Jose Carvajal
@date:           21.03.2014
@topic:          Behaviour Driven Development with Java
@licence:        Some rights reserved. CC BY 3.0, 2014

Scenario:  Simple BMI calculator validation used for MultipleStories embedder example (1)

Given a body mass index calculator
When a patient is with mass 90 kg and height 1.80 m
Then patient's body mass index is 27.777780532836914

Scenario:  Simple BMI calculator validation used for MultipleStories embedder example (2)

Given a body mass index calculator
When a patient is with mass 85 kg and height 1.85 m
Then patient's body mass index is 24.83564567565918

Scenario:  Simple BMI calculator validation used for MultipleStories embedder example (3)

Given a body mass index calculator
When the user pass to the calculator a value for mass 85 kg
When the user pass to the calculator a value for height 1.85 m
Then the calculator shows that the value for the users's body mass index is 24.83564567565918