import java.util.*;

public class SmallestElement {


    public static int smallest(int a[]){
        int smallest=Integer.MAX_VALUE;   //  +infinity
        for(int i=0;i<a.length;i++){
            if(smallest>a[i]){
                smallest=a[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int a[]={12,3,45,67,21,23};
        System.out.println("Smallest Element is " +smallest(a));
    }
    
}
