import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int num:nums){
            if(hs.containsKey(num)){
                hs.put(num,hs.get(num)+1);
            }
            else{
                hs.put(num,1);
            }
        }
        int max = 0;
        for(int val:hs.values())
            max = Math.max(val,max);
        int res = 0;
        for(int frq:hs.values()){
            if(frq==max)
                res+=frq;
        }
        return res;
    }
}