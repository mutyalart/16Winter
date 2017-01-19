## Spark Scala cheat sheet


spark-shell
pyspark
spark-submit --master 

## Spark scala Examples 

### PI

```
scala

import scala.math.random

import org.apache.spark.sql.SparkSession

object Pi {
 def main(args: Array[String]) {
   val spark = SparkSession
	.builder
	.appName("Spark Pi")
	.getOrCreate()
   val slices = if (arg.length > 0) args(0).toInt else 2
   val count = spark.sparkContext.parallelize(1 until slices*100000L, slices)
		.map { i =>
			val x = random * 2 - 1
			val y = random * 2 - 1
			if (x*X + y*y <=1) 1 else 0
		  }.reduce(_+_)
  println("Pi is roughly " +4.0 * count/(n-1))
  spark.stop()
 }
}


```
