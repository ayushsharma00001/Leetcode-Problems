import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-closestSum)){
                    closestSum = sum;
                }
                else if(sum>target){
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    return sum;
                }
            }
            
        }
        return closestSum;
    }
}