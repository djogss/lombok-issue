# lombok-issue

# JAVA version
#### $ `java -version`                                                                                                                                                                                                                            <<<

```
  openjdk version "15-ea" 2020-09-15
  OpenJDK Runtime Environment (build 15-ea+21-975)
  OpenJDK 64-Bit Server VM (build 15-ea+21-975, mixed mode, sharing)
```

# Gradle version
$ `./gradlew --version`                                                                                                                                                                                                                        <<<
```
------------------------------------------------------------
Gradle 6.3
------------------------------------------------------------

Build time:   2020-03-24 19:52:07 UTC
Revision:     bacd40b727b0130eeac8855ae3f9fd9a0b207c60

Kotlin:       1.3.70
Groovy:       2.5.10
Ant:          Apache Ant(TM) version 1.10.7 compiled on September 1 2019
JVM:          15-ea (Oracle Corporation 15-ea+21-975)
OS:           Mac OS X 10.15.4 x86_64

```

# Command line steps to get `java.lang.StackOverflowError` error
* `./gradlew clean compileJava`

# Steps to working example #1 (Removing lombok dependencies)
* Checkout branch `working-example-1`
* `./gradlew clean compileJava bootJar`
* `java -jar build/libs/demo-0.0.1-SNAPSHOT.jar com.example.demo.DemoApplication`

# Steps to working example #2 (Reducing size of the method)
* Checkout branch `working-example-2`
* `./gradlew clean compileJava bootJar`
* `java -jar build/libs/demo-0.0.1-SNAPSHOT.jar com.example.demo.DemoApplication`

