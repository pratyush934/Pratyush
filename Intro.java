import java.util.*;

public class Intro {
	
	
	public static boolean primeNo() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean ohYeah = true;
		if(a == 2) {
			ohYeah = true;
		}
		for(int i=2; i<a; i++) {
			if(a % i == 0) {
				ohYeah = false;
			}
		}
		return ohYeah;
	}
//	sushant0511
	
	public static boolean EvenOrOdd() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean ohYeah = false;
		if(a % 2 == 0) {
			ohYeah = true;
		}else {
			ohYeah = false;
		}
		return ohYeah;
	}
	
	public static void fibonacci() {
		int n1 = 0, n2 = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=2; i<=n; i++) {
			n = n1+n2;
			System.out.print(n+" ");
			n1 = n2;
			n2 = n;
			
			
		}
	}
//	Creating method
	public static void methodTesting() {
		System.out.println("Hey man enter nums.. and Enter 0 to exit: : : \n");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for( ; ; ) {
			int a = sc.nextInt();
			if(a > 0) sum += a;
			if(a < 0) continue;
			if(a == 0) break;
		}
		
		System.out.println(sum);
		
		
	}

	public static void main(String[] args) {
		
		
		

	}

}
