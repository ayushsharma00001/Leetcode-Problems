class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0 , j = height.length-1 ; i<j ; ){
            maxArea = (height[i]>height[j]?height[j]:height[i])*(j-i)>maxArea?(height[i]>height[j]?height[j]:height[i])*(j-i):maxArea;
            if(height[i]>height[j])
                j--;
            else
                i++;
        }
        return maxArea;
    }
}