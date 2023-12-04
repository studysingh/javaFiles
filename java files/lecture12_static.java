                                        // use of static keyword

import java.util.*;
public class lecture12_static{
    public int sum(int a , int b){   // method without static keyword
        return a+b;
    }
    public static int pro(int a , int b){  // method with static keyword
        return a*b;
    }
    public static void main(String[] args){
        lecture12_static obj=new lecture12_static();
        Scanner sc = new Scanner(System.in);
        int a =56;
        int b=5;
        int ans=obj.sum(a,b);  // called using object
        int prod=pro(a,b);  // called without using object
        System.out.println(ans);
        System.out.println(prod);
       
      sc.close();

        
        


    }
}