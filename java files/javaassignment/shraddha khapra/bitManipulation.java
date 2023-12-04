import java.util.*;
public class bitManipulation {
    static void getBit(int n,int i){ // getting a bit
        int bitMask=1<<i;
        int ans=bitMask&n;
        if(ans==0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
    static void setBit(int n,int i){ // setting a bit 1 at position i
    int bitMask=1<<i;
    int newNumber=bitMask|n;
    System.out.println(newNumber);
    }
    static void clearBit(int n,int i){
        int bitMask=1<<i;
        int newNumber=~(bitMask)&n;
        System.out.println(newNumber);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the position of bit found: ");
        int i=sc.nextInt();
        clearBit(n,i);
    }
    
}
