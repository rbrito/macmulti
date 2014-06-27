object ex04 {
  def main(args: Array[String]) = {
    var n = readInt // number of sequences
    var sum = 0 // sum of the primes

    while (n > 0) {
      var num = readInt
      var quant = 0 // quantity of divisors found so far
      var cand = 1 // the next candidate for testing

      // This solution is too stupid
      while (cand <= num) {
        if (num % cand == 0)
          quant += 1

        cand += 1
      }
      if (quant == 2) sum += num

      n -= 1
    }

    println(sum)
  }
}
