# **Multi-Module Gradle Project**

1. Create multiple modules inside project and add them in `settings.gradle` file.
2. To execute task under subproject use : `gradle :<subProject>:<task>`<br> For example : ```F:\Projects\Gradle\couponapp>gradle :web:build```
3. make root task available to all subproject by `allprojects` method.
4. make task available only to subprojects by `subprojects` method.