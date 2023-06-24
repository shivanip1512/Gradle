# Gradle JAVA Project

1. gradle init -> application
2. gradle tasks --all
3. gradle compileJava
4. gradle clean
5. gradle test
6. gradle jar
7. gradle run

## **_Gradle dependencies and Repositories:_**

### Dependencies :
'<group-id>:<artifact-id>:<version>'

Que. where does these dependencies come from?
Ans. from repositories

### Repositories :
location from where gradle will pull all libraries/dependencies required for our project.
Once we are done with building projects, we can push our artifact(s) to the repositories also.

_Gradle caches all these dependencies locally._

### ***Gradle Configurations***

| Scopes | Configurations | |
| --- | --- | ---|
| compile | implementation | api (compile) |
| provided | compileOnly |
| runtime | runtimeOnly |
| test | testImplementaion | testCompileOnly, testRuntimeOnly |

##### Examples :

- **CompileOnly** : Dozer, Lombok, JMapper
- **runtimeOnly** : logging-api (compile-time), logging-impl
- **testCompileOnly** : Junit, Jasmine, Mockito
- **testRuntimeOnly** : Jupiter, Jasmine Runtime

**implementation vs api/compile :** "api" would leak transitive dependency in referring project, which was not intended. "implementation" would block this leakage of configuration.

### ***Gradle Build Phases***

Every Gradle build will have 3 phases :
1. **Initialization** - *Lights*
        Figures out Project type (How many modules?) and creates Proj objects. 
        Does by looking onto build.gradle & settings.gradle

2. **Configuration** - *Camera*
        Go through all tasks required to run current build.
        Creates DAG (Direct acyclic graph).

3. **Execution** - *Action*
        Runs our tasks here.
        Compiled, Tested, Jar/War

```groovy
println 'outside task Start...' // executed in configuration phase 
task firstTask{
    println 'Gradle Rocks!'  // executed in configuration phase - NOT task logic
    doFirst(){
       println 'Do First :)' // executed first during execution phase
    }
    doLast(){
       println 'Do Last :}' // executed last during execution phase
    }
}
println 'outside task End...' // executed in configuration phase 
```
Output :
```
> Configure project :JavaProject
outside task Start...
Gradle Rocks!
outside task End...

> Task :JavaProject:firstTask
Do First :)
Do Last :}

BUILD SUCCESSFUL in 1s
1 actionable task: 1 executed
```

### ***Gradle Daemon***
Run this on Server
 ```bash command-line
 gradlew.bat build --daemon
 ```

 ```bash command-line
F:\Projects\Gradle\first-Java-Project>gradlew.bat build --daemon

> Configure project :JavaProject
outside task Start...
Gradle Rocks!
outside task End...

BUILD SUCCESSFUL in 4s
7 actionable tasks: 7 executed
F:\Projects\Gradle\first-Java-Project>gradlew.bat clean

> Configure project :JavaProject
outside task Start...
Gradle Rocks!
outside task End...

BUILD SUCCESSFUL in 1s
1 actionable task: 1 executed
F:\Projects\Gradle\first-Java-Project>gradlew.bat build

> Configure project :JavaProject
outside task Start...
Gradle Rocks!
outside task End...

BUILD SUCCESSFUL in 4s
7 actionable tasks: 7 executed
F:\Projects\Gradle\first-Java-Project>gradlew.bat build

> Configure project :JavaProject
outside task Start...
Gradle Rocks!
outside task End...

BUILD SUCCESSFUL in 1s
7 actionable tasks: 7 up-to-date
```

We can see **build time decreasing** with every build.
Kick-off background deamon : 
 ```bash command-line
 gradlew.bat build --no-daemon
 ```