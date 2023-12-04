import java.util.*;
public class lecture10_ques{
    public static int whole(int a){
        int sum=0;
        int p=1;
        while(a>0){
            sum=sum+(a%2)*p;
            p*=10;
            a/=2;
        } 
        return sum;

    }
    public static double fraction(double b,int k){
        double sum=0,p=1;
        for(int i=0;i<=k;i++){
            double a=Math.floor(b);
            b=b-a;
            sum=sum+a*p;
            b=b*2;
            p/=10;
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double num=sc.nextDouble();
        System.out.print("Enter the precision places: ");
        int k=sc.nextInt();
        int a = (int)Math.floor(num);
        double f = num-a;
        int int1 = whole(a);
        double floa1=fraction(f,k);
        System.out.println(int1+floa1);



        

   
    }
}

    

