# **Gradle**

This project consists of notes and projects to help you master Gradle. Below are links for the same :
1. Basic Gradle Project: https://github.com/shivanip1512/Gradle/tree/main/first-project#readme
2. Gradle Java Project : https://github.com/shivanip1512/Gradle/tree/main/first-Java-Project#readme


## **_Understanding build.gradle_** :

#### *__Project Object :__*


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
1. https://docs.gradle.org/current/dsl/org.gradle.api.Project.html
2. https://docs.gradle.org/current/userguide/writing_build_scripts.html

##### _Adding Custom Properties :_
Example : project.ext.myprop = "Custom property" <br>

#### *__Task Object :__*

Task task = new compile() <br>
project.addTask(task)

```
 project.task (firstTask){
    println 'Gradle Rocks!!'
 }
 
 >>gradlew.bat fT
```

All tasks by default executes at cofiguration phase.<br>
Inorder to make them execute at build stage, wrap them **around doLast** method.
<br><br>
 Link tasks : ```dependsOn``` and ```finalizedBy```
 ```
 task deployToStage{
    println "Deployed to Stage conf"  // at configuration stage
   doLast{
      println "Deployed to Stage"   // at build stage
   }
 }

 task deployToProd{
   doLast{
      println "Deployed to Prod"   // at build stage
   }
 }

 task cleanupFiles{
   doLast{
      println "Cleaned-up Files"   // at build stage
   }
 }

 deployToProd.dependsOn deployToStage
 deployToProd.finalizedBy cleanupFiles
 ```
