class Company {
    var name: String = ""
        get() = field        // getter
        set(value) {         // setter
            field = value
        }
}

sealed class Demo {   //sealed class
    class A:Demo(){
        fun display(){
            println("Subclass A of Sealed class Demo ")
        }
    }
    class B:Demo(){
        fun display(){
            println("Subclass B of sealed class Demo")
        }
    }
}


fun main() {
    val c = Company()
    c.name = "rina jose"  // access setter
    println(c.name)           // access getter
	
	//nullability
	
	var str: String? = null
	var str1: String? = "hello"  
	println(str1) 
	var str2: String? = "May be declare nullable string"  
	var len1:  Int = str ?.length ?: -1  
	var len2:  Int = str2 ?.length ?:  -1  
  
	println("Length of str is ${len1}")  
	println("Length of str2 is ${len2}")
	
	 val obj =Demo.B()
	  obj.display()
      val obj1=Demo.A()
      obj1.display()
}