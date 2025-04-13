public class ReverseofArray {

    public static void reverse(int array[]){
        int start=0;
        int last=array.length-1;

        while(start<last){
            int temp=array[start];
            array[start]=array[last];
            array[last]=temp;

            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int array[]={3,2,5,1,0,4};
        reverse(array);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
