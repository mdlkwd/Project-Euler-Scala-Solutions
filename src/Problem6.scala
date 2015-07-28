object Problem6 extends EulerSolver {
  val sumOfSquares = (1 to 100).map(i => Math.pow(i, 2)).sum.toLong
  val squareOfTheSum = Math.pow((1 to 100).sum, 2).toLong

  val answer = squareOfTheSum - sumOfSquares
}