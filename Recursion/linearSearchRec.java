package Recursion;

public class linearSearchRec {
    public static void main(String[] args){
        int arr[] = {2,4,5,1,3};

        System.out.println(linearSearch(arr, 5, 0));
    }

    public static boolean linearSearch(int[] arr, int el, int i){

        if(i == arr.length){
            return false;
        }

        if(arr[i] == el){
            return true;
        }

        return linearSearch(arr, el, i+1);
    }
}
