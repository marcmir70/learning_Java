//uDemy, curso Java Completo, secao 9, aula 80
//codigo origem em https://github.com/acenelio/encapsulamento1-java
//codigo em https://github.com/marcmir70/uDemy_JavaCompleto_09_consThisSobrEncap
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Modulo09_Account;

public class Modulo09_aula80_exercicioDeFixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Modulo09_Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();		

		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response =='y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Modulo09_Account(number, holder, initialDeposit);
		}
		else account = new Modulo09_Account(number, holder);
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}
