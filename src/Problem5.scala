object Problem5 extends EulerSolver {
  def divisibleByOneThroughTwenty(num: Int) = {
    (1 to 20).filter(i => num % i == 0).length == 20
  }

  def findFirstDivisibleNum(num: Int): Int = {
    val check = num + 1
    divisibleByOneThroughTwenty(check) match {
      case true => return check
      case false => findFirstDivisibleNum(check)
    }
  }

  val answer = findFirstDivisibleNum(20)
}