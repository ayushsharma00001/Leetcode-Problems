class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstInd = -1;
        int secondInd = -1;
        for(int i = 0 ; i< nums.length-1 ; i++){
            for(int j = 0 ; j<nums.length ; j++){
                if(i==j){
                    continue;
                }
                if(nums[i]+nums[j] == target){
                    firstInd = i;
                    secondInd = j;
                    break;
                }
            }
        }
        int indArr[]={firstInd,secondInd};
        return indArr;
    }
}