val x = new Rational(1, 3)
val y = new Rational(5, 7)
val z = new Rational(3, 2)
val sumXY = x+ z
x
-x

val sub = x- y - z
y + y
x < y
x max y
class Rational(x: Int, y: Int) {
  require( y > 0 , "Y to be >0")
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def numer = x
  def denom = y
  def < (that: Rational) = this.numer * that.denom < that.numer * this.denom
  def max(that: Rational) = if (this < that) that else this
  def + (r: Rational) = {
    new Rational(numer * r.denom + r.numer * denom,
      denom * r.denom)
  }
  def unary_- : Rational = new Rational(
      -numer, denom)

  def - (that: Rational) = {
    this + -that
  }


  override def toString = numer/ gcd(x, y) + "/" + denom / gcd(x, y)
}