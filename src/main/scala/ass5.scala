object ass5 {
  def main(args: Array[String]): Unit = {
    val a=23
    if(a<0 && a>100) {
      print("Invalid number")
    }
    else if(a>=90 && a<=100)
      print("Super smart")
    else if(a>=80 && a<=90)
      print("smart")
    else if(a>=70 && a<=80)
      print("smart enough")
    else if(a>=60 && a<=70)
      print("Just smart")
    else if(a>=35 && a<=60)
      print("no smart")
    else if(a>=0 && a<=35)
      print("dump")
  }

}
