package Chapter2;
import java.util.Scanner;
public class Problem4fromGemini {
	//Write a java program to input total days using Scanner and convert them into weeks and remaining days.
	public static void main(String[] args) {
	int totaldays,weeks,remainingdays;
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter Total Days:");
	totaldays=scan.nextInt();
	//Division Operator;
	weeks=totaldays/7;
	//Modulus Operator
	remainingdays=totaldays%7;
	
	//Result
	System.out.println("Total Days="+totaldays);
	System.out.println("Weeks="+weeks);
	System.out.println("Remaining Days="+remainingdays);
	

	}

}
