package Questions;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {5,6,4,8,9,11};
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end){
//            int mid = (start+end)/2;  //(start+end) will exceed range of int in java
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
