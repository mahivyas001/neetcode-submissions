class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        a[0] = 0;
        for(int i=1; i<=n; i++){
            int t=i;
            while(t!= 0){
                t = t&(t-1);
                a[i]++;
            }
        }
        return a;
    }
}