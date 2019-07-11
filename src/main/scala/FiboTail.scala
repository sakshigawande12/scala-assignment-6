
import scala.annotation.tailrec

/**
  * The `fibHelper` code comes from this url: rosettacode.org/wiki/Fibonacci_sequence#Scala
  */
object FibonacciTailRecursive extends App {

  println(fib(7))
  def fib(x: Int): Int = {
    @tailrec def fibbHelper(x: Int, pre: Int = 0, nxt: Int = 1): Int = x match {
      case 0 => pre
      case 1 => nxt
      case _ => println(pre);
        fibbHelper(x - 1, nxt,(nxt+pre))

    }
    fibHelper(x)
  }
}
