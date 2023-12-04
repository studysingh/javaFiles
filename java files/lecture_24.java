                                  /*Array List */
import java.util.ArrayList; // using this class we can make arraylist
import java.util.*;  
import java.util.Collections; // class that contains reverse() method                                
public class lecture_24 {
    static void basic(){
        ArrayList<Integer> l1= new ArrayList<>(); // arraylist syntax
        l1.add(5); // adding element to arraylist
        l1.add(6);
        l1.add(7);
        l1.add(8);
        for(int i=0;i<l1.size();i++){// accissing size of array list
            System.out.println(l1.get(i)); // accesing ith index element
        }
        System.out.println(l1); //[5,6,7,8] printing arraylist directly
        l1.add(2,18); // adding element at index i in between is also possible
        System.out.println(l1);
        l1.set(2,34); // replacing element at index i
        System.out.println(l1);
        l1.remove(2); // removing element at ith index
        System.out.println(l1);
        l1.remove(Integer.valueOf(5)); // removing an element e
        System.out.println(l1);
        // note that .remove method returns us boolean value for eg.,
        System.out.println(l1.remove(Integer.valueOf(6)));
        //checking if an element exist or not in the arraylist
        System.out.println(l1.contains(Integer.valueOf(4)));
        // we can put anything inside the arraylist if we do not specify any wrapper class
        ArrayList l= new ArrayList<>();
        l.add(4);
        l.add("sandeep");
        System.out.println(l);
    }
    static void input(ArrayList<Integer> list){  // taking input
        Scanner sc = new Scanner(System.in);
     for(int i=0;i<5;i++){  // size(here 5) can be determined by you
        int element=sc.nextInt();
        list.add(i,element);
     }
    }
    static void reverse(ArrayList<Integer> list){  // function to reverse arraylist
        int i=0;
        int j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    static void sort(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println("Ascending Order "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order: "+list);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        input(l);
        sort(l);
        
    }
    
}
