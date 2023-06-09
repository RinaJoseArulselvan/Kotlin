data class Data(val name:String,val age:Int)
   
// A function returning two values
fun sendData():Data{
    return Data("Jack",30)
}
   
fun main(){
    val obj = sendData()
    //  Using instance to access properties
    println("Name is ${obj.name}")
    println("Age is ${obj.age}")
   
    // Creating two variables using  destructing declaration
    val (name,age) = sendData()
    println("Name is $name")
    println("Age is $age")
   
}