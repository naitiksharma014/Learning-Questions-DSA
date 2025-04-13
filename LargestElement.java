import java.util.*;

public class LargestElement {

    public static int largest(int a[]){
        int largest=Integer.MIN_VALUE;   //  -infinity
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest=a[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int a[]={12,3,45,67,21,23};
        System.out.println("Largest Element is " +largest(a));
    }
}
