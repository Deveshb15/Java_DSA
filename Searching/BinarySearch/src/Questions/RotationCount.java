package Questions;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int pivot = countRotations(arr);

        System.out.println(pivot);
    }

//    No Duplicates in array
    public static int countRotations(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) /2;

            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid > start && arr[mid-1] > arr[mid]) {
                return mid-1;
            }
            if(arr[start] < arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

//    Duplicates in array
    public static int countRotationsDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid > start && arr[mid-1] > arr[mid]) {
                return mid-1;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if(arr[start] > arr[start+1]) {
                    return start;
                }
                start++;

                if(arr[end] < arr[end-1]) {
                    return end-1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else  {
                end = mid - 1;
            }
        }
        return -1;
    }
}
