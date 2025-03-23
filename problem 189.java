class Solution {
    public void rotate(int[] arr, int k) {
        k = k%arr.length;
        for(int i = 0 , j = arr.length-1 ; i<j ; i++,j--){
            arr[i] = arr[i]+arr[j] - (arr[j] = arr[i]);
        }
        for(int i = 0 , j = k-1 ; i<j ; i++,j--){
            arr[i] = arr[i]+arr[j] - (arr[j] = arr[i]);
        }
        for(int i = k , j = arr.length-1 ; i<j ; i++,j--){
            arr[i] = arr[i]+arr[j] - (arr[j] = arr[i]);
        }
    }
}