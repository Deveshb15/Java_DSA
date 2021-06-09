public class MergeSort {
    
    public static void main(String args[]){
        int[] arr = {3, 5, 6, 2, 1, 4, 9, 8};

        mergeSort(arr, 0, arr.length-1);

        printArr(arr);
    }

    public static void mergeSort(int[] arr, int st, int en){
        
        if(st < en){
            int mid = (st+en)/2;

            mergeSort(arr, st, mid);
            mergeSort(arr, mid+1, en);

            merge(arr, st, mid, en);
        }
    }

    public static void merge(int[] arr, int st, int mid, int en){
        int n1 = mid - st + 1;
        int n2 = en - mid;
        
        int[] a = new int[n1];
        int[] b = new int[n2];
        
        for(int i = 0; i < n1; i++){
            a[i] = arr[st + i];
        }
        
        for(int j = 0; j < n2; j++){
            b[j] = arr[mid + 1 + j];
        }
        
        int i = 0;
        int j = 0;
        int n3 = st;
        while(i < n1 && j < n2){
            if(a[i] <= b[j]){
                arr[n3] = a[i];
                n3++;
                i++;
            }
            else{
                arr[n3] = b[j];
                n3++;
                j++;
            }
        }

        while(i < n1){
            arr[n3] = a[i];
            n3++;
            i++;
        }

        while(j < n2){
            arr[n3] = b[j];
            n3++;
            j++;
        }
    }



    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}
