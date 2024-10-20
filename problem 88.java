class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j,k,c[] = new int[m+n];
        for(i = 0 , j = 0, k= 0; i<m && j<n ; k++){
            if(nums1[i]>nums2[j])
                c[k] = nums2[j++];
            else 
                c[k] = nums1[i++];
        }
        while(i<m)
            c[k++] = nums1[i++];
        while(j<n)
            c[k++] = nums2[j++];
        for(i = 0 ; i<m+n ; i++)
            nums1[i] = c[i];
    }
}