package exhandling;

import java.util.Scanner;

public class ste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String as="null";
		String a;
		System.out.println("Enter the your Word");
		Scanner o=new Scanner(System.in);
		a=o.nextLine();
	if(a==as) {
		try {
		System.out.println(as.toUpperCase());
		
		}
		catch(NullPointerException ed) {
			System.out.println("Your can't change null Pointer ");
		}
		
		
	}
	else {
		System.out.println("Your word Upper lase : "+a.toUpperCase());
	}

	}

}
