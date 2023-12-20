package inheritance;

class Crop
{
	private String name;
	private String plantingDate;
	private String growthStatus;
	public Crop(String name,String plantingDate,String growthStatus)
	{
		this.name=name;
		this.plantingDate=plantingDate;
		this.growthStatus=growthStatus;
	}
	public String getName()
	{
		return name;
	}
	public String getPlantingDate()
	{
		return plantingDate;
	}
	public String getGrowthStatus()
	{
		return growthStatus;
	}
	public void setGrowthStatus()
	{
		this.growthStatus=growthStatus;
	}
	@Override
	public String toString() {
		return "Crop Name=" + name + "\nPlanting Date=" + plantingDate + "\nGrowth Status=" + growthStatus + "\n";
	}
	
}

class FruitCrop extends Crop
{
	private String fruitType;
	public FruitCrop(String fruitType,String name,String plantingDate,String growthStatus)
	{
		super(name,plantingDate,growthStatus);
		this.fruitType=fruitType;
	}
	public String getFruitType()
	{
		return fruitType;
	}
	@Override
	public String toString() {
		return "Fruit Crop Name=" + getName() + "\nPlanting Date=" + getPlantingDate() + "\nGrowth Status=" + getGrowthStatus() + "\nFruit Type :"+fruitType;
	}
	
	
}

public class MainCrop1112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crop cr=new Crop("Mango", "2020", "3-Years");
		System.out.println(cr.toString());
		FruitCrop fr=new FruitCrop("red", "Apple", "2023-03-10","Blooming");
		System.out.println(fr.toString());
	}

}
