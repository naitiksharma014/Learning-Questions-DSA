public class BinarySearch {

    public static int binary_search(int array[], int key){
        int start=0;
        int last=array.length-1;

        while (start<=last) {
            int mid = (start+last)/2;

            if(array[mid]==key){
                //FOUND
                return mid;
            }

            else if(array[mid]<key){  
                //RIGHT 
                start=mid+1;
                //mid=(start+last)/2;
            }

            else{
                //LEFT
                last=mid-1;
                //mid=(start+last)/2;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6}; int key=9;
         
        int index=binary_search(array,key);

        if(index==-1){
            System.out.println("Not Found");

        }
        else{
            System.out.println("Found at index "+ index);
        }

    }
    
}
