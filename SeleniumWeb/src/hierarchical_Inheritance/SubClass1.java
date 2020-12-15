package hierarchical_Inheritance;

public class SubClass1 extends SuperClass {
	
		public void divide(){
		int p= 9;
		int q=3;
		int r= p/q;
		System.out.println(r);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SubClass1 obj1=new SubClass1();
obj1.add();
obj1.sub();
obj1.divide();


	}

}

