import java.util.*;
public class lecture_29 {
    static int sumOfDigit(int n){ // calculating sum of digits of n digit number
        // base condition
        if(n==0){
            return 0;
        }
        // self work
        return sumOfDigit(n/10)+n%10; // recursion will provide us sum of digit before last digit
    }
    static int power(int p,int q){  // calculating p^q time complexity-> O(q) <-
        // base condition
        if(q==0){
            return 1;
        }
        // self work
        return power(p,q-1)*p; // recursion will give us power p^q-1
    }
    static int fibonacci(int a,int b,int n){
        // base condition
        if(n==1){ // condition at n = 1
            return a;
        }
        if(n==2){ // condition at n=2
            return b;
        }
        // recursive work
        int prev=fibonacci(a,b,n-1);
        int prevofprev=fibonacci(a,b,n-2);
        // self work
        return prev+prevofprev;

    }
    static int powM2(int p,int q){  // calculating power using time complexity -> log q <-
        // base condition
        if(q==0){
            return 1;
        }
        int small=powM2(p,q/2); // small power
        if(q%2==0){// even case recursion
            return small*small;
        } else{// odd case recursion
            return small*small*p;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int a=1,b=3;
        System.out.println(fibonacci(a,b,n));

    }
    
}
