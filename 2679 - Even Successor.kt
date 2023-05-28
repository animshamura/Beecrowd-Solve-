import java.util.*;
fun main(args: Array<String>) {
  var a:Int = readLine()!!.toInt()
  var b:Int = a%2
  if(b==0) println(a+2)
  else println(a+1)
}
