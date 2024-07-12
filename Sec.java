package exhandling;

import java.util.Scanner;

public class Sec {
	void ss() {
		int a,b,c,x=12;
		Scanner o=new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		a=o.nextInt();
		System.out.println("Enter the second Number : ");
		b=o.nextInt();
		c=a+b;
		System.out.println("SUm of Two Number : "+c);
		try {
			
		}
		 finally{
		  	  System.out.println("Hello How are You JAVA :"+c);
		    }
		c+=x;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="Ashok";
    //123
    try {
    	System.out.println("hello Exception Handling");
    	int a=Integer.parseInt(s);
    	
    	System.out.println(a);
    	System.out.println("not");
    	//                            Throw Keyword Using 
//    	 throw new NullPointerException 
// 	    ("It is not  using :");
//    	 
    }

    
    //catch(NullPointerException e) {
   catch(NumberFormatException e){
//    catch(ArithmeticException e){
    	System.out.println("String "+s+" Con't be Convertd to Integer :");
    	System.out.println(123);
    }
   
   // 
    System.out.println("Main mathod End ");
    Sec ob=new Sec();
    ob.ss();
	}

}
