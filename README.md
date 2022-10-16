# Gradle Java Modules

- Modules are defined using JPMS and Gradle SourceSets;
- More powerful module isolation;
- Need to specify dependencies "twice", once on Gradle and another on the module-info;
- May be annoying since if the module does not have a dependency declared it won't even suggest completion;
- Single Gradle project;