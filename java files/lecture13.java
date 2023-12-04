class decreas{
    public  void decrease(int a, int b){
        a--;
        b-=2;
        System.out.println(a+":"+b);
    }
}
public class lecture13{
    public static void main(String[] args){
        decreas obj=new decreas();    
            int x=32;
        int y=87;
        obj.decrease(x,y);     // value juast changed only for method decrease
        System.out.println(x+"and"+y);  // value is same inside the class
    }
}
 