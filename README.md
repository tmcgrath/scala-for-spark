# Scala for Apache Spark Material

## Overview
This repo is used in Scala for Spark tutorials available at https://www.supergloo.com/courses/scala-spark-course/

The tutorials are designed for those new to Scala, but familiar with programming in other languages.  Further, it's presumed there is an interest in learning Scala in order to use Apache Spark.  

This course will teach you to become productive and confident in Scala.  Again, for emphasis, the course focus is Scala condensed for Apache Spark.  We're not going to cover every possibility with Scala.  If your need is in-depth Scala, then this is not the course for you.  This course will prepare you to become productive with Scala and Apache Spark.

The course is opinionated in it's use of free Community Edition of IntelliJ.  This repo provides a Spark project setup which works in IntelliJ and beyond. 

The accompanying screencasts to this repo demonstrate a variety of hands-on examples.  The screencasts also prepare and configure your own development environment in the free IntelliJ Community Edition.

See the links above for access to the screencasts.

## Notes

## Debugging in IntelliJ

Screencasts cover how to debug in IntelliJ.  If you search elsewhere, you may find references similar to the following

`export SPARK_SUBMIT_OPTS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005`

and using a Remote debugger.  That's cool and works well when doing remote debugging; i.e. attach debugger to Spark code running on your cluster.  Screencasts demonstrate this and other options as well.


## Building and Running a Jar
To build a deployable jar example

1. sbt assembly
2. Make sure your cluster is running and issue something similar to following:

```
~/Development/dse/spark-submit --class com.supergloo.YourClassName --master spark://master ./target/scala-2.10/NAME-1.0.jar
```

replace `master` variable with appropriate value for your environment

call `spark-submit` with path appropriate for your environment
