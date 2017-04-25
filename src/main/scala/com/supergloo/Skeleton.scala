package com.supergloo

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext

object Skeleton {

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("Skeleton")
    conf.setIfMissing("spark.master", "local[*]")

    val spark = new SparkContext(conf)
    val sqlContext = new SQLContext(spark)

    import sqlContext.implicits._

    val df2 = spark.parallelize(1 to 100).toDF
    val df3 = df2.map( i => i.getInt(0) + 1)

    df3.collect().foreach(println)

    readLine()
    spark.stop()

  }
}
