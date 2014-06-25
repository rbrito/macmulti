object ex02 {
  def main(args: Array[String]) = {
    var n = readInt // we avoid using n choose 2
    var i = 0
    var sum = 0

    while (i < n) {
      sum += i
      i += 1
    }

    println(sum)
  }
}
