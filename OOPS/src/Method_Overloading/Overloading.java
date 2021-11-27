package Method_Overloading;

public class Overloading {
	
	int tot;
	public static void add(int a,int b)
	{
		System.out.println("Addition of two number is "+(a+b));
	}
	public void add(int a,int b,int c)
	{
		tot=a+b+c;
		System.out.println("Addition of three number is "+tot);
	}
	public void add(float a,float b)
	{
		System.out.println("Addition of two float value is "+(a+b));
	}
	public static void main(String[] args) 
	{
		Overloading l = new Overloading();
		int a=98,b=53,c=33;
		add(b,c);
		l.add(a, b, c);
		l.add(1.2f, 4.4f);
		add(2, 3);
	}
}
