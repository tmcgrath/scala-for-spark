# Scala for Apache Spark Training

## Debugging in IntelliJ

export SPARK_SUBMIT_OPTS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005
 (or just add to SBT Console)

## Notes
To build a deployable jar example

1. sbt assembly
2. Make sure your cluster is running and issue something similar to following:

```
~/Development/dse/spark-submit --class com.supergloo.YourClassName --master spark://master ./target/scala-2.10/NAME-1.0.jar
```

replace `master` variable with appropriate value for your environment

call `spark-submit` with path appropriate for your environment
