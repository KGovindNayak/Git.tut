package inheritance;


class Product
{
	protected String name;
	protected double price;
	
	public Product(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	public void displayInfo()
	{
		System.out.println("name of the product is :"+name);
		System.out.println("price of the product is :"+price);
	}
	public String totalCost(int quantity)
	{
		double totalCost = 0;
		totalCost+=price*quantity;
		return "Total cost is :" +totalCost;
	}
}

class Electronics extends Product
{
	private String brand;
	
	public Electronics(String name,double price,String brand)
	{
		super(name,price);
		this.brand=brand;
	}
	public void displayInfo()
	{
		System.out.println("product name is :"+name);
		System.out.println("product price is :"+price);
		System.out.println("product's brand name is :"+brand);
	}
	 
}

class Clothing extends Product
{
	private String size;
	
	public Clothing(String name,double price,String size)
	{
		super(name,price);
		this.size=size;
	}
	public void displayInfo()
	{
		System.out.println("product name is :"+name);
		System.out.println("product price is :"+price);
		System.out.println("product size is :"+size);
	}
}


public class OnlineShopping2012 {

	public static void main(String[] args) {
		
		Electronics el=new Electronics("Jeans pant", 800, "Bull Jeans");
		el.displayInfo();
		System.out.println(el.totalCost(2));
		Clothing cl=new Clothing("shirt", 450, "M");
		cl.displayInfo();
		System.out.println(cl.totalCost(2));
	}

}
