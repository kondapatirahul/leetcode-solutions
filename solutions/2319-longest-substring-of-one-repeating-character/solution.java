// class Solution {
//     public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
//         int k=queryIndices.length;
//         StringBuilder sb=new StringBuilder();
//         for (int i=0; i<s.length();i++) {
//             sb.append(s.charAt(i));
//         }
//         int res[]=new int[k];
//         int maxlen=1;
//         for(int i=0;i<k;i++)
//         {
//             sb.setCharAt(queryIndices[i],queryCharacters.charAt(i));
//             res[i]=longest(sb.toString());
//         }
//         return res;

//     }
//     private static int  longest(String s)
//     {
//         if(s==null || s.length()==0){
//             return 0;
//         }
//         int max=1;
//         int current=1;
//         for(int i=1;i<s.length();i++)
//         {
//            if(s.charAt(i)==s.charAt(i-1))
//            {
//             current++;
//            }
//            else{
//             max=max<current?current:max;
//             current=1;
//            }
//         }
//         return max>current?max:current;
//     }
// }
import java.util.*;

class Solution {
    // Represents a contiguous segment of identical characters: [start, end]
    static class Interval implements Comparable<Interval> {
        int start, end;
        char ch;

        Interval(int start, int end, char ch) {
            this.start = start;
            this.end = end;
            this.ch = ch;
        }

        int length() {
            return end - start + 1;
        }

        @Override
        public int compareTo(Interval o) {
            return Integer.compare(this.start, o.start);
        }
    }

    private TreeSet<Interval> set = new TreeSet<>();
    private TreeMap<Integer, Integer> lenMap = new TreeMap<>(); // length -> count

    private void addInterval(Interval interval) {
        set.add(interval);
        lenMap.put(interval.length(), lenMap.getOrDefault(interval.length(), 0) + 1);
    }

    private void removeInterval(Interval interval) {
        set.remove(interval);
        int len = interval.length();
        int count = lenMap.get(len);
        if (count == 1) {
            lenMap.remove(len);
        } else {
            lenMap.put(len, count - 1);
        }
    }

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();
        char[] chars = s.toCharArray();

        // 1. Initialize contiguous intervals
        int l = 0;
        for (int r = 0; r < n; r++) {
            if (r == n - 1 || chars[r] != chars[r + 1]) {
                addInterval(new Interval(l, r, chars[l]));
                l = r + 1;
            }
        }

        int k = queryIndices.length;
        int[] res = new int[k];

        // 2. Process queries
        for (int i = 0; i < k; i++) {
            int idx = queryIndices[i];
            char newChar = queryCharacters.charAt(i);

            if (chars[idx] != newChar) {
                chars[idx] = newChar;

                // Find the interval containing idx
                Interval dummy = new Interval(idx, idx, ' ');
                Interval curr = set.floor(dummy);

                if (curr != null) {
                    removeInterval(curr);

                    // Split left part if it exists
                    if (curr.start < idx) {
                        addInterval(new Interval(curr.start, idx - 1, curr.ch));
                    }
                    // Split right part if it exists
                    if (curr.end > idx) {
                        addInterval(new Interval(idx + 1, curr.end, curr.ch));
                    }

                    // Create single-character interval at idx
                    Interval middle = new Interval(idx, idx, newChar);

                    // Merge with left neighbor if characters match
                    Interval leftNeighbor = set.floor(new Interval(idx - 1, idx - 1, ' '));
                    if (leftNeighbor != null && leftNeighbor.end == idx - 1 && leftNeighbor.ch == newChar) {
                        removeInterval(leftNeighbor);
                        middle.start = leftNeighbor.start;
                    }

                    // Merge with right neighbor if characters match
                    Interval rightNeighbor = set.ceiling(new Interval(idx + 1, idx + 1, ' '));
                    if (rightNeighbor != null && rightNeighbor.start == idx + 1 && rightNeighbor.ch == newChar) {
                        removeInterval(rightNeighbor);
                        middle.end = rightNeighbor.end;
                    }

                    addInterval(middle);
                }
            }

            // The maximum interval length is always the highest key in lenMap
            res[i] = lenMap.lastKey();
        }

        return res;
    }
}
