# Chapter 1. Breaking the Surface: Dive in: A Quick Dip

This chapter is the introductory chapter of the book.

## Make sure you are in this directory

Then you can run

```bash
# compile the .java file into bytecode
javac Dog.java
# view the compiled code
javap -c Dog.class
# run the program by starting the JVM and translating the bytecode
java Dog
```

## Understanding how this works

Running a program means telling the Java Virtual Machine (JVM) to “Load the desired class, then start executing its `main()`` method. Keep running ’til all the code in main is finished.”