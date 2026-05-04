/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size() <= 1) {
            return true;
        } 
        
        Collections.sort(intervals, (interval1, interval2) -> {
            return interval1.start - interval2.start;
        });
        
        Interval prev = intervals.get(0);
        for(int i=1; i<intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if(curr.start < prev.end) {
                return false;
            }
            prev = curr;
        }
        return true;
    }
}
