abstract class EulerSolver {
  def answer: Any

  def factorial(num: Int): BigInt = {
    if (num == 0) 1
    else num * factorial(num - 1)
  }

  def main(args: Array[String]) {
    println(answer)
  }
}
