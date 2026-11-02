class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int n : nums){
            if(mp.containsKey(n)){
                mp.put(n, mp.get(n) + 1);
            } else {
                mp.put(n, 1);
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0] != b[0]){
                return Integer.compare(a[0], b[0]);
            }

            return Integer.compare(a[1], b[1]);
        });

        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            pq.offer(new int[]{e.getValue(), e.getKey()});

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] ans = new int[k];

        for(int i=0; i<k; i++){
            int[] vals = new int[2];
            vals = pq.poll();

            ans[i] = vals[1];
        }

        return ans;
    }
}
