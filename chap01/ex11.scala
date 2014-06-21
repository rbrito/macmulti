object ex11 {
  def main(args: Array[String]) = {
    var p = Console.readInt()

    var cand = 1 // next candidate for divisor
    var divs = 0 // number of divisors found so far

    // The dumbest primality test ever
    while (cand <= p) {
      if (p % cand == 0)
        divs += 1
      cand += 1
    }

    if (divs == 2)
      println(p + " is prime.")
    else
      println(p + " is not not prime.")

  }
}
