// https://leetcode.com/problems/merge-k-sorted-lists/
// hard

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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((x, y) -> Integer.compare(x.val, y.val));
        for (ListNode node : lists)
        {
            if (node!= null)
            {
                minHeap.add(node);
            }
        }
        
        ListNode res = null;
        ListNode nodeIt = null;

        while (!minHeap.isEmpty())
        {
            ListNode node = minHeap.poll();
            if (node.next != null)
                minHeap.add(node.next);
            if (res != null)
            {
                nodeIt.next = node;
                nodeIt = node;
            }
            else
            {
                res = node;
                nodeIt = node;
            }
                
        } 
        return res;
    }
}
