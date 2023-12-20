package inheritance;
import java.util.*;


class Aadhar
{
	private long aadharNumber;
	private Date issueDate;
	private String issuingAuthority;
	
	 public Aadhar(long aadharNumber,Date issueDate, String issuingAuthority)
	 {
		 this.aadharNumber=aadharNumber;
		 this.issueDate=issueDate;
		 this.issuingAuthority=issuingAuthority;
	 }

	@Override
	public String toString() {
		return "Aadhar [aadharNumber=" + aadharNumber + ", issueDate=" + issueDate + ", issuingAuthority="
				+ issuingAuthority + "]";
	}
	 	
}

class Person
{
	private String pName;
	private String address;
	private Aadhar aadhar; // HAS-A Relation
	
	public Person(String pName, String address, Aadhar aadhar)
	{
		this.pName=pName;
		this.address=address;
		this.aadhar=aadhar;
	}

	@Override
	public String toString() {
		return "Person [pName=" + pName + ", address=" + address + ", aadhar=" + aadhar + "]";
	}
	
}


public class AggregationEx1912 {	//aggregation is form of association 
	
	public static void main(String[] args) {
		
		Aadhar aa=new Aadhar(2568_5622_5456L, new Date(), "uidai");
		Person pc=new Person("Govind", "Ameerpet",aa);
		System.out.println(pc);
		
		//System.out.println(new Person("Govind", "Ameerpet", new Aadhar(2568_5622_5456L, new Date(), "uidai")));
	}

}
