package polymorphism;

public class JNTU19_Overload {
void add(){
	int a=10;
	int b=20;
	int t=a+b;
	System.out.println(t);
}

void add(int a, int b) {
	int t=a+b;
	System.out.println(t);
}

void add(float a, float b) {
	float t=a+b;
	System.out.println(t);
}
}
