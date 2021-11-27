package Inheritance;

public class Shift extends car {
	public void Shift()
	{
		System.out.println("This is the Best Varient of Shift");
	}
	public static void main(String[] args) 
	{
		String name="Shift";
		String model="XUV";
		int speed=250;
		Shift sh = new Shift();
		sh.Enginestart();
		sh.Drive();
		sh.Car_detail(name,model,speed);
		sh.Shift();
		
	}
}
