package Questions;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3};
        int target = 0;

        System.out.println(search(arr, target));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            if(nums[start] > nums[mid]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }

            if(nums[start]==nums[mid] && nums[mid]==nums[end]) {

                if(start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                if(end > start &&nums[end] < nums[end-1]) {
                    return end-1;
                }
                end--;
            }
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
