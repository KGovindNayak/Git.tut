package inheritance;
import java.util.*;

class stu
{
	private int studentId;  //111
	  private String studentName;
	  private long mobileNumber; 
	  
		public stu(int studentId, String studentName, long mobileNumber) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.mobileNumber = mobileNumber;
		}
		  
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber + "]";
		}

		public int getStudentId() {
			return studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public long getMobileNumber() {
			return mobileNumber;
		}	
	
}

class Trainer 
{
   public static void viewStudentProfile(stu student)
   {
	   Scanner sc = new Scanner(System.in);	   
	   System.out.print("Enter the Student Id :");
	   int id = sc.nextInt();  //111
	   
	   if(id == student.getStudentId())
	   {
		   System.out.println(student);
	   }
	   else
	   {
		   System.err.println("Id is not Available");
	   }
	   sc.close();
   }
}

public class AssociationEx1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stu s1 = new stu(111, "Raj", 9812345678L);		
		Trainer.viewStudentProfile(s1);
	}

}
