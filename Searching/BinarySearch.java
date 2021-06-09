import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int binary = binarySearch(arr, 5);

        System.out.println(binary);
        s.close();
    } 

    public static int binarySearch(int[] arr, int el) {
        int st = 0;
        int en = arr.length ;
        
        while(st <= en){
            int mid = (st+en)/2;
            if(arr[mid] == el){
                return mid;
            }
            else if(arr[mid] < el){
                st = mid + 1;
            }   
            else{
                en = mid - 1;
            }
        }
        return -1;
    }
}
