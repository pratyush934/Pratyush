package com.test.testexit;

import java.util.*;

public class TestExit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Choice : : ");
		int choice = sc.nextInt();
		if(choice == 1) {
			PrimeOrNot test1 = new PrimeOrNot();
			test1.testPrime();
		}else if(choice == 2) {
			FactorialTest test2 = new FactorialTest();
			test2.testFactorial();
		}else if(choice == 3) {
			EvenOrOdd test3 = new EvenOrOdd();
			test3.testEvenOrOdd();
		}else if(choice == 4) {
			System.out.print("Exit");
		} else {
			System.out.print("Enter right Choice");
		}
	}

}

class PrimeOrNot {
	
	public void testPrime() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. : : ");
		int n = sc.nextInt();
		boolean ohYeah = false;
		if(n == 2) ohYeah = true;
		if(n == 0 || n == 1) ohYeah = false;
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				ohYeah = false;
				break;
			} else {
				ohYeah = true;
				
			}
		}
		
		if(ohYeah == true) System.out.print("Great it is prime");
		else if(ohYeah == false) System.out.print("Sorry");
				
		
	}
}

class FactorialTest {
	
	public void testFactorial() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.print(fact+" ");
	}
}

class EvenOrOdd {
	
	public void testEvenOrOdd() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 == 0) {
			System.out.print("Bravo, It is a Even No.\n");
		} else {
			System.out.print("Hurrey, It is a odd No.\n");
		}
	}
}
