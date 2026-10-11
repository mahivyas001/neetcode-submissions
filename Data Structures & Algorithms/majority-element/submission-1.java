class Solution {
    public int majorityElement(int[] n) {
        int res = 0;
        int c = 0;
        for (int x : n) {
            if (c == 0) {
                res = x;
            }
            c += (x == res) ? 1 : -1;
        }
        return res;
    }
}