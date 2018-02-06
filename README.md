# gadgets.shrewd.core
A core library containing the sample classes and functions for the challenge.

## Overview
A primary goal in software craftsmanship and engineering is to make small, reusable code
elements that many projects can leverage, thus multiplying the long term benefit of investing
in quality code writing.

I built this library to contain the three central pieces of the outline:
 - Reverse the words in a sentence.
 - Find the common characters between two strings.
 - Implement a stack unit.
 
This library is designed to incorporated into an interactive module: a RESTful API, a 
command-line utility, etc.

### Usage
While the unit tests exercise the functions independently, I have authored a sample 
Java application that leverages them as a dependency within a larger project.

Within the [GUI](https://github.com/Shrewd-Gadgets/gadgets.shrewd.gui) project you can find:
 - Sentence reversal used by the [Scrambler]() pane.
 - Common character isolation in the [Commoner]() pane.
 - Stackable Decks in the [War card game simulator]() pane.

## Installation
Since Shrewd Gadgets does not have it's own remote Maven repository developers will need
to install the library into their local Maven repository manually.

To install locally:
 - Install the parent POM locally; for more details visit the [README](https://github.com/Shrewd-Gadgets/gadgets.shrewd.maven).
 - Clone this [repository](https://github.com/Shrewd-Gadgets/gadgets.shrewd.core) onto you local machine.
 - Navigate into the root of the project; this is directory containing the `pom.xml` file.
 - Build and install this component
 ```bash
 [user@localhost:~/gadgets.shrewd.maven] mvn clean install
 ```
 
 This will add the compiled JAR to your local Maven repository.
 
 ### Tests
 To run the tests outside of installation:
  - Navigate into the root of the project; this is directory containing the `pom.xml` file.
  - Use Maven to run the tests
   ```bash
    [user@localhost:~/gadgets.shrewd.maven] mvn clean install
   ```
  - Review test results
  ```bash
  [INFO] Scanning for projects...
  [INFO]
  [INFO] ------------------------------------------------------------------------
  [INFO] Building core 1.1.0
  [INFO] ------------------------------------------------------------------------
  ...
  -------------------------------------------------------
   T E S T S
  -------------------------------------------------------
  Running gadgets.shrewd.core.util.Words_ReverseTest
  Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.046 sec
  Running gadgets.shrewd.core.util.Words_IntersectionTest
  Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.065 sec
  
  Results :
  
  Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
  
  [INFO] ------------------------------------------------------------------------
  [INFO] BUILD SUCCESS
  [INFO] ------------------------------------------------------------------------
  [INFO] Total time: 1.824 s
  [INFO] Finished at: 2018-02-05T22:24:51-05:00
  [INFO] Final Memory: 18M/303M
  [INFO] ------------------------------------------------------------------------
  ```

 
