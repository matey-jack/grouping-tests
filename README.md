grouping-tests
==============

_Playground project to test different ways of grouping tests._

Integration and system tests of large systems often are rather slow and sometimes are rather instable. 

Often it is helpful to run different tests in separate build configurations in order to run faster tests more often and to more easily debug instable tests.

We try to make each way of grouping tests available on the command line as well as in TeamCity and if possible also in the IDE.

This project aims to try out and showcase several ways of grouping your tests:
 - using filename patterns such as *Test.java and *IT.java
 - using packages such as org/myproject/integrationtests/**
 - using JUnit Tests Suites
 - using JUnit Categories

There are some other good ways to separate tests which are out of scope of this trial project:
 - putting some tests into a separate Maven module
 - others that I haven't thought of yet
