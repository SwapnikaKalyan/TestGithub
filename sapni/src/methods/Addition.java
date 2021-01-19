package methods;

public class Addition {
	
	//Non return type without parameters
	void add() {
	int a;
	int b;
	int c;
	int d;
	String Name;
	a=1;
	b=2;
	c=3;
	d=a+b+c;
	System.out.println(d);
	
	}
	
	// non return type with parameters
	void add(int a, int b, int c) {
		int d;
		d=a+b+c;
		System.out.println(d);
		
	}
	
	//return type without parameters
	int add1() {
		int a;
		int b;
		int c;
		int d;
		a=10;
		b=20;
		c=30;
		d=a+b+c;
		return d;
	}
	

	//return type with parameters
	int add1(int a, int b, int c) {
		int d;
		d=a+b+c;
		return d;
	}
	
	

}
