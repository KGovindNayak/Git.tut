package inheritance;

class stude
  {
	int studentId;
	String name;
	double examFee;
	stude(int studentId,String name,double examFee)
	{
		this.studentId=studentId;
		this.name=name;
		this.examFee=examFee;
	}

	public String displayDetails()
	{
		return toString();
	}


@Override
public String toString() {
	return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
}


}

 class dayScholar extends stude
{
	 double transportFee;

	public dayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}
	public String displayDetails()
	{
		return toString();
	}

	@Override
	public String toString() {
		return ""+super.toString()+"dayScholar [transportFee=" + transportFee + "]";
	}
	
	public String payFee(double amount)
	{
		examFee+=transportFee-amount;
		if(examFee<0)
		{
			return "amount will be in negitive..";
		}
		else {
			return ""+examFee;
		}
		
		//return amount;
	}
	
	 
}
 class Hosteller extends stude
 {
	 double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}
	public String displayDetails()
	{
		return toString();
	}

	@Override
	public String toString() {
		return ""+super.toString()+"Hosteller [hostelFee=" + hostelFee + "]";
	}
	
	public String payFee(double amount)
	{
		this.examFee+=hostelFee-amount;
		if(this.examFee<0)
		{
			return "amount will be in negitive..";
		}
		else {
			return ""+this.examFee;
		}
		
		//return amount;
	}

	 
 }

public class testStudent612 {

	public static void main(String[] args) {
		dayScholar d1 = new dayScholar(1,"govind",25000,5000);
		String payFee = d1.payFee(10000);
		System.out.println(d1);
		System.out.println(payFee);
		Hosteller h1 = new Hosteller(2,"naveen",22000,10000);
		System.out.println(h1);
		System.out.println(h1.payFee(20000));
		
	}

}
