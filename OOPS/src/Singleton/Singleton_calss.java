package Singleton;

public class Singleton_calss {
	private static Singleton_calss st;
	
	private Singleton_calss()
	{
		
	}
	
	public static Singleton_calss getInstance()
	{
		if(st == null)
		{
			st = new Singleton_calss();
		}
		return st;
	}
	public void display()
	{
		System.out.println("I Have to call singleton object");
	}
}
