//IndSum.java
class DigitsSum
{
	int n;
	void set(int x)
	{
		n=x;
	}
	void calDigitsSum()
	{
		if(n<=0)
		{
		System.out.println("enter +ve value");
		}
		else
		{
			int s=0;
			while(n>0)
			{
				int r=n%10;
					s=s+r;
				n=n/10;
			}//while
		System.out.println("Individual Digits Sum="+s);
		}//else
	}//void
}//DigitsSum---BLC

class IndSum
{
	public static void main(String[] args) 
	{
		if(args.length!=1)
		{
		System.out.println("Plz enter one value");
		}
		else
		{
		int x=Integer.parseInt(args[0]);
		DigitsSum d=new DigitsSum();
				  d.set(x);
				  d.calDigitsSum();
		}//else
	}//main()
}//IndSum---ELC
