package inheritance;

class Circle
{
	double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double getArea()
	{
		double area;
		area=3.14*radius*radius;
		if(area<0)
		{
			return -1;
		}else
		{
		return area;
		}
	}
	public double getVolumecr()
	{
		double volume;
		volume=3.14*radius*radius*2*3.14*radius;
		if(volume<0)
		{
			return -1;
		}else
		{
		return volume;
		}
	}
	
}
	class Cylinder extends Circle
	{
		double height;

		public Cylinder(double radius, double height) {
			super(radius);
			this.height = height;
		}
		public double getVolume()
		{
			double volume;
			volume=3.14*radius*radius*height;
			if(volume<0)
			{
				return -1;
			}else
			{
			return volume;
			}
		}
		public double getAreaci()
		{
			double area;
			area=2*3.14*radius*height+2*3.14*radius*radius;
			if(area<0)
			{
				return -1;
			}else
			{
			return area;
			}
		}
		@Override
		public String toString() {
			return "circle [radius "+radius+"]"+ "Cylinder [height=" + height + "]";
		}
		
		
		
	}
	


public class ShapeTester612 {

	public static void main(String[] args) {
		Cylinder c1=new Cylinder(4.0, 5.0);
		System.out.println(c1);
		System.out.println("Area of Cylinder :"+c1.getAreaci());
		System.out.println("Volume of Cylinder :"+c1.getVolume());
		System.out.println("Area of Circle :"+c1.getArea());
		System.out.println("volume of Circle :"+c1.getVolumecr());
	}

}
