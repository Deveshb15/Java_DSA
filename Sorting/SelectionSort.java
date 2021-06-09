import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        // int[] arr = {3,5,1,2,6};

        int[] arr = new int[5];
        for(int i=0; i< arr.length; i++){
            arr[i] = s.nextInt();
        }

        selectionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        s.close();
    }
    

    public static void selectionSort(int[] arr) {
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
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
