package inheritance;
import java.util.*;

class Container
{
	protected int x;
	public Container(int x)
	{
		this.x=x;
		System.out.println("x value is :"+this.x);
	}
}
class circ extends Shape
{
	protected double PI=3.14;
	public circ(int radius)
	{
		super(radius);
	}
	public void getAreaOfCircle()
	{
		double area=PI*x*x;
		System.out.println("Area of circle is :"+area);
	}
}
class rectangle extends Shape
{
	protected int breadth;
	public rectangle(int length,int breadth)
	{
		super(length);
		this.breadth=breadth;
	}
	public void getAreaOfRectangle()
	{
		double area=breadth*x;
		System.out.println("area of rectangle is :"+area);
	}
}

public class HierarchicalInheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of the circle :");
		int radius=sc.nextInt();
		circ cc=new circ(radius);
		cc.getAreaOfCircle();
		
		System.out.print("Enter the length of the Rectangle :");
		int length = sc.nextInt();
		
		System.out.print("Enter the breadth of the Rectangle :");
		int breadth = sc.nextInt();
		
		rectangle rc=new rectangle(length,breadth);
		rc.getAreaOfRectangle();
		
	}

}
