abstract class Car{  //abstract class
    abstract fun run()  
}

class Honda: Car(){  
   override fun run(){  
println("Honda is running safely..")  
   }  
}

enum class DAYS{	//enum class
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
   
interface Sample{		//interface
	fun method():Unit
}

class SampleImplements{
	fun method(){
		println("This is overrided method")
	}
}

class Firm {
    lateinit var name: String
    lateinit var objective: String
    lateinit var founder: String
}
  

data class User(var name: String, var id: Int, var email: String)  //data  class
	
fun main(){
	val obj2 = Honda()  
	  obj2.run();
	
    when(DAYS.SUNDAY){
        DAYS.SUNDAY -> println("Today is Sunday")
        DAYS.MONDAY -> println("Today is Monday")
        DAYS.TUESDAY -> println("Today is Tuesday")
        DAYS.WEDNESDAY -> println("Today is Wednesday")
        DAYS.THURSDAY -> println("Today is Thursday")
        DAYS.FRIDAY -> println("Today is Friday")
        DAYS.SATURDAY -> println("Today is Saturday")
        // Adding an else clause will generate a warning
    }
	 
	
	  var newObj=SampleImplements()
	  newObj.method()
	
	  val u = User("Ashu", 101, "mymail@mail.com")  //using implicit toString() method of data class
	  println(u)
	
	//Scoped Functions
	
	  var firm:Firm?=null;
	  	
	 firm = Firm().apply{
		  this.name = "msf"   
		  this.founder = "xyz"
		  this.objective = "computer science portal " 
		}
	 println("Firm name is ${firm.name}")
	
	  var e:Int?=2
	  e?.run{
		  println("It is not null")
		  
			}
	
	

	 val list = mutableListOf<Int>(1, 2, 3)
 
    list.also {
        it.add(4)
        it.remove(2)
        // more operations if needed
    }
    println(list)
	
	val founderName: String = with(firm) {
        // 'founder' is returned by 'with' function
        founder    
    }
    println("firms Founder : $founderName")
	
	
	
	
	
	 
}