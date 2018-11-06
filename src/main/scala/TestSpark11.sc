import org.apache.spark.sql.SparkSession

val Spark = SparkSession.builder().appName("test1").getOrCreate()

val df = Spark.read.option("header","true").option("inferschema","true").csv("Sales.csv")

df.printSchema()

