object ex13 {
  def main(args: Array[String]) = {
    var n = Console.readInt()
    var sum = 0

    for (i <- 1 until n) {
      if (n % i == 0)
        sum += i
    }

    if (sum == n) println(n + " is perfect")
    else println(n + " is not perfect")
  }
}
