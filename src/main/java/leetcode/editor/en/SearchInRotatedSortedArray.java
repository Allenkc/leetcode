package leetcode.editor.en;

class Solution33 {

    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[left]){

                if( target >= nums[left] && target <= nums[mid]){
                    right = mid;
                }else{
                    left = mid + 1;
                }

            }else{
                // nums[mid] <= nums[left]
                if( target <= nums[right] && target >= nums[mid+1]){
                    left = mid + 1;
                }else{
                    right = mid;
                }
            }
        }

        return nums[left] == target ? left : -1;
    }
}
