package Sorting;

public class QuickSort {
    public static void main(String args[]){
        int[] arr = {3, 5, 6, 2, 1, 4, 9, 8};

        quickSort(arr, 0, arr.length-1);

        printArr(arr);
    }

    public static void quickSort(int[] arr, int st, int en){

        if(st < en){
             
            int pi = partition(arr, st, en);

            quickSort(arr, st, pi-1);
            quickSort(arr, pi+1, en);
        }
    }

    public static int partition(int[] arr, int st, int en){

        int i = st - 1;
        int pivot = arr[en];
        
        for(int j = st; j <= en; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, en);

        return i+1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;   
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

