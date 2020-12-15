package inheritancePractice;

//Multi-Level Inheritance
public class Output extends Child{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Output obj1 = new Output();
    obj1.Add();
    obj1.Sub();
    obj1.Mul();
    obj1.Div();
    obj1.end();
	}
 public void end()
 {
   System.out.println("From Main - End of report");	 
 }
}
