import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int binary = linearSearch(arr, 5);

        System.out.println(binary);
        s.close();
    } 

    public static int linearSearch(int[] arr, int el){
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == el){
                return i;
            }
        }
        return -1;
    }
}
