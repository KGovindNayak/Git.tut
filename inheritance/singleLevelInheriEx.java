package inheritance;

/* class parent
{
	 public void superEx()
	 {
		 System.out.println("Iam Parent");
	 }
	
}
 class child extends parent
 {
	 
	 public void subclassEx()
	 {
		 
		 System.out.println("Iam a child");
	 }
 }

public class singleLevelInheriEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child cc=new child();
		cc.subclassEx();
		
	}

}			

class superEx
{
	private int x; //int x;
	private int y; //int y;
	public superEx(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
}

class sub extends superEx
{
	public sub()
	{
		super(10,20);
		
	}
//	@Override
//	public String toString() {
//		return "superEx [x=" + x + ", y=" + y + "]";
//	}
	public void getDetails()
	{
		System.out.println(+getX());
		System.out.println(+getY());
	}
}

public class singleLevelInheriEx {
	
	public static void main(String[] args) {
		sub ss=new sub();
		//System.out.println(ss.toString());
		ss.getDetails();
	}
	
}													*/

class Shape
{
	protected int x; //x = 10
	
	public Shape(int x) //x = 10
	{
	  this.x= x;
	  System.out.println("x value is :"+this.x);
	}	
}
class Square extends Shape
{
	public Square(int side)  //side = 10
	{
		super(side);
	}
	
	public void getSquareArea()
	{
		System.out.println("Area of Square :"+(x*x));
	}	
}

public class singleLevelInheriEx
{
	public static void main(String[] args) 
	{
       Square ss = new Square(10);
       ss.getSquareArea();
	}

}



