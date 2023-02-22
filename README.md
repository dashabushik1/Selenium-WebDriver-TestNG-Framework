# Selenium WebDriver TestNG Framework

****
The object of testing is the Book Store Application test application (https://demoqa.com/books).
API of the test application - https://demoqa.com/swagger/.

### **Stack & Libraries**

****

* Java
* TestNG
* Maven
* Selenium WebDriver

### **Prerequisites**

****

* IntelliJ IDEA CE
* JDK (version 7)
* Maven configuration

### **Mandatory requirements**

****

* The description of the UI part in the code should be performed using the Page Object pattern
* Run tests with Chrome browser support
* Use the WebDriver Manager library
* The main actions in the test should be accompanied by logging using any logger of your choice (Log4j or any other)

### **Project components**

****

* Page objects are in the directory src/main/java/pages
* Test classes are in the the directory src/test/java/tests
* Listener class is in the directory src/main/java/util

### **Highlights**

****

* This framework supports Chrome browser
* This uses WebDriver Manager, an open source browser binary manager. WebDriver Manager automatically checks the latest
  version of the browser downloaded on your machine and downloads the required driver binary into the cache, eliminating
  the need to manually download and store binary files.

### **Task completion criteria**

****

* Post the result of the work on GitHub
* The repository must have the Public access level
* The task code must be compiled successfully and run after downloading

### **Tasks**

#### **Task 1**

****
Check the main functionality of the login (the ability to log in) in the Book Store Application web
application - https://demoqa.com/books .
It is possible to create a user directly for the test using an existing application API.

#### **Task 2**

****
Check that the list of books on the Book Store page matches the list of books from the response API. To solve the
problem, use the existing list of books that is presented in the appendix (https://demoqa.com/books ). Compare books by
name (Title).