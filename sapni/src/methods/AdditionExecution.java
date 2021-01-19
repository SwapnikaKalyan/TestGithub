package methods;

public class AdditionExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition s=new Addition();
		s.add();
		
		s.add(2, 4, 6);
		
		int k= s.add1();
		System.out.println(k);
		
		int n= s.add1(3, 6, 9);
		System.out.println(n);

	}

}
