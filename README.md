BDD-JBehave-LAB
===============
In order to run Selenium tests, it is required:
- Run the web app on a web server such as Tomcat. 
- Create a firefox profile
	* Type “firefox.exe -ProfileManager -no-remote”
	* Select “Create Profile” (i.e. selenium)
	* Click “Finish”
	* Add -firefoxProfileTemplate command line option as you start the Selenium Server
- Run the Selenium RC Server (download from http://docs.seleniumhq.org/download/).
  Ex: java -jar selenium-server.jar -firefoxProfileTemplate "[YOUR_TEMPLATE_FOLDER]"
- Execute WebBmiCalculatorStories such as another JUnit test using your IDE.
