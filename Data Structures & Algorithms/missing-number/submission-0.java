class Solution {
    public int missingNumber(int[] n) {
        int x=0;
        for(int i=0; i<n.length; i++){
            x^=i;
            x^=n[i];
        }
        return x^n.length;
    }
}