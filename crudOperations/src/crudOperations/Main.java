package crudOperations;
import java.sql.SQLException;
import java.util.*;

public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentInsert si=new StudentInsert();
		while(true) {
		System.out.println("Select crud operation");
		System.out.println("1.INSERTION");
		System.out.println("2.DELETION");
		System.out.println("3.UPDATION");
		System.out.println("4.DISPLAY");
        int op=sc.nextInt();
        switch(op)
		{
			case 1:StudentBean sb=new StudentBean();
			       
			       System.out.println("Enter your Registration Number:");
			       int id=sc.nextInt();
			       System.out.println("Enter your NAME:");
			       String name=sc.next();
			       System.out.println("Enter your MailId:");
			       String email=sc.next();
			       sb.setRegno(id);
			       sb.setName(name);
			       sb.setEmail(email);
			       int i=si.StudentInsert(sb);
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
					System.out.println("deleted");
				   else
					System.out.println("not deleted");
				   break;
			case 3:int k=si.StudentUpdate();
				   if(k>0)
					System.out.println("updated");
				   else
					System.out.println("not updated");
				   break;
			case 4:si.StudentDisplay();
			       break;
		}
		
		
		
	
   }
}
}
	

