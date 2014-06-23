object ex14 {
  def main(args: Array[String]) = {
    var n = Console.readInt()
    var fpre = 1
    var fcur = 1
    var fprox = fpre + fcur
    var i = 3

    while (i <= n) {
      fprox = fpre + fcur
      fpre = fcur
      fcur = fprox
      i += 1
    }

    println("The " + n + "th Fibonacci number is " + fcur + ".")
  }
}
