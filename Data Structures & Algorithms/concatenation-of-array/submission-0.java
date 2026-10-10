class Solution {
    public int[] getConcatenation(int[] n) {
        int[] a = new int[2*n.length];
        System.arraycopy(n, 0, a, 0, n.length);
        System.arraycopy(n, 0, a, n.length, n.length);
        return a;
    }
}