# TestAutomationUiWeb
## 1. assignment-api-tests project
========================================
This is automation suite is designed to test the Swagger Pet store POST /pet request (Additonal services have also been included but were not essential).

The project has 12 scenarios that that can be located within the feature files: 
 - src/test/resources/OrderTests.feature
 - src/test/resources/PetTests.feature
 - src/test/resources/UserTests.feature  

**OrderTests.feature scenarios include:**

**PetTests.feature scenarios include:**
    
**UserTests.feature scenarios include:**

    
*Important Note:* scenarios need to have the tag **@smokeTest** in order to be included in test executions
```
You will need:
- Java 1.8+ installed (Does not work with Java below 1.8) [I ran it on JDK 11 as well]
- Gradle Installed
- Cucumber Installed
- IntelliJ (Or another Java IDE)
```
**Important: This suite should work on both windows and mac platforms however has only been tested on a Mac. If possible please use a Mac to execute the test suite**

In order to execute the automation suite navigate to the Project directory within a Terminal/CMD window and run the command: **'mvn clean test'**. OR
**'gradle clean test'**

## 2. assignment-api-tests project
========================================

The project has 10 scenarios that that can be located within the feature files:
src/test/java/com/demoqa/features

```
You will need:
- Java 1.8+ installed (Does not work with Java below 1.8) [I ran it on JDK 11 as well]
- Gradle Installed
- Serenity Installed
- IntelliJ (Or another Java IDE)
```

In order to execute the automation suite navigate to the Project directory within a Terminal/CMD window and run the command: **'mvn clean test'**. OR
**'gradle clean test'**

# Test Reports 

https://www.calliope.pro/

https://app.calliope.pro/companies/1172/reports


In addition, Allure Reports plugin was imported. You can view it locally.

assignment-api-tests/build/reports/allure-report
assignment-ui-tests/build/reports/allure-report
