import java.util.*;
public class marksbutton {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        if (n == 0) {
            System.out.println();
        }
        else if (n == 1) {System.out.println("Enter your marks out of 100");}
     else {System.out.println("invalid input");}
    

        sc.close();
    }
}
