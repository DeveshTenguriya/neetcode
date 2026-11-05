class Solution {
    public int search(int[] nums, int target) {

        int num= 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                num=i;
                return num;
            }
        }

        return -1;
        
    }
}
