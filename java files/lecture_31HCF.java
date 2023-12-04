import java.util.*;
public class lecture_31HCF{
    static void hcf(int n,int k){  // brute force approach to find hcf of two number n and k time complexity min(n,k)
        for(int i=Math.min(n,k);i>0;i--){ // loop started with minimum of n and k
            if(n%i==0&&k%i==0){ // if decreasing value from minimum divides both n and k then condition break and print the ans
                System.out.println(i);
                break;
            }
        }
    }
    static void hcf1(int x, int y){  // hcf by long division method
        int rem=1;
        if(y<=0||x<=0){
            System.out.println("Invalid input");
            return;
        }
        if(x%y!=0){
        while(x%y!=0){
            rem=x%y;
            // changing remainder to divisor and divisor to dividend
            x=y;
            y=rem;
        }
        System.out.println(rem);
    }
    else{
        System.out.println(y);
    }
}
static int hcf2(int n,int k){ // hcf using recursion  time complexity logarithmic
    // by euclid's theorem hcf(n,k)=hcf(k,n%k) and hcf(n,0)=n
    // base condition
    if(k==0){
        return n;
    }
    // self work and recursion will give us hcf of k and n%k
   return hcf2(k,n%k);
}
static int lcm(int n,int k){ // finding lcm formula used x*y=lcm*hcf
    return (n*k)/hcf2(n,k);
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        hcf1(n,k)  ;   
    }
}