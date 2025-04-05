class Solution {
    public int strStr(String haystack, String needle) {
        boolean contains = haystack.contains(needle);
        if(contains == true){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}