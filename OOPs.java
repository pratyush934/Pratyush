
class Test {
	
	public  void show() {
		System.out.print("Hello ");
	}
}
//Geter and Seter
class Student {
	String name;
	int roll;
	
	String getName() {
		return this.name;
	}
	int getRoll() {
		return this.roll;
	}
	void setName(String name) {
		this.name = name;
	}
	void setRoll(int roll) {
		this.roll = roll;
	}
}
//Geter and Seter
class Animals {
	String skinColor ;
	int legs;
	
	String getSkinColor() {
		return this.skinColor;
	}
	int getLegs() {
		return this.legs;
	}
	void setSkinColor(String sk) {
		this.skinColor = sk;
	}
	void setLegs(int l) {
		this.legs = l;
	}
}



public class OOPs {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Rohan");
		s1.setRoll(45);
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
		
		Animals a1 = new Animals();
		a1.setSkinColor("Black");
		a1.setLegs(56);
		System.out.println(a1.getSkinColor());
		System.out.println(a1.getLegs());
		
		
		
		

	}

}
