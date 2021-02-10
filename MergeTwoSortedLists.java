//https://leetcode.com/problems/merge-two-sorted-lists
// Problem type - easy

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l1_itr = l1;
        ListNode l1_parent = null;
        
        while (l2 != null)
        {
            if (l1_itr == null)
            {
                l1_itr = new ListNode(l2.val);
                if (l1 == null)
                    l1 = l1_itr;
                l2 = l2.next;
                if (l1_parent != null)
                {
                    l1_parent.next = l1_itr;
                }
            }
            else if (l1_itr.val < l2.val)
            {
                l1_parent = l1_itr;
                l1_itr = l1_itr.next;
            }
            else
            {
                ListNode node = new ListNode(l2.val);
                node.next = l1_itr;

                if (l1_parent ==null)
                {
                    l1 = node;
                    l1_parent = node;
                }
                else
                {
                    l1_parent.next = node;
                    l1_parent = l1_parent.next;
                }
                
                l2 = l2.next;
                
            }
        }
        
        return l1;
    }
}
