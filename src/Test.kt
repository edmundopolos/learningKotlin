
fun main() {
    variables()
   println(loops(1,2,3,4,5,6))
}

fun variables(){
    val ball: String = "football"
    val number: Int = 900000000
    val funds: Double = 50.0
    val aChar: Char = '\n'
    var count: Short = 12345
    count  = count++
    val result = count * funds
    val arr: Array<Int> = arrayOf(1,2,3,4,5,6)
   println( arr.map { i->i*2 })
    println(arr.filter { k->k>3 })



    println(ball.compareTo("football"))
    println(result)
    println(arr)
}
fun loops(vararg numbers:Int): String{
    var result = 0
    val res = 0
    for(number in numbers){
        result += number

    }
    numbers.forEach { i->println(i) }
    for (i in 1..12){
        println(i)
    }
    for (i in 1 until 12){
        println(i)
    }
    for (i in 10 downTo  2){
        println(i)
    }

    return  "loop result = ${result}"
}