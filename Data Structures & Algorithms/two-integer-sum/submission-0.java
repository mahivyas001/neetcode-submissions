class Solution {
    public int[] twoSum(int[] n, int t) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < n.length; i++) {
            if (h.containsKey(t - n[i])) {
                arr[0] = i;
                arr[1] = h.get(t - n[i]);
                Arrays.sort(arr);
                return arr;
            } else {
                h.put(n[i], i);
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}