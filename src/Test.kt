
fun main() {
    variables()
   println(loops(1,2,3,4,5,6))
    val car = Car()
    car.doors = 2
    car.model = "cr-v"
    car.gearType = "automatic"
    car.name = "Honda"
    car.type = "electric"

    var test = initlast("Ang",12)
    test.friend="Appa"

    val user = User("Fredrick Bask",50,"09087654321")
    println("${user.name} is ${user.age}, here is his contact")
    println("summing 2 and 4 ---> ${Calc.sum(2,4)}")
    println("My car is a ${car.name} that has ${car.doors} doors, is ${car.gearType} and is ${car.type} ")
}

fun variables(){
    val ball: String = "football"
    val number: Int = 900000000
    val funds: Double = 50.0
    val aChar: Char = '\n'
    var count: Short = 12345
    count  = count++
    val result = count * funds
    val arr = arrayOf(1,2,3,4,5,6)
   println( arr.map { i->i*2 })
    println(arr.filter { k->k>3 })



    println(ball.compareTo("football"))
    println(result)
    println(arr)
}
fun loops(vararg numbers:Int): String{
    var result = 0
    var res = 0
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

    while (res < 10){
        println(res)
        res++
    }
    var even = 0
    var odd = 0
   for (i in 1..20){
       if (i % 2 == 0){
           even +=1
           continue
       }
       odd += 1
       println("$i is odd")

   }
    println("Total number of even numbers to $even,,,Total number of odd numbers is $odd")

    return  "loop result = $result"
}