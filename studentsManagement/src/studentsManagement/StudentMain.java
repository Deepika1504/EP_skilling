package studentsManagement;
import java.sql.SQLException;
import java.util.*;


public class StudentMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);
		StudentInsertion si=new StudentInsertion();
		StudentBean sb=new StudentBean();
		sb.setRegdno(190031087);
		sb.setName("deepika");
		sb.setEmail("dee@g.com");
		System.out.println("Kindly Select one of the following CRUD operations");
		System.out.println("1.Insert\n2.Delete\n3.Update\n4.Display");
		int op=sc.nextInt();
		switch(op)
		{
			case 1:int i=si.StudentInsert(sb);
				   if(i>0)
				   {
					 System.out.println("insertion is succesfull");
				   }
				   else
				   {
					 System.out.println("insertion is failed");
				   }
				   break;
			case 2:int j=si.StudentDelete();
				   if(j>0)
					System.out.println("deleted successfully");
				   else
					System.out.println("deletion falied");
				   break;
			case 3:int k=si.StudentUpdate();
				   if(k>0)
					System.out.println("Updated successfully");
				   else
					System.out.println("Updation falied");
				   break;
			case 4:si.StudentDisplay();
			       break;
			default:System.out.println("Kindly select numbers from 1 to 4");
			        break;
			       
		}
		sc.close();
		
	}

}
