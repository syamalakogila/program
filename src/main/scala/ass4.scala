object ass4 {
  def main(args: Array[String]): Unit = {
    val x=105
    if(x<100 && x>1000) {
      print("wrong number")
    }
    else
      if(x%2==0){
        val rem=x%3

      print("even"+ " " +rem)}
    else
        {
          val rem=x%2
          println("odd" +" " +rem)
        }




  }

}
