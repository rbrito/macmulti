object ex01 {
  def main(args: Array[String]) = {
    var lastread = 1 // any nonzero

    while (lastread != 0) {
      lastread = Console.readInt()
      println(lastread * lastread)
    }
  }
}
