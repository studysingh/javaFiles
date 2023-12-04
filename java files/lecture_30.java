import java.util.*;
public class lecture_30 {
    static void multiple(int n, int k){ // printing first k multiple of n
        // base condition
        if(k==1){
            System.out.println(n);
            return ;
        }
        // recursive work
        multiple(n,k-1);
        // self work
        System.out.println(n*k);
    }
    static int sum(int n){ // sum of alternate series 1-2+3-4+5-6+7-8+9-10 ......
        // base case
        if(n==0){
            return 0;
        }
        // conditional self work
        // sum(n-1 ) will be given by recursion
        if((n)%2==1){
            return n+sum(n-1);
        } else{
          return sum(n-1)-n;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of number: ");
       int n=sc.nextInt();
       for(int i=1;i<n;i++){
      System.out.println(sum(i)); 
       }
    //    for(int i=0;i<k;i++){
    //     System.out.println(multiple(n,i));
    //    }
}
    
}
