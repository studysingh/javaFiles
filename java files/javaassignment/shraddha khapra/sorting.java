public class sorting {
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void increasingBubbleSort(int arr[]){  // bubble sort
        int n=arr.length;
        // increasing bubble sort
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        print(arr);
    }
    static void decreasingBubbleSort(int arr[]){  // bubble sort
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    arr[j]=arr[j+1]+arr[j];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        print(arr);
    }
    static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
    }
    public static void main(String [] args){
        int arr[]={5,4,3,8,9,6};
    }
    
}
