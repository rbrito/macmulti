object ex12 {
  def main(args: Array[String]) = {
    var a = readInt
    var b = readInt
    var r = b

    while (b != 0) {
      r = a % b
      a = b
      b = r
    }

    println(a)
  }
}
