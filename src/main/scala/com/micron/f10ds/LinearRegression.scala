package com.micron.f10ds

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.ml.linalg.{Vectors,VectorUDT}



object LinearRegression extends App {
  val sc = new SparkContext(new SparkConf().setAppName("NewSparkApp").setMaster("local[*]"))
  val rdd = sc.parallelize(Seq(1,2,3,4,5))

  /*println(rdd.count())
  val amount = 100
  val myAge = f"I completed my $amount%.2f"
  println(myAge)
  */
 /* for(num <- Range(0,10)){
    if(num%2==0){
      println(s"$num is even")
    }else{
      println(s"$num is odd")
    }
  }*/

  def isEven(num1:Int) = num1%2==0

  println(isEven(10))
  println(isEven(13))
}
