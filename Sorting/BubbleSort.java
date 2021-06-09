import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // int[] arr = {3,5,1,2,6};

        int[] arr = new int[5];
        for(int i=0; i< arr.length; i++){
            arr[i] = s.nextInt();
        }

        bubbleSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        s.close();
    }

    public static void bubbleSort(int[] arr){

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
