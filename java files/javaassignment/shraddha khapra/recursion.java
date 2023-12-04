import java.util.*;
public class recursion {
    static void printNum(int n){
        if(n>5){ // base condition
            return;  
        }
        System.out.println(n); // work performed
        printNum(n+1);  // called recursion
    }
    static void sum(int i,int n, int sum){ // sum of first n natural numbers
        if(n<i){  // base condition
            System.out.println(sum);
            return;
        }
     sum+=i;  // work performed
     sum(i+1,n,sum);  // recursion of function called
    }
    static int factorial(int n){
       if(n<2){
        return 1;
       }
       int fact= factorial(n-1);  // gives value of n-1 factorial
       fact=fact*n;  // after the recursion the value of fact is updated to fact*n because function calculated value until fact(n-1) only
       return fact;
    }
    static void fib(int a,int b,int n){    // fibonacci sequence
        if(n<=0){  // base condition
            return;
        }
        int c=a+b;//operation
        System.out.println(c);  
        fib(b,c,n-1); // recursion
    }
    static int power(int x,int n){  // calculating exponent with stack height n
         if(x==0 && n<1){
            System.out.println("Invalid Input");
            return 0;
        }
        if(n<=0){  // base condition
            return 1;
        }
      int ans=  power(x,n-1); // recursive function
      ans=ans*x;
      return ans;

    }
    static int calPower(int x,int n){  // calculating power using stack height logn
        if(x==0&&n<=0){
            System.out.println("Invalid Input");
            return 0;
        }
        if(n==0){
            return 1;
        }
        // if n is even
        if(n%2==0){
            return calPower(x,n/2)*calPower(x,n/2);  
        }
        else{
            return calPower(x,n/2)*calPower(x,n/2)*x;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=3;
        int b=1;
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        fib(a,b,n-2);
    //     System.out.println("Enter x:");
    //     int x=sc.nextInt();
    //    int ans= calPower(x,n);
    //    System.out.println(ans);

    }
    
}
