//ConsDemo1.java
abstract class Parent
{
	void goc() // null body method
	{
	}
}//Parent------ACC
class Child extends Parent
{
	void goc()
	{
		System.out.println("going to college each&every day");
	}
}//Child
class ConsDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t Patrnt---Dynamic binding");
		//Parent p=new Parent(); // invalid,bcoz Parent is ACC
		  Parent p=new Child();  //indirect object
				 p.goc();
	}
}//ConsDemo1
