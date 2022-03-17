# WebDriver-framework-on-Java

Finally finishing touch. :blush:

This moment has come, I' m one heartbeat away from job searching, I'm a tester! :office_worker:

## Requirements of the task

The task is to build a framework for automating Hardcore tasks from the [WebDriver course](https://github.com/eerty1/Selenium-WebDriver-on-Java.git).

What the framework should contain:

* Webdriver manager funcions

* Page Object / Page Factory for Page abstractions

* Model for business objects (package called module, it can, for example, create a user for loggining, in my framework it does "number of instances and purpose for these instances".

* Properties with test data for different environments (at least 2)

* Xml suites for smoke tests and all tests (unfortunately I have only one test and it is impossible to implement this task)

* When the test fails, a screenshot with the date and time should be taken

* The framework should be able to run with Jenkins and browser parameterization, test suite, environment. Test results should be on the job graph, screenshots should be archived as artifacts.

## Installation

You are proposed to use Java 8. :trophy:

![This is an image](https://i.ibb.co/LNW93hG/javaversion.png)

Also It is important to use proper version of WebDriver.

Developing this project, I was using **99.0.4844.51**. It is the latest stable release for **17.03.2022**.

The dependency is: 

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->

        <dependency>
             <groupId>org.seleniumhq.selenium</groupId>
             <artifactId>selenium-java</artifactId>
             <version>4.1.1</version>
        </dependency>

[This is a link to see the screenshots of my POM.xml](https://ibb.co/album/9ZjWVn).

It is essential to say about correct Maven version.

![This is an image](https://i.ibb.co/kSLL33z/image.png)

There're the steps to unpack my project: 

* git clone WebDriver-Framework-on-Java

* Open it via your IDE

## Usage

Run from command line: 

    mvn -Dbrowser=chrome -Dsurefire.suiteXmlFiles=src\test\resources\testng.xml -Denvironment=dev clean test

[This is the structure of my project, hope it will help you to figure out what is going on](https://i.ibb.co/ySnZMq6/structureframework.png)

Make sure, that dependencies're correct.

## Other
 
All the materials were taken from the [EPAM Automated Testing course](https://training.epam.com/#!/Training/3044?lang=en). :test_tube:

The backup of the tasks could be found [there](https://github.com/vitalliuss/automation-training.git), in file "backup.md". :file_folder:

Unfortunately they provided only RU verion of the requirements.