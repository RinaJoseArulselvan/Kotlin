open class Base() {  
var a = 1 // public by default  
    private var b = 2 // private to Base class  
    protected open val c = 3  // visible to the Base and the Derived class  
    internal val d = 4 // visible inside the same module i.e the eclipse project   
    protected fun e() { } // visible to the Base and the Derived class  
}  
  
class Derived: Base() {  
    // a, c, d, and e() of the Base class are visible  
    // b is not visible
    override val c = 9 // c is protected  
}


fun exceptions():Unit{
	
	   try {  
        val a = IntArray(5)  
        a[5] = 10 / 1
    } catch (e: ArithmeticException) {  
        println("arithmetic exception catch")  
    } catch (e: ArrayIndexOutOfBoundsException) {  
        println("array index out of bounds exception")  
    } catch (e: Exception) {  
        println("parent exception class")  
    }finally{
		   println("it will be executed")
				}  
}

fun validate(age: Int) {  
    if (age < 18)  
        throw ArithmeticException("under age")  
    else  
        println("eligible for drive")
}


//List
fun listMethods():Unit{
	var list1 = listOf<Int>(1,2,3)
	var list2 = mutableListOf<Int>(1,2)
	var l = arrayListOf<String>()
	for( i in list1.indices){
		println(list1[i])
	}
	println(list1.get(2))
	println(list1.contains(23))
	
	list2.add(2)
	list2.add(3)
	list2.add(4)
	println(list2)
	list2.drop(1)
	println(list2)
	list2.remove(2)
	list2.removeAt(1)
	println(list2)
	
	list2.addAll(list1)
	println(list2)
	
	l.add("rina")
	l.add("subh")
	l.add("gill")
	l.add("subh")
	
	println(l.lastIndexOf("subh"))
	println(l.indexOf("rina"))
	println(list2.clear())
	
}

fun mapMethods():Unit{
	var map= mapOf<Int,String>(1 to "rina" ,2 to "jose",3 to "kav",4 to "tho")
	var hMap = hashMapOf<Int,Int>()
	println(map.get(1))
	println(map.containsValue("rina"))
	
    for(key in map.keys){  
        println("Element at key $key = ${map.get(key)}")  
    }
	 println(map.getOrDefault(3, "Vijay"))  
	
	hMap.put(1,1000)
	hMap.put(2,2000)
	hMap.put(4,3000)
    for(i in hMap.keys){
		println(hMap[i])
	}
    hMap.remove(4)
	println(hMap.count())
	
}


fun setMethods():Unit{
	  val mySet: Set<Any> = setOf(2,6,4,29,5,"Ashu","Ajay")
	for(element in mySet){  
        println(element)  
    }
	 println(mySet.isEmpty())
	 println(mySet.isNotEmpty())
	 val remainList= mySet.drop(4)
	 for(element in remainList){  
        println(element)  
    }
	
	    println(mySet.elementAt(3))
	
	var hashSet = HashSet<Int>(6)  
    hashSet.add(2)  
    hashSet.add(13)  
    hashSet.add(6)
	hashSet.add(11)
	hashSet.add(23)
	val mySet1 = setOf(6,4,29)  
	 for (element in hashSet){  
        println(element)  
    }  
    println(".....hashSetOf1.remove(6)......")  
    println(hashSet.remove(6))
	println(hashSet.removeAll(mySet1))
	println(hashSet.isEmpty())
}



fun main() {  
val base = Base()  
    // base.a and base.d are visible  
    // base.b, base.c and base.e() are not visible  
val derived = Derived()  
    // derived.c is not visible
var ser:(Int)->Unit={s:Int->println(s)}
	 ser(2)
	
	var value1 = 100  
    val value2: Long =value1.toLong()
    exceptions()
	validate(21)
	
	
	
	//Collections
	listMethods()
	mapMethods()
	
	
}

