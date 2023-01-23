# Java TDD Starter
A sample project for getting started with TDD in Java.

The file _src/test/java/CalculatorTest.java contains one test case and a few in comments.
Start by coming up with a few test cases and add them to the lists,
then implement them one at a time,
test-driving the solution forwards.

## Tools

Uses Gradle for the build system and JUnit 5 as the test runner.

Run the tests with:
```shell
./gradlew test
```

If you want to rerun passed tests for some reason you may need to run 
```shell
./gradlew cleanTest
```

first since Gradle caches the test results.


For another example check out the [JUnit 5 Gradle sample](https://github.com/junit-team/junit5-samples/tree/main/junit5-jupiter-starter-gradle)
from the JUnit project.


