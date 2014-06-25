object ex08 {
  def main(args: Array[String]) = {
    var n = readInt
    var res = 1 // the partial result of n! so far
    var i = 1

    while (i <= n) {
      res = res * i
      i += 1
    }
    println(res)
  }
}
