package Chapter2;

import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		System.out.println("Problem 1");
		
		int price,quantity,total;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Item's Price:");
		price=sc.nextInt();
		System.out.println("Enter Item's Quantity:");
		quantity=sc.nextInt();
		total=price*quantity;
		System.out.println("Total Amount="+total);
		

	}

}
