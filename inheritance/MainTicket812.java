package inheritance;

class Ticket
{
	private String eventName;
	private int seatNumber;
	private double price;
	public Ticket(String eventName,int seatNumber,double price)
	{
		this.eventName=eventName;
		this.seatNumber=seatNumber;
		this.price=price;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ticket: \neventName=" + eventName + ", \nseatNumber=" + seatNumber + "\nprice=" + price + "\n";
	}
	
	
}

class VIPTicket extends Ticket
{
	private String specialAccess;
	
	public VIPTicket(String eventName, int seatNumber, double price, String specialAccess) {
		super(eventName, seatNumber, price);
		this.specialAccess = specialAccess;
		
		
	}
	
	public void setSpecialAccess(String specialAccess)
	{
		this.specialAccess=specialAccess;
	}
	public String getSpecialAccess()
	{
		return specialAccess;
	}

	@Override
	public String toString() {
		return "VIPTicket"+super.toString()+"specialAccess=" + specialAccess + "\n ";
	}

	
	
	
}

class StudentTicket extends Ticket
{
	private boolean studentDiscount;
	
	public StudentTicket(boolean studentDiscount,String eventName,int seatNumber,double price)
	{
		super(eventName,seatNumber,price);
		this.studentDiscount=studentDiscount;
	}
	public void setStudentDiscount(boolean studentDiscount)
	{
		this.studentDiscount=studentDiscount;
	}
	public boolean getStudentDiscount()
	{
		return studentDiscount;
	}
	@Override
	public String toString() {
		return "StudentTicket"+super.toString()+"studentDiscount=" + studentDiscount + "";
	}
	
}

public class MainTicket812 {

	public static void main(String[] args) {
		Ticket tc=new Ticket("concert", 101, 50);
		System.out.println(tc);
		VIPTicket tc1=new VIPTicket("VIPConcert", 201, 100, "Backstage Access");
		System.out.println(tc1.toString());
		StudentTicket st=new StudentTicket(true, "Raj", 301, 30);
		System.out.println(st);
	}
	
}


