object Basics extends App {
  private val number: Int = 2;

  // reassignment is not allowed in Scala
  //  number = 1

  // Type is definition is not mandetry
  private val isTrue = false

  val aString = "I love Scala"
  val bString = "I" + " " + "Love" + " " + "Scala"
  val cString = s"The number is $number and $isTrue" // s cuoate allow us to inject variables into

  // if expression
  val isPositive = if (number > 0) true else false;
  val isPositiveOddNumber =
    if (number < 0) false
    else if (number % 2 != 0) false
    else true;
  println(isPositiveOddNumber)

  // code block
  val codeblock = {
    val localVal = 0;
    localVal + 3;
  }
  println(codeblock)

  //function
  def concatWithSpace(x: Int, y: String): String = {
    x + " " + y
  }
  println(concatWithSpace(5, "Times"))
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)
  println(factorial(5))

}
