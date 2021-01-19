package calculator;

public class Calci3variables {
	
	int x=10;
	int y=30;
	int z=20;
	
	void add() {
		int a=x+y+z;
		System.out.println(a);
	}
	
	void substract() {
		int b=y-x;
		int c=z-b;
		System.out.println(b);
		System.out.println(c);
	}
	
	void multiply() {
		int d=x*y*z;
		System.out.println(d);
	}
	
	void divide() {
		int e=y/x;
		System.out.println(e);
	}
	

}
