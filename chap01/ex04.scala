object ex04 {
  def main(args: Array[String]) = {
    var x = Console.readInt()
    var n = Console.readInt()
    var res = 1 // result so far

    while (n > 0) {
      res = res * x
      n -= 1
    }
    println(res)
  }
}
