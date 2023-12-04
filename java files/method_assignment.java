import java.util.*;
public class method_assignment {
    public static int vowelCounting(String s){
        int count =0, i=0;
        while(i<s.length()){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
            i++;

        }
        return count;

    }
    public static void middleChar(String s){
        if(s.length()%2==0){
            System.out.println("The middle letters of the word are "+s.charAt(s.length()/2-1)+" and "+s.charAt(s.length()/2));
        } else{
            System.out.println("The middle letters of the word is "+s.charAt((s.length()-1)/2));
        }
    }
   public static boolean leapYear(int n){
    boolean flag;
    if(n%4==0){
      flag=true;
    } else{
        flag=false;
    }
    return flag;
   }
   public static int smallest(int a,int b, int c) {
    return Math.min(a,Math.min(c,b));
   }
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three numbers: ");
        int n1 = sc.nextInt();
        System.out.println();
        int n2 = sc.nextInt();
        System.out.println();
        int n3 = sc.nextInt();
        System.out.println();

        System.out.println(smallest(n1,n2,n3));



    }
    
}
