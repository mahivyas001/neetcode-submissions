class Solution {
    public int removeElement(int[] n, int val) {
        int k=0;
        for(int i=0; i<n.length; i++){
            if(n[i] != val) n[k++] = n[i];
        }
        return k;
    }
}