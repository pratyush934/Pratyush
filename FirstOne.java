import java.util.*;

class Test1 {
	public void add() {
		int a,b,c;
		a = 10;
		b = 20;
		c = a+b;
		System.out.println(c);
		
	}
	public void diff() {
		int a=10,b=20,c=a+b;
		System.out.println(c);
		
	}
	public void mul() {
		int a=10,b = 30, c = a*b;
		System.out.println(c);
	}
	public void quotient() {
		int a =10, b = 30, c = a/b;
		System.out.println(c);
	}
}

class Test2 {
	public void remainder() {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = a % b;
		System.out.println("Remainder is : : : "+c);
		
	}
}



public class FirstOne {

	public static void main(String[] args) {
		Test1 a1 = new Test1();
		a1.add();
		a1.diff();
		a1.mul();
		a1.quotient();
		
		Test2 a2 = new Test2();
		a2.remainder();
	}

}
