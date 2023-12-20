package inheritance;

class Animal
{
	private String Name;
	private int age;
	
	public Animal(String Name, int age)
	{
		this.Name=Name;
		this.age=age;
	}
	public void displayInfo()
	{
		System.out.println("Name of the animal is :"+Name);
		System.out.println("age of the animal is :"+age);
	}
}

class lion extends Animal
{
	private int maneLength;
	
	public lion(String Name, int age, int maneLength)
	{
		super(Name,age);
		this.maneLength=maneLength;
	}
	public void makeSound()
	{
		System.out.println("The lion roars loudly.");
	}
	public void displaymaneLength()
	{
		System.out.println("The maneLength is:"+maneLength);
		
	}
}

class Elephant extends Animal
{
	private float tuskLength;
	
	public Elephant(String Name, int age , float tuskLength)
	{
		super(Name,age);
		this.tuskLength=tuskLength;
	}
	public void displayTuskLength()
	{
		System.out.println("The Elephant trumpets.");
	}
}


public class ZooManagement2012 {

	public static void main(String[] args) {
		lion li=new lion("Lion", 22, 26);
		li.makeSound();
		li.displaymaneLength();
		Elephant el=new Elephant("Elephant", 34, 44);
		el.displayTuskLength();
	}

}
