//Abdemo1.java
abstract class Op
{
	abstract void Sum();
}
class ISum extends Op
{
	int a,b,c;
	void Sum()
	{
		a=10;b=20;c=a+b;
		System.out.println("int Sum="+c);
	}
}//ISum
class fSum
{
	float a,b,c;
	void Sum()
	{
		a=10.5;
		b=20.5;
		c=a+b;
		System.out.println("float Sum="+c);
	}
}//fSum
class Abdemo1 
{
	public static void main(String[] args) 
	{
		//Op o1=new Op();  // invalid,bcoz Op is abstract
		  Op o1=new ISum();// indirect object
		  o1.Sum();
		  o1.new fSum();   // indirect object
		  o1.Sum();
	}
}//Abdemo1
