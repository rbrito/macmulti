object ex01 {
  def main(args: Array[String]) = {
    var n = readInt // number of sequences
    var i = 0 // for each sequence

    while (i < n) {
      var sum = 0
      var num = 0

      do {
        num = readInt
        if (num % 2 == 0)
          sum += num
      } while (num != 0)

      println(sum)

      i += 1
    }
  }
}
