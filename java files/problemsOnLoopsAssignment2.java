import java.util.*;
public class problemsOnLoopsAssignment2{
    public static void arms(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        int num=n;  //Stored original n in num because in the final step n will be changed after exiting loop
        int sum=0;
        while(n>0){
            int k=n%10;
            sum+=k*k*k;
            n/=10;
        }
        if(sum==num){
            System.out.println("It is an armstrong number.");
        } else{
            System.out.println("It is not an armstrong number.");

        }
    }
    public static void printarms(int a){       /*Printing armstrong numbers */
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // arms();
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            printarms(i);                             // called function to print all armstrong number
        }
    }
}