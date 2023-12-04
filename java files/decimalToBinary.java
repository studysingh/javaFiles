import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the decimal number: ");
    int n= sc.nextInt();
    int i=1;
    long sum=0;
    do {
        int k= n%2;
        sum = sum + k*i;
        n/=2;
        i=i*10;
    } while(n>0);
    System.out.println(sum);
    sc.close();
    
    
    }
}
