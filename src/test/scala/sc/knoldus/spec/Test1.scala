package sc.knoldus.spec

  import org.scalatest.flatspec.AnyFlatSpec
  import org.scalatest.matchers.should.Matchers

  class Test1 extends AnyFlatSpec with Matchers{
    "A specs table method" should "add two numbers" in {
      Specs.table(9) shouldBe (0,9,18,27,36,45,54,63,72,81,90)
    }

    "AA specs max method " should "should find first 5 max elements and multiply them by 5 " in {
      Specs.max((9 to 18).toList) shouldBe (9,10,11,12,13,70,75,80,85,90)
    }
    "A specs salary method" should "show employee whose sal is more than 35000 and take home more than 25000 " in {
      Specs.salary() shouldBe "EMP3 -> 40000,EMP4->50000"
    }
    "A specs frequency method" should "find frequency of each character " in {
      Specs.frequency() shouldBe "HashMap(a -> 2, d -> 1, i -> 3, m -> 1, n -> 2)"
    }

}
