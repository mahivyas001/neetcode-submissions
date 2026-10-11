class Solution {
    public int majorityElement(int[] n) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            h.put(n[i], h.getOrDefault(n[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int maxval = 0;

        for (int k : h.keySet()) {
            if (h.get(k) > maxval) {
                max = k;
                maxval = h.get(k);
            }
        }
        return max;
    }
}