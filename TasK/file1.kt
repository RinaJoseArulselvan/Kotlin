sealed class BankAccount(val accountNumber:String ,var balance:Double){

class SavingsAccount(accountNumber:String ,balance:Double):BankAccount(accountNumber, balance){
	 fun deposit(amount:Int){
		   balance=balance+amount
		  println("The balance of Savings Account is $balance")
		}
	 fun withdraw(amount:Int):Unit{
		if(amount>balance){
			println("Insufficient balance")
		}else{
			balance=balance-amount
			println("The balance of Savings Account after withdrawal of $amount is $balance")
		}
		}
	}
	class CurrentAccount(accountNumber:String ,balance:Double):BankAccount(accountNumber, balance){
		 fun deposit(amount:Int){
		   balance=balance+amount
		  println("The balance of Current Account is $balance")
		}
		 fun withdraw(amount:Int):Unit{
		if(amount>balance){
			println("Insufficient balance")
		}else{
			balance=balance-amount
			println("The balance of Current Account after withdrawal of $amount is $balance")
		}
		}
	}
	class FixedDepositAccount(accountNumber:String ,balance:Double):BankAccount(accountNumber, balance){
	 fun deposit(amount:Int){
		   balance=balance+amount
		  println("The balance of FixedDeposit Account is $balance")
		}
	 fun withdraw(amount:Int):Unit{
		if(amount>balance){
			println("Insufficient balance")
		}else{
			balance=balance-amount
			println("The balance of FixedDepositAccount after withdrawal of $amount is $balance")
		}
		}
	}

}
fun main(){
	var savings=BankAccount.SavingsAccount("1122332343",2000.0)
	var current=BankAccount.CurrentAccount("1122337687",5000.0)
	var fixedDeposit=BankAccount.FixedDepositAccount("11223379876",8000.0)
	println("enter the bank type")
	println("1- savings account")
	println("2- current account")
	println("3- FixedDeposit account")
	var opt:Int=Integer.valueOf(readLine())
	when(opt){
		1->{
			savings.deposit(200)
			savings.withdraw(1300)
		}
		2->{
			current.deposit(2000)
			current.withdraw(4000)
		}
		3->{
			fixedDeposit.deposit(100)
			fixedDeposit.withdraw(9000)
		}
	}
}
		

