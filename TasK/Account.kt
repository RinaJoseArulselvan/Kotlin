
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
	var savings=BankAccount.SavingsAccount("1122332343",20000.0)
	var current=BankAccount.CurrentAccount("1122337687",20000.0)
	var fixedDeposit=BankAccount.FixedDepositAccount("11223379876",80000.0)
	println("enter the bank type")
	println("1- savings account and current account")
	println("2- FixedDeposit account")
	var opt:Int=Integer.valueOf(readLine())
	when(opt){
		1->{
			println("1- deposit 2-withdraw")
			var no=Integer.valueOf(readLine())
			println("amount:")
			var amount=Integer.valueOf(readLine())
			when(no){
				1->{
					savings.deposit(amount)
					current.deposit(amount)
				}
				2->{
					savings.withdraw(amount)
					current.withdraw(amount)
				}
			}
		
		}
		2->{
			println("1- deposit 2-withdraw")
			var no=Integer.valueOf(readLine())
			println("amount:")
			var amount=Integer.valueOf(readLine())
			when(no){
				1->{
					fixedDeposit.deposit(amount)
				}
				2->{
					fixedDeposit.withdraw(amount)
				}
			}
			
			
		}
	}
}
		

