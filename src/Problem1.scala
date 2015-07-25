object Problem1 extends EulerSolver{
  val answer = (1 until 1000).filter(i => i % 3 == 0 || i % 5 == 0).sum
}
