class Solution {
    public void moveZeroes(int[] arr) {
        int res = -1;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]!=0){
                res++;
                arr[i] = arr[i]+arr[res] - (arr[res] = arr[i]);
            }
        }
    }
}