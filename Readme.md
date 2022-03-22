#Appium Assignment Information

This is android application Automation test for ApiDemos application. This can be used to test functionality & feature of ApiDemos application 

#Deployment

>_Run the project in CMD_

* Extract the file in the desired location.
* Open Cmd in the project directory.
* Run the following command.


```
mvn clean
mvn install

```
>_Run Project On Eclipse_

* Step 1: Import the project into eclipse
* Step 2: Right click on the project.
* Step 3: Select **Run As**  option.
* Step 4: 
Maven clean
-- Maven test **or** TestNGTest

#Project Information

>_Package Description_

* com.apidemos.pages:Defining all the pages action and respective object repository.
* com.apidemos.utill:contain all utility classes
* com.workinda.test: Defining the base class 
* Features: contain all the feature files for this project
* Hooks: contain hook class 
* StepDef: contain all step definition class corresponding to all the features files 
* Runner: contain test runner class 

>_Folder_

* Application folder contain the application
* logs folder contain log4j file
* Report folder contain extent report
* Screenshots folder contain all the screenshot for failed testcases.
* test-output folder contain report generated from TestNG 
* Resources folder contain configuration properties file and testdata.xlsx file

**Note -** Screenshot folder is created only when any test case got failed otherwise its not created.


 
#Reports & Screenshots

* Extent report gets generated after run project ./Report/extentreport.html
* Screenshot got captured in case of failed test cases ./Screenshots
* TestNG report as "emailable-report.html" gets generated under ./test-output.


#Important Information

>Path for important file
 
 * log4j Properties File:  src/main/resources
 * extent Report Properties File:  src/test/resources
 * Configuration properties File: ./Resources/Config.properties
 * Testdata XL file: ./Resources/Testdata.xlsx

>for changing headless mode

 * Step 1: Go to config.properties File 
 * Step 2: Change HeadlessValue to true/false
 
 **Note -** To run the project on headless mode set **true** & for non headless mode set **false**.
 


 
 

