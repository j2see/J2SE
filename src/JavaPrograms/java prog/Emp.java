package ep;
import java.util.*;
public class  Emp
{
	int ssno;
	String ename;
	float sal;
	String desig;
	public Emp readValues()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp ssno");
		ssno=Integer.parseInt(s.nextLine());
		System.out.println("enter emp name");
		ename=s.nextLine();
		System.out.println("enter emp sal");
		sal=Float.parseFloat(s.nextLine());
		System.out.println("enter emp design");
		desig=s.nextLine();
		return this;
	}
	public LinkedList empDTO()
	{
		LinkedList ll=new LinkedList();
		ll.add("emp social security no="+ssno);
		ll.add("emp name="+ename);
		ll.add("emp sal="+sal);
		ll.add("emp desig="+desig);
		return ll;
	}
	public static void dispDTO(LinkedList ll)
	{
		System.out.println("\t\t----------------------");
		System.out.println("\t\t emp dtls");
		System.out.println("\t\t----------------------");
		Object obj[]=ll.toArray();
		for(Object eo:obj)
		{
			System.out.println("\t\t"+eo);
		}
		System.out.println("---------------------------");
	}
}

