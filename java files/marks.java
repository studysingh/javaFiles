import java.util.*;
public class marks  {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        switch(r) {
        case 1 : System.out.println("NATHEMATICS 99");
        break;
        case 2 : System.out.println("PHYSICS 95");
        break;
        case 3 : System.out.println("CHEMISTRY 95") ;
        break;
        case 4 : System.out.println("HINDI 90");
        break;
        case 5 : System.out.println("ENGLISH 88");
        break;
        case 6 : System.out.println("PHYSICAL EDUCATION 76");
        break;
        case default : System.out.println("Invalid button");
        }

        sc.close();
    }
    
}
