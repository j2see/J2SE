
class PowDemo 
{
	public static void main(String k[]) 
	{
		if(k.length!=2)
		{
		System.out.println("Plz enter two values");
		}//if
		else
		{
		double d1=Double.parseDouble(k[0]);
		double d2=Double.parseDouble(k[1]);
		double res=Math.Pow(d1,d2);
		}//else
	}//main()
}//Powdemo
