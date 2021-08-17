package Questions;

public class CeilingFloor {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9, 13, 15};
        int target = 14;
        int ans1 = floor(arr, target);
        int ans2 = ceiling(arr, target);
        System.out.println(ans1 + " " + ans2);
    }

//    return the index of smallest no >= target
    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        if(target > arr[arr.length-1]) return -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

//    return the index of greatest number <= target
    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }
}
