package sc.knoldus.spec

object Specs {
  def main(args:Array[String]): Unit ={
    val n=9
    table(n)
    max((9 to 18).toList)
    salary()
    frequency()
  }
def table(n:Int): Unit = {
val x:List[Int] = (0 to 10).toList
  val mul:List[Int] = x.map(element => element * n)
  println(mul)
}
  def max(xs:List[Int]) {
    val list2 : List[Int] = xs.sorted
    for(i<-0 until 9){
      if(i<5)  {
        println(list2(i))}
      else println(list2(i) * 5)
      }
    }
  def salary(): Unit = {
    val m : Map[String, Int] = Map("EMP1" -> 30000, "EMP2" -> 35000, "EMP3" -> 40000, "EMP4" -> 50000)

    println(m.filter(element=> element._2 > 35000 && (0.75 * element._2)>25000))
  }
  def frequency(): Unit ={
    val str: String = "i am indian"
    val map = scala.collection.mutable.HashMap.empty[Char, Int]
    for (symbol <- str) {
      if (map.contains(symbol)) {
        map(symbol) = map(symbol) + 1
      }
      else {
        map.+=((symbol, 1))
      }
      map.remove(' ')
    }
    println(map)
  }

}

