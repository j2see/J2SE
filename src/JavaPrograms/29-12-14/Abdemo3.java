//Abdemo3.java
abstract class c1
{
	abstract void f1();
	abstract void f2();
}//c1--------ABC
abstract class c2 extends c1
{
	void f1()
	{
	System.out.println("f1()------defined------c2");
	}
}//c2--------ADC
class c3 extends c2
{
	void f2()
	{
	System.out.println("f2()-----defined----c3");
	}
	void f1()
	{
		System.out.println("f1()------Overridden-----c3");
	}
	void f3()
	{
		System.out.println("f3()-----Special----c3");
	}
}//c3------------CDC
class Abdemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t. c3------Direct Object Creation");
		c3 o3=new c3();//direct object
		o3.f1();
		o3.f2();
		o3.f3();
		System.out.println("w.r.t. c2------ADC------Dynamic Binding");
		//c2 o2=new c2();invalid bcoz c2 is ADC
		c2 o2=new c3();//indirect object
		o2.f1();
		o2.f2();
		//o2.f3();invalid,bcoz f3() does not exists in c2
		System.out.println("w.r.t. c1-------ABC------Dynamic Binding");
		//c1 o1=new c1();//invalid,bcoz c1 is ABC
		//c1 o1=new c2();//invalid,bcoz c2 is ADC
		c1 o1=new c3();//indirect object
		o1.f1();
		o1.f2();
		//o1.f3();//invalid,bcoz f3() does not exists in c3()
	}
}