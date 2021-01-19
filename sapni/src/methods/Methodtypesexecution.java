package methods;

public class Methodtypesexecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodtypes b=new Methodtypes();
		//non return type without parameter
		b.add();
		
		//non return type with parameter
		b.add(2, 8);
		
		//return type without parameter
		int s= b.addr();
		System.out.println(s);
		
		//return type with parameters
		int d= b.addr(10, 20);
		System.out.println(d);
		

	}
	

}
