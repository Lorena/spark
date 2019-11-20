package thoughtworks.wordcount

import org.apache.spark.sql.{Dataset, SparkSession}

object WordCountUtils {
  implicit class StringDataset(val dataSet: Dataset[String]) {
    def splitWords(spark: SparkSession) = {
      import spark.implicits._
      dataSet.flatMap( x => (x.toLowerCase().split("[\\s.,;/\\\\\"-]+")))
    }

    def countByWord(spark: SparkSession): Dataset[(String, BigInt)] = {
      import spark.implicits._
      import org.apache.spark.sql.functions.asc
      dataSet.groupBy("value").count().orderBy($"value".asc).as[(String, BigInt)]
    }
  }
}