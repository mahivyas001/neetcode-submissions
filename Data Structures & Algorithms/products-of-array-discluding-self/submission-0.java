class Solution {
    public int[] productExceptSelf(int[] n) {
        int[] a = new  int[n.length];
        int[] l = new  int[n.length];
        int[] r = new  int[n.length];
        for(int i=1; i<n.length; i++){
            l[0] = 1;
            l[i] = l[i-1] * n[i-1];
        }
        for(int i=1; i<n.length; i++){
            r[n.length-1] = 1;
            r[n.length-1 - i] = r[n.length - i] * n[n.length-i];
        }
        for(int i=0; i<n.length; i++){
            a[i] = l[i] * r[i];
        }
        return a;

    }
}