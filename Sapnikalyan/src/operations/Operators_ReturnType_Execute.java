package operations;


public class Operators_ReturnType_Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations_ReturnType obj=new Operations_ReturnType();
		String ret = obj.getResults(10, 20, '*');
		System.out.println(ret);
		int sum = obj.addition(10,2);
		System.out.println(sum);
	}

}
