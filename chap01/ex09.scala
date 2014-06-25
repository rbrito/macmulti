object ex09 {
  def main(args: Array[String]) = {
    var n = readInt
    var i = readInt
    var j = readInt
    var quant = 0 // quantity of integers printed so far

    var cand = 0 // the next candidate for printing

    // This solution is too stupid
    while (quant < n) {
      if (cand % i == 0 || cand % j == 0) {
        println(cand)
        quant += 1
      }

      cand += 1
    }
  }
}
