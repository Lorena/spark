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
    scenario("basic test case") {
      import spark.implicits._

      val data_set = Seq("lorena", "maira").toDS()
      val actual = data_set.countByWord(spark)
      val data_set_expected = Seq(("maira", BigInt(1)),("lorena", BigInt(1))).toDS()
      val result = data_set_expected.except(actual)
      (result.count() === 0) should be(true)

    }

    ignore("should not aggregate dissimilar words") {}

    ignore("test case insensitivity") {}
  }

  feature("Sort Words") {
    ignore("test ordering words") {}
  }

}
