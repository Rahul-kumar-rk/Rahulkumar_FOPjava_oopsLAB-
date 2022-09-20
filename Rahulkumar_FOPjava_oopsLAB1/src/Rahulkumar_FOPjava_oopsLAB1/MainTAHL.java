package Rahulkumar_FOPjava_oopsLAB1;
import java.util.Scanner;
import java.util.Random;

public class MainTAHL {
public static void main(String[] args) {
	Employee employee=new Employee("Rahul","Kumar");
	
	System.out.println("Please Enter the department from the following ");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resourse");
	System.out.println("4. Legal");
	
	Scanner sc=new Scanner(System.in);
	int option=sc.nextInt();
	System.out.println(option);
	
	System.out.println("Dear Rahul your generated credentials are as follows");
	if (option==1) {
		System.out.println("Email -->>"+" "+employee.getfirstname()+employee.getlastName()+"@technical.greatlearning.com");
	}
	else if(option==2) {
		System.out.println("Email -->>"+" "+employee.getfirstname()+employee.getlastName()+"@admin.greatlearning.com");
	}
	else if(option==3) {
		System.out.println("Email -->>"+" "+employee.getfirstname()+employee.getlastName()+"@Humanresourse.greatlearning.com");
	}
	else if(option==4) {
		System.out.println("Email -->>"+" "+employee.getfirstname()+employee.getlastName()+"@legal.greatlearning.com");
	}
	else {
		System.out.println("Invalid Department");
		System.out.println("Password Cannot be Generated");
		return ;
	}
	Random rd=new Random();
	int num;
	for (int count=1;count<=1;count ++) {
		num=rd.nextInt(10000);
		char ch = (char) (rd.nextInt(26) + 'a');
		char CH = (char) (rd.nextInt(26) + 'A');
		char CH1= (char) (rd.nextInt(26) + 'A');
		System.out.println("Password"+ " -->> "+ num+"@"+ch+CH+CH1);
	}
	
}
}
