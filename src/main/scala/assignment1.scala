import scala.collection.immutable.Range.Int

object assignment1 {

  def main(args: Array[String]): Unit = {
    val a = 14
    val positive = 0
    if (a % 2 == 0)
      print(a)
    else if (a > 0)
      print(positive)
    else
      print()
  }
}