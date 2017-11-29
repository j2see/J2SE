//Abdemo2.java
import java.util.Scanner;
abstract class Figure
{
	Scanner s=new Scanner(System.in);
	abstract void area();
	abstract void disp();
}//Figure-------Ac
class Circle extends Figure
{
	double r,ca;
	void area()
	{
	System.out.println("Enter radius");
	r=s.nextDouble();
	ca=Math.PI*r;
	System.out.println("PI value="+Math.PI);
	}
	void disp()
	{
	System.out.println("Area of Circle="+ca);
	}
}//Circle--------implementation
class Rectangle extends Figure
{
	int l,b,ra;
	void area()
	{
		System.out.println("Enter Length");
		l=Integer.parseInt(s.nextLine());
		System.out.println("Enter Breadth");
		b=Integer.parseInt(s.nextLine());
		ra=l*b;
	}
	void disp()
	{
		System.out.println("Area of Rectangle="+ra);
	}
}//Rectangle--------implementation class of Figure
class Abdemo2 
{
	public static void main(String[] args) 
	{
		//Figure fo=new Figure();invalid,bcoz Figure is abstract
		Figure fo=new Circle();//indirect object
		fo.area();
		fo.disp();
	}
}