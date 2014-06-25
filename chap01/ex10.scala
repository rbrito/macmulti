object ex10 {
  def main(args: Array[String]) = {
    var n = readInt

    var i = 0

    while (i * (i+1) * (i+2) < n)
      i += 1

    if (i * (i+1) * (i+2) == n)
      println(n + " is such product.")
    else
      println(n + " is not such product.")

  }
}
