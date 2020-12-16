package operations;

public class Oerations_WithMessage_Execute extends Operations_ReturnType {
	

	public String getResults(int num1, int num2, char symbol) 
	{
		
		String result = null;;
		result = super.getResults(num1, num2, symbol);
		if(symbol=='+') 
		{
	     // Concatinating or an alternative of +
	   // result="The sum value is = ".concat(result);
	    result="The sum value is = " + result;
		
		
		//result= String.valueOf("The result is" + add);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oerations_WithMessage_Execute obj=new Oerations_WithMessage_Execute();
		String ret= obj.getResults(10, 20, '+');
		System.out.println(ret);
		
		Operations_ReturnType obj1=new Operations_ReturnType();
		ret= obj1.getResults(10, 20, '+');
		System.out.println(ret);		
	}

}
