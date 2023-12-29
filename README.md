# head-first-java
A repo of me learning java from the Head First Java book

You can purchase a [copy of the book here](https://www.oreilly.com/library/view/head-first-java/9781492091646/).

## Java Version 11

This repo assumes you are using Java 11. However, if you’re using Java 8, you will find most of the code still works.

## Managing Java Versions using SDKMAN

This repo uses [sdkman](https://sdkman.io/usage) to handle Java versions.

### Install instructions

To install, please [follow these instructions](https://sdkman.io/install). When I run `sdk version`, here's what I see:

```text
SDKMAN!
script: 5.18.2
native: 0.4.3
```


Afterwards, install this project's version of Java by running this command.

```bash
# download the exact version needed from the .sdkmanrc file
sdk env install
```

### Auto switch SDK versions

Do you want to switch SDK versions automatically when you cd into a directory? This can be done by setting the `sdkman_auto_env=true` in the SDKMAN configuration located here `~/.sdkman/etc/config`. Note that this will also reset any project-specific SDKs to their default version when leaving the directory.

