                   //  1.counting number of digits
/*import java.util.*;
public class loopChallengers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        int digit=0;
        while(n>0){
            n=n/10;
            digit++;
        }
        System.out.println(digit);
    }
    
}*/
                     //2.sum of digits
/*import java.util.*;
public class loopChallengers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        long k,sum =0;
        long original = n;
        while(true){
            k=n%10;
            if(k<=0){
                break;
            }
            n/=10;
            sum+=k;

        }
        System.out.println("The sum of the digits of the number "+original+" is "+sum);


        sc.close();
    }
} */
                    //3.Reversing the order of digits of a number
 /*import java.util.*;
 public class loopChallengers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n= sc.nextLong();
        long k=n;
        long ans=0;
        do{
            ans=(ans*10)+(n%10);
            n/=10;
        } while(n>0);
        System.out.println("The reversed number of the entered digit "+k+" is "+ans+" .");


        sc.close();
    }
 }*/
                //4. Sum of the series 1-2+3-4+5-6+7-8................n
 /*import java.util.*;
                public class loopChallengers{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int sum=0;
        int i=0;

        while(i<=n){
            if(i%2==0){
                sum-=i;

            } else {
                sum+=i;
            }
            i++;

        }
        System.out.println("the sum is "+sum);

     sc.close();
    }
 }      */         
                  //5.Printing the first n factorial
/*import java.util.*;
public class loopChallengers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the latest factorial: ");
        long n = sc.nextInt();
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
            System.out.println("The factorial of "+i+" is "+fact);

        }


        sc.close();
    }
} */
            //Finding a raised to power b
/*import java.util.*;
public class loopChallengers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        long a=sc.nextLong();
        System.out.print("Enter the exponent: ");
        long b=sc.nextLong();
        long ans=1;
        for(int i=1;i<=b;i++){
            ans*=a;

        }
        System.out.println(ans);
    }
}            
*/
