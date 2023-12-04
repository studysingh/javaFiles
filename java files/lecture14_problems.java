import java.util.*;
class lecture14ques{
                                                        // Taking input array and printing sum of their elements
    public void sumArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the five number of which you want sum: ");
        int arr[]= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();        // Taking input 
            
        }

        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];         // Calculating sum
        }
        System.out.println("The sum of the numbers is "+sum);
        sc.close();
    }
                                                    // Sum of two dimensional array
    public void twoArray(){
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[3][2];
        for(int i=0;i<arr.length;i++){          // Taking input 2-D array
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter the element"+(i+1)+""+(j+1));
                arr[i][j]=sc.nextInt();
            }
        }
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){      // Printing sum of 2-D Array
                sum = sum +arr[i][j];

            }
        }
        System.out.println(sum);
        sc.close();

    }    
                                        // Finding maximum in array
    public void max(){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){      // taking input
                System.out.println("Enter the element "+(i+1)+""+(j+1));
                arr[i][j]=sc.nextInt();
            }
        }
        int ans =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>ans){             // maximum condition
                    ans=arr[i][j];
                }
            }
        }
        System.out.println(ans);
        sc.close();


    }         
                                               

            }
 
public class lecture14_problems{
    public static void main(String[] args){
        lecture14ques ques=new lecture14ques();
        // ques.sumArray();
        // ques.twoArray();
        ques.max();
    }
}