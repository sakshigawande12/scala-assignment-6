class Area {


  //def funS((Int):Int,x:Int,y:Int)={


  //}
}

object Area extends App
{

  def sumOfSquare(f:(Int, Int) => Int,a: Int, b:Int): Int={
    f(a*a,b*b)
  }

  def sumOfCubes(function: (Int, Int) => Int, n1:Int, n2:Int)={
    function(n1*n1*n1,n2*n2*n2)

  }

  def sumOfInts(function: (Int, Int) => Int, num1:Int,num2:Int)={
    function(num1,num2)
  }

  println("sum of square=")

  println(sumOfSquare((a,b)=>a+b,2,3))

  println("sum of cubes =")
  println(sumOfCubes((a,b)=>a+b,2,3))
  println("sum of ints =")
  println(sumOfInts((a,b)=>a+b,2,3))


}