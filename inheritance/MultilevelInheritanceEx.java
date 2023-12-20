package inheritance;

class student
{
	protected int rollnumber;
	protected String studentName;
	protected String studentAddress;
}
class science extends student
{
	protected int physics,chemistry;
}
class PCM extends science
{
	int maths;
	public PCM(int sno, String sname, String addr, int phy, int che, int math)
	{
		rollnumber=sno;
		studentName=sname;
		studentAddress=addr;
		physics=phy;
		chemistry=che;
		maths=math;
	}
	@Override
	public String toString() {
		return "PCM [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + ", rollnumber="
				+ rollnumber + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}
	
}

public class MultilevelInheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PCM(1, "Govind", "HYD", 65, 59, 72));
	}

}
