object ex07 {
  def main(args: Array[String]) = {
    var n = readInt // how many integers to read
    var sum = 0 // the sum of the even numbers read
    var i = 0 // how many integers read

    while (i < n) {
      var num = readInt
      if (num % 2 == 0)
        sum = sum + num
      i += 1
    }
    println(sum)
  }
}
