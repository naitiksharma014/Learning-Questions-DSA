import java.util.*;
//package ARRAY;

public class Ip_Op_Array {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int marks[] = new int[100];
        
        //Input in Array
        Scanner sc = new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();


        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("maths: " + marks[2]);
         
        
        //Update in Array
        marks[2]=56;
        System.out.println("updated maths: " + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage is " + percentage + "%");


        //Length of Array
        System.out.println("Array Length : " + marks.length);
    }
    
}
