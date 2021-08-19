package Questions;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 170;

        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end+1; //this is my newStart
//            end = prevEnd + sizeOfBox*2
            end = end + (end - start + 1)*2;
            start = temp;
        }
        int res = binarySearch(arr, target, start, end);
        return  res;
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while(start <= end){
//            int mid = (start+end)/2;  //(start+end) will exceed range of int in java
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
