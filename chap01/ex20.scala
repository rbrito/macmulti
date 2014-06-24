object ex20 {
  def main(args: Array[String]) = {
    for (i <- 1000 to 9999) {
      var n1 = i / 100
      var n2 = i % 100

      if ((n1+n2)*(n1+n2) == i)
        println(i)
    }
  }
}
