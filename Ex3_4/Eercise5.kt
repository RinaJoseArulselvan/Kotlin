class College {						//properties
    var name: String = "rina"
    var id: Int = 2
    var city: String = "London"
    var age:Int=0
	    get()=field
	  set(value) {         // setter
            field = value
        }
    
}
class Person {
    companion object {								//companion objects can be called without the use of objects
        fun callMe() = println("I'm called.")
    }
}


object Sample1										//Singleton class can be instantiated only one and have only one object  and no constructor
{
	var age=0
   init 
  {
	 age=21
    println("Singleton class invoked.")
  }
     
  var name = "rina"
	
  fun add(num1:Int,num2:Int):Int
  {
    return num1.plus(num2) 
  }
}


fun main() 
{
	 Person.callMe()
 println("The age is ${Sample1.age}")
 println("The name is ${Sample1.name}")
  println("The answer of addition is ${Sample1.add(3,2)}")
  println("The answer of addition is ${Sample1.add(10,15)}")
	
	// Ranges
	for(a in 1..5){
		print("$a ")
	}
	println()
	for(i in 5 downTo 1)
		print("$i ")
	println()
	for(n in 'a'..'d'){
		print("$n ")
	}
	println()
	for(a in 1..7 step 2)
		print("$a ")
}
  

   
