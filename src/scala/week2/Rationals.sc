object session {

  val x = new Rational(1, 2)


  val y = new Rational(2, 3)

  x.add(y)
  x.neg()


}
class Rational(x: Int, y: Int) {
  def numer = x

  def denom = y

  def add(that: Rational): Unit = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  }

  def neg(): Unit ={
    new Rational(
    -numer,
    -denom)
  }

  override def toString = numer + "/" + denom
}