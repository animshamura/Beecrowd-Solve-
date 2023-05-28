import java.util.*;
fun main(args: Array<String>) {
    var t:Int = readLine()!!.toInt()
    var i:Int = 1
    while(i<=10){
        var m:Int = i*t
        println("$i x $t = $m")
        i+=1
    }
}
