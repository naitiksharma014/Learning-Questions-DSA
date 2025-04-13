import java.util.*;



public class FunctionArgument {
    
    public static void update(int marks[]){
       for(int i=0;i<marks.length;i++){
           marks[i]=marks[i]+1;
       }
    }

    public static void main(String[] args) {
        int marks[]=new int[4];
          
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }

        update(marks);

        System.out.println("Updated Array are");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
    
}
