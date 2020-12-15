package hierarchical_Inheritance;

public class SubClass2 extends SuperClass{
	
	void Message() {
		System.out.println("Test is passed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass2 obj2=new SubClass2();
		obj2.add();
		obj2.sub();
		obj2.Message();
	}

}
