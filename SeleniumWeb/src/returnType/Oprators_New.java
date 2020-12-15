package returnType;

public class Oprators_New 
{
	
	private int addition(int num1, int num2)
	{
		int result = 0;
	    result = num1 + num2;
		return result;
	}
	
	
	private int substraction(int num1, int num2) {
		int result = 0;
		    result = num1 - num2;
			return result;
	}
	
	
	private int multiplication(int num1, int num2) {
		int result = 0;
	    result = num1 * num2;
		return result;
	}
	
	
	private int division(int num1, int num2) {
		int result = 0;
	    result = num1 / num2;
		return result;
	}
	
	
public int getResults(int num1, int num2, char symbol) 
{
	int result=0;
	
	if(symbol=='+') 
	{
   
	int add = addition(num1, num2);
	result=add;
}
	
	if(symbol=='-') 
	{
   
	int sub= substraction(num1, num2);
	result=sub;
}

	
	if(symbol=='*') 
	{
   
	int mul= multiplication(num1, num2);
	result=mul;
}
	
	if(symbol=='/') 
	{
   
	int div= division(num1, num2);
	result= div;

}
	return result;
	
}
}
