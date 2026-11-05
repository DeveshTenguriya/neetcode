class Solution {
    public void gucchi(int[] nums, int idx, int sum, List<Integer> diary, List<List<Integer>> result, int target){
        if(idx==nums.length){
            if(sum==target){
                result.add(new ArrayList(diary));
                return;
            }

            return;
        }

        gucchi(nums,idx+1,sum,diary,result,target);

        if(sum<=target){
            diary.add(nums[idx]);
            sum+=nums[idx];
            gucchi(nums,idx,sum,diary,result,target);
            diary.remove(diary.size()-1);
            sum-=nums[idx];
        }

        return;
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();

        int sum=0;
        int index=0;

        List<Integer> diary= new ArrayList<>();

        gucchi(nums,index,sum,diary,result,target);

        return result;
    }
}
