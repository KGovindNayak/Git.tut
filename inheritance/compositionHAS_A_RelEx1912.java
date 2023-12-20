package inheritance;

class Engine	//strong relation between two classes
{
	private String engineType;
	private int horsePower;
	public Engine( String engineType, int horsePower)
	{
		this.engineType=engineType;
		this.horsePower=horsePower;
	}
	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", horsePower=" + horsePower + "]";
	}
	
}

class Car
{
	private String carName;
	private double carPrice;
	private Engine engine;  //HAS-A Relation
	public Car(String carName,double carPrice)
	{
		this.carName=carName;
		this.carPrice=carPrice;
		this.engine=new Engine("Battery " ,1400); //composition
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carPrice=" + carPrice + ", engine=" + engine + "]";
	}
	
}


public class compositionHAS_A_RelEx1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Engine en=new Engine(null, 0);
		Car ca=new Car("TATA", 200000.0);
		System.out.println(ca);
	}

}
