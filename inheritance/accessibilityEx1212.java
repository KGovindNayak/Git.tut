package inheritance;

class Test
{
	protected int x=100;
}
class Main extends Test
{
	public static void accessibilityEx1212(String[] args)
	{
		Main m1 = new Main();
		System.out.println(m1.x);
	}
}

