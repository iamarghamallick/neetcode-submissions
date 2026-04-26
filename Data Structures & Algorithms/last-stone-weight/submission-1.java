class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones) {
            pq.offer(stone);
        }
        while(pq.size()>1) {
            int t = pq.poll();
            int tt = pq.poll();
            if(t != tt){
                pq.offer(Math.abs(t - tt));
            }
        }
        if(pq.isEmpty()) return 0;
        return pq.poll();
    }
}
