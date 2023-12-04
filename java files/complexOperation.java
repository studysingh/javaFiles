import java.util.*;
class complex{
    public void sum(int r1,int r2,int c1,int c2){
        int r=r1+r2;
        int c=c1+c2;
        System.out.println("sum: "+r+"+("+c+")i");

    }
    public void diff(int r1,int r2,int c1,int c2){
        int r=r1-r2;
        int c=c1-c2;
        System.out.println("difference: "+r+"+("+c+")i");
        
        
    }
    public void product(int r1,int r2,int c1,int c2){
        int r=r1*r2;
        int c=-c1*c2;
        System.out.println("product: "+r+"+("+c+")i");
        
        
    }

}
public class complexOperation {
    public static void main(String[] args) {
        complex call = new complex();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of number 1: ");
        int r1=sc.nextInt();
        System.out.print("Enter complex part of number 1: ");
        int c1=sc.nextInt();
        System.out.print("Enter real part of number 2: ");
        int r2=sc.nextInt();
        System.out.print("Enter complex part of number 2: ");
        int c2=sc.nextInt();
        System.out.println("Complex number 1: "+r1+"+("+c1+")i");
        System.out.println("Complex number 2: "+r2+"+("+c2+")i");
        call.sum(r1,r2,c1,c2);
        call.diff(r1,r2,c1,c2);
        call.product(r1,r2,c1,c2);
}
}