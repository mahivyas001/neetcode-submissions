class Solution {
    public int singleNumber(int[] n) {
        int a=0;
        for(int i=0; i<n.length; i++){
            a = a ^ n[i];
        }
        return a;
    }
}