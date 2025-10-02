
fun main() {
    variables()
    someData()
    changeOrder()
    println(loops(1,2,3,4,5,6))
    val car = Car()

//    also feature
    val car2 = Car().also {
        it.doors = 2
        it.model = "cr-v"
        it.gearType = "automatic"
        it.name = "Honda"
        it.type = "electric"
    }


//    initializing after first constructor
    var test = initlast("Ang",12)
    test.friend="Appa"

//    creating objects from classes
    val user = User("Fredrick Bask",50,"09087654321")
    println("${user.name} is ${user.age}, here is his contact")
    println("summing 2 and 4 ---> ${Calc.sum(2,4)}")
    println("My car is a ${car.name} that has ${car.doors} doors, is ${car.gearType} and is ${car.type} ")


//    lambda functions
    var login = Button("Login","red",true,  ){  -> println("here") }
    login.onClick()
    val allow = true
    var trigger = ButtonTrigger("Login","red",true,  ){
        it -> it }
    trigger.onClick(allow)

//   generics
    val square = Shape(4)

    println("A Square has ${square.sides} sides")

//      initializing via with function
    with(car2){
        name = "Nissan"
        type = "petrol"
        model = "Ultima"
        doors = 4
        gearType = "manual"

    }

//    let feature for nullable variables
    var name: String? = null

    name?.let {
        println("The value is set as $it")
    }

    var userProfile: Profile? = Profile(30,true)

    val res = userProfile?.run {
        "You have $friends and your account is $active"
    }
    println(res)

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

//Data collection
fun someData(){
    val immutalebArr = listOf(1,2,3)
    val mutableArr =  mutableListOf("a","b","c")
    val uniqueValues = setOf(1,1,2,2,4,3,3)
    val paired = mapOf("Students" to 80, "Cars" to 70)

    for (i in immutalebArr){
        println("immuntable array value $i")
    }
    for (i in mutableArr){
        println("mutable array value $i")
    }
    println("Set functionality $uniqueValues")
    val noOfStudents = paired["Students"]
    println("Key value pairs $noOfStudents")


}

//Ordering Data
fun changeOrder(){
    val newArr = listOf<Int>(1,2,3,4)
    val asc = newArr.sorted()
    val desc = newArr.sortedDescending()
    val customSorting = newArr.sortedBy { it % 3 }
//    it refers to each value iterated through the list i in list

    println("Sorting ascending $asc")
    println("Sorting descending $desc")
    println("Sorting cumtom $customSorting")

}