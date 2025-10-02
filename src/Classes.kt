class Car{
    var name: String =""
    var model: String =""
    var gearType: String =""
    var doors: Int = 0
    var type: String = ""

    fun stop() {
        println("$name stopped")
    }

    fun move(){
        println("$name is moving")
    }
}

class User(var name: String,var age:Int,var number: String){

    constructor(name:String) : this(name,0,"")
    constructor(name:String,age:Int) : this(name,age,"") {
        this.name = name
        this.age = age
    }
}
class Calc{
    var num:Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }
    companion object{
        fun sum(a: Int,b:Int):Int{
            return a + b
        }
    }
}

class initlast(var name: String,var age:Int){
    lateinit var friend: String
}

//lambda functions
class Button(var title:String,var color:String,var rounded: Boolean, var onClick: ()->Unit)


class ButtonTrigger(var title:String,var color:String,var rounded: Boolean, var onClick: (value: Boolean)-> Boolean)



//Generics
class Shape<T>(val sides:T)

//Data class
data class Profile(var friends:Int,var active: Boolean)