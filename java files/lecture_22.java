import java.util.*;
public class lecture_22 {
    static void input(int arr[][]){
        System.out.println("Input Array");
        Scanner sc = new Scanner(System.in);
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void print(int arr[][]){
        System.out.println("Array");
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiralprinting(int arr[][]){  // printing matrix in spiral order
        int r=arr.length;
        int c=arr[0].length;
        int leftcol=0;
        int rightcol=c-1;
        int toprow=0;
        int bottomrow=r-1;
        int element=0;
        while(element<r*c){ // while condition for total elements
// the condition of total elements is applied in every for while loop because in non square matrix it prints again some values
// also toprow bottomrow rightcol and leftcol are also updated so that they corner elements do not repeat again and again
            // printing top row
            for(int j=leftcol;j<=rightcol && element<r*c;j++){
                System.out.print(arr[toprow][j]+" ");
                element++;
            }
            toprow++;
            // printing rightcol
            for(int i=toprow;i<=bottomrow && element<r*c;i++){
                System.out.print(arr[i][rightcol]+" ");
                element++;
            }
            rightcol--;
            // printing bottom row
            for(int j=rightcol;j>=leftcol && element<r*c;j--){
                System.out.print(arr[bottomrow][j]+" ");
                element++;
            }
            bottomrow--;
            // printing left col
            for(int i=bottomrow;i>=toprow && element<r*c;i--){
                System.out.print(arr[i][leftcol]+" ");
                element++;
            }
            leftcol++;

        }
        System.out.println();

    }
    static void spiralfilling(int n){ // spiral filling of the element in the array
        int arr[][]=new int [n][n];
        int leftcol=0;
        int rightcol=n-1;
        int toprow=0;
        int bottomrow=n-1;
        int filling=1; // tracking and filling array 
        while(filling<=n*n){ // condition till track is n*n
            // we increased filling every time we fill the array elements
            for(int j=leftcol;j<=rightcol && filling<=n*n;j++ ){ // traversed array from left to right
                arr[toprow][j]=filling;
                filling++;
            }
            toprow++;
            for(int i=toprow;i<=bottomrow && filling<=n*n;i++){ // traversed array from top to bottom
                arr[i][rightcol]=filling;
                filling++;
            }
            rightcol--;
            for(int j=rightcol;j>=leftcol && filling<=n*n;j--){// traversed array from right to left 
                arr[bottomrow][j]=filling;
                filling++;
            }
            bottomrow--;
            for(int i=bottomrow;i>=toprow && filling<=n*n;i--){// traversed array from bottom to top
                arr[i][leftcol]=filling;
                filling++;
            }
            leftcol++;
        }
        print(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c=sc.nextInt();
        int arr[][]=new int [r][c];
        input(arr);
        print(arr);
        spiralprinting(arr);
    }
    
}
