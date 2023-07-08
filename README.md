# Gradle

This project consists of notes and projects to help you master Gradle. Below are links for the same :
1. Basic Gradle Project: https://github.com/shivanip1512/Gradle/tree/main/first-project#readme
2. Gradle Java Project : https://github.com/shivanip1512/Gradle/tree/main/first-Java-Project#readme


### **_Understanding build.gradle_** :

##### *__Project Object :__*


```
repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit test framework.
    testImplementation 'junit:junit:4.13.2'

    // This dependency is used by the application.
    implementation 'com.google.guava:guava:31.1-jre'
}
```

repositories, dependencies all these are __methods on project__ object but not plugins.
```
project.dependencies ({
    //this is closure
})
```

##### *__Project Properties :__*
Example : println project.name <br>
https://docs.gradle.org/current/dsl/org.gradle.api.Project.html
