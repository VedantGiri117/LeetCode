/*
Problem: Lemonade Change
Link: https://leetcode.com/problems/lemonade-change/

Category: Arrays + Greedy

Approach:
- Keep count of $5 and $10 bills
- For $10 → give one $5
- For $20 → prefer (1 $10 + 1 $5), else (3 $5)

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5 = 0, c10 = 0;

        for (int bill : bills) {
            if (bill == 5) {
                c5++;
            } 
            else if (bill == 10) {
                if (c5 == 0) return false;
                c5--;
                c10++;
            } 
            else { // bill == 20
                if (c10 > 0 && c5 > 0) {
                    c10--;
                    c5--;
                } else if (c5 >= 3) {
                    c5 -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}    


Add: Lemonade Change (Greedy - Arrays)
