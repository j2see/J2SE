//ConsDemo2.java
abstract class Op
{
	void Sum()
	{
		System.out.println("I am from Sum() without doing any Sum");
		System.out.println("don't call me");
	}
}//Op----class

class ISum extends Op
{
	int a,b,c;
	void Sum()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println("Sum="+c);
	}
}//ISum------class

class ConsDemo2 
{
	public static void main(String[] args) 
	{
		//Op o1=new Op(); // bcoz abstract class cannot be created directly.
		  Op o1=new Sum();
		     o1.Sum();
	}
}//ConsDemo2
