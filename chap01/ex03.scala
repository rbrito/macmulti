object ex03 {
  def main(args: Array[String]) = {
    var n = readInt // we avoid using n choose 2
    var printed = 0 // how many already printed

    while (printed < n) {
      println(2 * printed + 1)
      printed += 1
    }
  }
}
