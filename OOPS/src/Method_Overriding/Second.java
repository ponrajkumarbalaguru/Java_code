package Method_Overriding;

public class Second extends First
{
	public void run()
	{
		super.run();
		System.out.println("Running on Process to Second");
	}
	public void run3()
	{
		super.run3();
		System.out.println("Running 3 on Second");
	}
}
