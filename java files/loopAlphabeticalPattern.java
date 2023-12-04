import java.util.*;
public class loopAlphabeticalPattern {
                                        /*Right angled Triangle */
    public static void right(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char x= sc.next().charAt(0);
        for(char a='A';a<=x;a++){
            for(char b='A';b<=x;b++){
                if(a>=b){
                    System.out.print(b);
                }
            }
            System.out.println();
        }
        sc.close();

    }
    public static void pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char x= sc.next().charAt(0);
        for(char a ='A';a<=(char)(((int)x+1)/2);a++){
            for(char b = 'A';b<x;b++){
                for(char c='A';c<=(char)((((int)x+1)/2)-(int)a);c++){
                    System.out.print(" ");
                }
                for(char d='A';d<=(char)(2*(int)x-1);d++){
                    System.out.print(b);
                }
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        // right();
        pyramid();

        
      
    }
    
}
