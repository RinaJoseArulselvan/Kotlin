
fun factorial(n: Int): Int {  
    return if(n == 1){  
          n 
    }  
    else{  
        n*factorial(n-1)  
    }
}	
fun sample(n1:Int,n2:Int):Int{
	return n1+n2
}

fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){   //Higher Order Function
    val sum = a + b  
    mylambda(sum) 
}

inline fun inlineFunction(myFun: () -> Unit ) {  
				myFun()
	for(i in 1..5)
		println("This is $i")  
}

 fun main() {
	   val number = 5  
	   val result: Int  
	   result = factorial(number)  
	   println("Factorial of $number = $result")
	   println("Enter the two numbers")
	   var n1 = Integer.valueOf(readLine())
	   var n2 = Integer.valueOf(readLine())
	   println(sample(n1,n2))
	    val myLambda: (Int) -> Unit= {s: Int -> println(s) } //lambda function  
	    addNumber(5,10,myLambda)
	    myLambda(2)
	   inlineFunction({println("This is sampleFunctions")})
}  
  