package inheritance;

// super class variable 
 class mother
{
	protected double balance;
	{
		balance=50000;
	}
}
class son extends mother
{
	protected double balance;
	{
		
		balance=1200;
	}
	public void showDetails()
	{
		System.out.println("son balance :"+balance);
		System.out.println("mother balance :"+super.balance);
	}
}

//super class method
class Superex1
{
	public void method()
	{
		System.out.println("super class.method");
	}
	public void method1()
	{
		System.out.println("Second super class.method");
	}
	
}
class Subex1 extends Superex1
{
	public void method()
	{
		super.method1();
		super.method();
		System.out.println("sub class.method...");
	}
}

public class superKeywordVariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son ss=new son();
		ss.showDetails();
		
		
		new Subex1().method();
	}

}
