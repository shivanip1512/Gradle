# Gradle JAVA Project

1. gradle init -> application
2. gradle tasks --all
3. gradle compileJava
4. gradle clean
5. gradle test
6. gradle jar
7. gradle run

## _Gradle dependencies and Repositories:_

### Dependencies :
'<group-id>:<artifact-id>:<version>'

Que. where does these dependencies come from?
Ans. from repositories

### Repositories :
location from where gradle will pull all libraries/dependencies required for our project.
Once we are done with building projects, we can push our artifact(s) to the repositories also.

_Gradle caches all these dependencies locally._

### Gradle Configurations

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


