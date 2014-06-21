object ex12 {
  def main(args: Array[String]) = {
    var a = Console.readInt()
    var b = Console.readInt()
    var r = b

    while (b != 0) {
      r = a % b
      a = b
      b = r
    }

    println(a)
  }
}
