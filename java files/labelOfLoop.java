import java.util.*;
public class labelOfLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        loop1: for(int i=1;i<51;i++){
            if(i==3){
                continue loop1;
            }
            System.out.println(i);
            

        }
        
        
            


        sc.close();
    }
}