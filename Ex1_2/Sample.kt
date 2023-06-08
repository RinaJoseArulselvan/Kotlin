
fun main() {
		var i = 0;
		var option=Integer.valueOf(readLine())
		var no=Integer.valueOf(readLine())
			while (i < 10) {
			  if (i == 4) {
				  i++
			    continue
				
			  }
			  println(i)
			  i++
			}
	

	when(option){
		1-> println("this is 1")
		2-> println("this is 2")
		3-> println("this is 3")
		4-> println("this is 4")
		else-> println("this no not exists")
	}
	var result=if(no<5){
		"This number is less than 5"
	}else{
		"This number is greater than or equal to 5"
	}
	println(result)
}

