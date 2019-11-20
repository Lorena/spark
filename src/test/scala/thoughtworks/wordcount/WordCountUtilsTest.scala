package thoughtworks.wordcount

import WordCountUtils._
import org.apache.spark.sql.Dataset
import thoughtworks.DefaultFeatureSpecWithSpark


class WordCountUtilsTest extends DefaultFeatureSpecWithSpark {
  feature("Split Words") {
    scenario ("test splitting a dataset of words by spaces") {



    }

    ignore("test splitting a dataset of words by period") {}

    ignore("test splitting a dataset of words by comma") {}

    ignore("test splitting a dataset of words by hypen") {}

    ignore("test splitting a dataset of words by semi-colon") {}
  }

  feature("Count Words") {
    ignore("basic test case") {

//      import spark.implicits._
//
//      val data_set = Seq("Lorena Maira Maira Lorena").toDS()
//      data_set.countByWord(spark)
    }

    ignore("should not aggregate dissimilar words") {}

    ignore("test case insensitivity") {}
  }

  feature("Sort Words") {
    ignore("test ordering words") {}
  }

}
