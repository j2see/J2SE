//STD.java
class Bc
{
	Bc()//-------------(6)
	{
	System.out.println("X");
	}
	Bc(int a)//---------(5)
	{
	this();//control goes to (6)
	System.out.println("Y");		
	}
}//Bc
class Ibc extends Bc
{
	Ibc()//------------(3)
	{
	this(10);//control goes to (4)
	System.out.println("M");
	}
	Ibc(int a)//--------(4)
	{
	super(10);//control goes to (5)
	System.out.println("N");
	}
}//Ibc	
class Dc extends Ibc
{
	Dc()//--------------(2)
	{
	System.out.println("P");
	}
	Dc(int x)//---------(1)
	{
	this();//control goes to (2)
	System.out.println("Q");
	}
}//Dc
class STD 
{
	public static void main(String[] args) 
	{
		Dc do1=new Dc(10);//control goes to(1)
	}
}