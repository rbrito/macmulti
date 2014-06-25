object ex05 {
  def main(args: Array[String]) = {
    var i = 1 // next day to read
    var max = -1
    var maxday = 0

    while (i <= 31) {
      var x = readInt
      if (x > max) {
        max = x
        maxday = i
      }
      i += 1
    }
    println(max)
    println(maxday)
  }
}
