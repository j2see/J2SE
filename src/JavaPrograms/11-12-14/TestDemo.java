//TestDemo.java
class Test 
{
	int a,b;
	Test()
	{
		System.out.println("i am from Test----DC");
		a=10;
		b=20;
		System.out.println("val of a="+a);
		System.out.println("val of b="+b);
	}
}//Test

class TestDemo
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
	}
}//TestDemo
