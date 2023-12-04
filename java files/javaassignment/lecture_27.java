import java.util.*;
public class lecture_27{
    static int factorial(int n){
        if(n==1|| n==0){//base condition
            return 1;
        }
        if(n<0){
            return -1;
        }
       int  factnm1=factorial(n-1); // recursion work
       return factnm1*n; // self work
    }
    static int fibonacci(int n, int a, int b){ //to find nth fibonacci number
     //base condition
     if(n==1){
        return a;
     }
     if(n==2){
        return b;
     }
     // recursion work
     int prevofprev=fibonacci(n-2,a,b);
     int prev=fibonacci(n-1,a,b);
     // self work
     return prev+prevofprev;
    }
    static void fib(int n,int a,int b){ // to print fibonacci series
        for(int i=1;i<=n;i++){
            System.out.println(i+":"+fibonacci(i,a,b));// function of nth fibonacci number is called
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=2;
        int b=3;
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        fib(n,a,b);
       
    }
}