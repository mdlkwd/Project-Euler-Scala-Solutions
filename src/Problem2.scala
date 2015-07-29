///TODO refactor
object Problem2 extends EulerSolver {
  def genFibSeq(fib: List[Int], num1: Int, num2: Int): List[Int] = {
    val next = num1 + num2
    val retList: List[Int] = if (next <= 4000000) {
      genFibSeq(fib :+ next, num2, next)
    } else {
      fib
    }

    retList
  }

  val answer = genFibSeq(List(1, 2), 1, 2).filter(i => i % 2 == 0).sum
}