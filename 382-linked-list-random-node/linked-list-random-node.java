/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode temp = null;
    int pos;
    int n;
    Random rand = new Random();

    public Solution(ListNode head) {
        temp = head;
        pos = 1;
        n = 0;
        ListNode temp2 = head;
        while (temp2 != null) {
            n++;
            temp2 = temp2.next;
        }    
    }

    
    public int getRandom() {
        int val = rand.nextInt(n);
        ListNode temp2 = temp;
        while (val --> 0) {
            temp2 = temp2.next;
        }    
        pos++;
        return temp2.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */