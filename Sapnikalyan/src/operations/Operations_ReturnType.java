package operations;

public class Operations_ReturnType {
		
		public int addition(int num1, int num2)
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
		
		
	public String getResults(int num1, int num2, char symbol) 
	{
		String result = null;
		
		if(symbol=='+') 
		{
	   
		int add = addition(num1, num2);
		
		result= String.valueOf(add);
	}
		
		if(symbol=='-') 
		{
	   
		int sub= substraction(num1, num2);
		result=String.valueOf(sub);
	}

		
		if(symbol=='*') 
		{
	   
		int mul= multiplication(num1, num2);
		result=String.valueOf(mul);
	}
		
		if(symbol=='/') 
		{
	   
		int div= division(num1, num2);
		result=String.valueOf(div);

	}
     
	if(symbol !='+' & symbol !='-' & symbol !='*' & symbol !='/')
	{
		result="Invalid";			
	}
		return result;
			
	}
}


