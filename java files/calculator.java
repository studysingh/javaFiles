import java.util.*;
public class calculator {public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;
        System.out.print("Sum: ");
        System.out.println(sum);
        System.out.print("Difference: ");
        System.out.println(diff);
        System.out.print("Procuct: ");
        System.out.println(mul);
        System.out.print("Division: ");
        System.out.println(div);
        System.out.print("Remainder: ");
        System.out.println(rem);
        System.out.print("Power: ");
        System.out.println(Math.pow((a),(b)));  // math.pow works only for double values
        sc.close();
      
    }
    
}
    