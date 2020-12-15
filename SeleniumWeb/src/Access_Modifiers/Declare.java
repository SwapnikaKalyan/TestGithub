package Access_Modifiers;

public class Declare {

	private void Sum() {
		System.out.println("Private method");	
	}
		
	public void Add() {
	  Sum();
	  Divide();
	  System.out.println("Public method");
	}
	
	protected void Divide( )
	{
	 Sum();
	 System.out.println("Protected method");
	}
}
