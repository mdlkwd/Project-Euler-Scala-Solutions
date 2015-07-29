object Problem20 extends EulerSolver {
  val answer = factorial(100).toString.map(_.asDigit).sum
}
