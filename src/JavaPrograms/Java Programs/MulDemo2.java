class Table 
{
	int n;
	void set(int x)
	{
		n=x;
	}//set
	void mulTable()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i"="+(n*i));
		}
	}//multable
}//Table()
class MulDemo2
{
	public static void main(String[] args) 
	{
		if(args.length=1)
		{
			System.out.println("Enter only one value");
		}//if
		else
		{
			int x=integer.parseint(args[0]);
			if(x<=0)
			{
				System.out.println(x+"is invalid input,enter +ve val");
			}//if
		else
		{
			Table to=new Table();
			to.set(x);
			to.multable();
		}
	}
}
