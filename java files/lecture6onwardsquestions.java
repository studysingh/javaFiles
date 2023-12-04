import java.util.*;
public class lecture6onwardsquestions{
                                                          /*Program for prime number */
    public static void prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count=0;
        if(n>1){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
     } 
        if(count==2){
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is not a prime number.");
        }
    
        sc.close();
    }
                                                                   /*Fibonacci sequence */
    public static void fib(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a=1;
        int b=2;
        System.out.println("The 1st term is "+a);
        System.out.println("The 2nd term is "+b);
        int ans;
        for(int i=3;i<=n;i++){
            ans=a+b;
            a=b;
            b=ans;
            System.out.println("The "+i+"th"+" term is "+ans);
        }
        sc.close();
    }                                               /*Loop 2 Question 2 */
    public static void ques2(){
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;true;i++){
            System.out.println("enter the number");
            n= sc.nextInt();
            if(n>=0){
            sum=sum+n;
            System.out.println(sum);
        }
            else {
                System.out.println(-1);
                break;
            }
        }
        sc.close();
    }                                           /* Question 4 Print all Armstrong Number b/w 1 and n */
    public static void printarms(int a){       
        int num=a;  //Stored original n in num because in the final step n will be changed after exiting loop
        int sum=0;
        while(a>0){
            int k=a%10;
            sum+=k*k*k;
            a/=10;
        }
        if(sum==num){
            System.out.println(num);
        }
    
               
}
                                    /* Question 9 Checking prime number to represent as sum of two prime numbers */        
public static boolean sumPrime(int a){
    int count =0;
    for(int i=1;i<=a;i++){
        if(a%i==0){
            count++;
        }
    }
    boolean flag=true;
    if(count==2){
        flag = true;
    } else{flag = false;}
    return flag;
}
                                                        /*Checking perfect square number */
public static void square(){
    Scanner sc = new Scanner(System.in);
    double n=sc.nextDouble();
    double d=Math.sqrt(n);
    double f=Math.floor(d);
    if(f*f==n){
        System.out.println("It is a perfect square number.");
    } else {
        System.out.println("It is not a perfect square number");
    }
    sc.close();
}
                                        /*Question 10 Assignment loops 2 bulbs */
public static void bulb(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of bulbs: ");
    int b= sc.nextInt();
    for(int i=1;i<=b;i++){
        double sqOfBulb=Math.sqrt(i);
        double wholeBulb=Math.floor(sqOfBulb);  // only perfect square number will remain switched on
        if(wholeBulb*wholeBulb==i){
            System.out.println(i);
        }

    }

    sc.close();
}
    public static void main(String[] args){
        // prime();
        // fib();
        // ques2();
       /* *Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
         for(int i = 1; i<=n;i++){
            printarms(i);                             // called function to print all armstrong number Question 4
        }
    sc.close();*/
   /*  if(sumPrime(n)&&sumPrime(n-2)){
        System.out.println("It can be represented");*/
        // square();   
        bulb();  
    }
    }
