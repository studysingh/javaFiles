import java.util.*;
public class revision {
    public static void main(String[]args){
        // int i=5,j=67;
        // double a=432,b=7;
        // double c=432/7;
        // double x=432,y=7.0;
        // double z=x/y;
        // System.out.println("The value of i is "+i*2);// + is used to connect number and string(here string and number are connected in the same line)
        // System.out.println("Hello "+i+j); // i and j are printed as text
        // System.out.println("Hello "+i*j); // product is printed
        // System.out.println("hello"+" my sweet heart");// Adding two text
        // System.out.println(432/7); //gives only integer value
        // System.out.println(a/b); // gives double value because a  and  b both are float
        // System.out.println(c); // gives integral part because number is only in integer form
        // System.out.println(z); // gives double value because we used .0 after whole value

        // Sum of two numbers
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter the number a: ");
        double a= sc.nextDouble();
        System.out.print("Enter the number b: ");
        double b= sc.nextDouble();
        double c= a+b;
        System.out.println("Sum of the number a and b is "+c); */

        System.out.println("Enter the dividend: ");
        int n= sc.nextInt();
        System.out.println("Enter the divisor: ");
        int m= sc.nextInt();
        System.out.println("The remainder is "+n%m);

        sc.close();

    }
    
}
