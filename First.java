import java.util.*;

public class First {
	
	public static void infiniteLoop() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			int a = sc.nextInt();
			if(a > 0) sum += a;
			else if(a < 0) continue;
			else if(a == 0) break;
		}
		System.out.print(sum);
		
	}
	
	public static void B1018() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		System.out.print(c+" "+d+" "+e+" "+f+" ");
	}

	public static void main(String[] args) {
	
		System.out.println("Enter no. and press 0 to exit");
		infiniteLoop();

	}

}
