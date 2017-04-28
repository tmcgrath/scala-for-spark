package com.supergloo

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object Skeleton {

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("Skeleton")
    conf.setIfMissing("spark.master", "local[*]")

    val spark = SparkSession
      .builder()
      .config(conf)
      .getOrCreate()

    import spark.sqlContext.implicits._

    val df2 = spark.sparkContext.parallelize(1 to 100).toDF
    val df3 = df2.map( i => i.getInt(0) + 1)

    df3.collect().foreach(println)

    spark.stop()

  }
}
