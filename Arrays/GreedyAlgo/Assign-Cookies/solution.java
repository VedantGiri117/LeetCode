/*
Problem: Assign Cookies
Link: https://leetcode.com/problems/assign-cookies/

Category: Arrays + Greedy

Approach:
- Sort both arrays
- Use two pointers
- Assign smallest valid cookie

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0,j = 0;
        //if(n < m) return g.length;

        while(i < n && j < m ){
            if(s[j] >= g[i]){
                i++;
            }
            j++;
        }
        return  i ;
        
    }
}
Add: Assign Cookies (Greedy - Arrays)
