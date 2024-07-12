package exhandling;

public class Fe {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 3;

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        try {
            
          //  System.out.println(10 / 0);  // This will throw an ArithmeticException
             // This will be executed without errors
            System.out.println(a / c);   // This will throw an ArithmeticException
        } catch (ArithmeticException eq) {
            System.out.println("An arithmetic exception occurred: " );
        }
       
//        System.out.println(a / c); 
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
    }
}

