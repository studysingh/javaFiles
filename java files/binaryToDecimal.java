import java.util.*;
public class binaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        do{
            sum= sum+(n%10)*i;
            n/=10;
            i*=2;
        } while(n>0);
        System.out.println(sum);
        sc.close();
    }
    
}
