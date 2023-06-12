class ShoppingCart{

	fun addItem(list:ArrayList<Item>,obj:Item){
		list.add(obj)
		println("Item added successfully")
		println(list)
	}
	
	fun removeItem(list:ArrayList<Item>,obj:Item){
		list.remove(obj)
		println("Item removed successfully")
		println(list)
	}
	
	fun calculatePrice(list:ArrayList<Item>):Double{
		var total=0.0
		for(i in list){
			total=total+(i.price*i.quantity)
		}
	return total
	}
	
	fun addDiscount(discount:Double,total:Double){
		var discountPrice=total.let{price->price-(price*(discount/100))}
		println("The discounted price is $discountPrice")
	}
}


data class Item(val name:String,var quantity:Int,var price:Double)
 fun main(){
	
		 val cart = ShoppingCart()
		 var price=0.0
		 var list1=arrayListOf<Item>()
	  do{
		 println("enter the option")
		 println("1-add 2-remove 3-calculate price 4-discounted price 5-exit")
		 var opt= Integer.valueOf(readLine())
		 when(opt)
		 {
			 1->{
				 println("enter the item details")
				 println("enter the item name")
				 var name=readLine().toString()
				 println("enter the item quantity")
				 var quantity =Integer.valueOf(readLine())
				 println("enter the item price")
				 var price1 =readLine()?.toDouble()?:0.00
				 var item =Item(name,quantity,price1)
				 cart.addItem(list1,item)
				}
			 2->{
				println("Enter item name to remove: ")
                val itemName = readLine()
                val itemToRemove = list1.find { it.name == itemName }
				if (itemName != null && itemToRemove != null) {
                    cart.removeItem(list1,itemToRemove)
				}
			 	}
			 3->{
				
				price=cart.calculatePrice(list1)
				println("The calculated price is $price")
				 
				}
			 4->{
				 var discount=readLine()?.toDouble()?:0.0
				 cart.addDiscount(discount,price)
				 
				}
			 5->break
			 else->println("Invalid option")
			 
			}
	 		}while(true)
		}
	 
	