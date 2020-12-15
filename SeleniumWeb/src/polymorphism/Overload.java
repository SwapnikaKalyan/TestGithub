package polymorphism;

public class Overload 
{
	String Name= "Sumeha";
	
void Class1(int Sno, char Grade )
{
System.out.println(Sno + Name + Grade);
}

void Class1(String Subj) 
{
	System.out.println(Name + Subj);
}
void Class1()
{
System.out.println("Science Subject Grade");	
}
}
