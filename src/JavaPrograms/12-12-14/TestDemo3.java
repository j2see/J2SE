//TestDemo3.java
class Test
{
	int a,b;
	Test(int x,int y)
	{
		a=x;
		b=y;
	}
	Test(Test x)
	{
		a=x.a;
		b=x.b;
	}
}//Test

class TestDemo
{
	public static void main(String[] args) 
	{
		Test t1=new Test(10,20);
		Test t2=new Test(t1);
//Modifications with---t1
t1.a=t1.a+1;
t1.b=t1.b+1;
	System.out.println("val of t1");
	System.out.println("val of a of t1="+t1.a);// 11
	System.out.println("val of b of t1="+t1.b);// 21
	System.out.println("val of t2");
	System.out.println("val of a of t2="+t2.a);// 10
	System.out.println("val of b of t2="+t2.a);// 20
//Modifications with---t2
t2.a=t2.a+10;
t2.b=t2.b+10;
	System.out.println("val of t2");
	System.out.println("val of a of t2="+t2.a);// 20
	System.out.println("val of b of t2="+t2.b);// 30
	System.out.println("val of t1");
	System.out.println("val of a of t1="+t1.a);// 11
	System.out.println("val of b of t1="+t1.b);// 21

	}
}//TestDemo
