package dsAlgorithm;

import java.util.Date;

public class Regex {
	public static void main(String args[])
	{
		Algo u=new Algo();

		UserDetails user=new UserDetails();
		System.out.println();
	
		//asking user to enter his data
		System.out.println("Enter FirstName:");
		user.setfName(u.inputString());
		System.out.println();
	
		System.out.println("Enter LastName:");
		user.setlName(u.inputString());
		System.out.println();
	
		System.out.println("Enter Mobile Number:");
		user.setmobileNo(u.inputString());
		System.out.println();	
		
		//Setting current date
		user.setdate(u.getFormatedDate(new Date()));
		System.out.println(u.convertString(user,u.getFileText("C:\\Users\\Asus\\eclipse-workspace\\dsAlgorithm\\Demofolder\\text.txt")));	
	}
}
