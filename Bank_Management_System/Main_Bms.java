package Com.Bms.Main;

import java.util.Scanner;

public class Main_Bms {

	public static void main(String[] args) {
		
		BankAccount obj= new BankAccount("1. Koushik", "SL00001");
		obj.showMenu();
	}

}
class BankAccount {
	int balance;
	int previousTransjection;
	String customarName;
	String customerId;
	
	BankAccount(String cname , String cid) {
		customarName= cname;
		customerId = cid;
	}
	
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance +amount;
			previousTransjection = amount;
		}
	}
	void withdraw (int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransjection = - amount;
	}
}
	void getPreviousTransjection() {
		if (previousTransjection > 0) {
			System.out.println("Deposited" +previousTransjection);
	}
		else if(previousTransjection < 0) {
		System.out.println("withdraw: "+Math.abs(previousTransjection));	
		}
		else {
			System.out.println("No Transjaction");
		}
	}
		void showMenu() {
			char option = '\0';
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Welcome " +customarName);
			System.out.println("Your Id" +customerId);
			System.out.println("\n");
			
			System.out.println("A : Check Your Balance");
			System.out.println("B: Deposit");
			System.out.println("C: Withdraw");
			System.out.println("D: Prevoius Transtion");
			System.out.println("E: Exit");
			
			do {
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
				System.out.println("Enter Your Option");
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
				option = sc.next().charAt(0);
				System.out.println("\n");
				
				switch (option) {
				case 'A':
					System.out.println("------------------------------");
					System.out.println("Balance = "+balance);
					System.out.println("------------------------------");
					System.out.println("\n");
					break;
					
				case 'B':
					System.out.println("------------------------------");
					System.out.println("Enter an amount to deposite");
					System.out.println("------------------------------");
					
					int amount = sc.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
					
				case 'C':
					System.out.println("------------------------------");
					System.out.println("Enter an amount to withdraw");
					System.out.println("------------------------------");
					
					int amount2 = sc.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
					
				case 'D':
					System.out.println("------------------------------");
					getPreviousTransjection();
					System.out.println("------------------------------");
					System.out.println("\n");
					break;
					
				case 'E': 
					System.out.println("==============================");
					break;
					
					default:
						System.out.println("Invalid Entry! !  Please enter correct option.....");
						break;
				}
			}
			while(option != 'E');
			System.out.println("Thank you visit again");
		}
}