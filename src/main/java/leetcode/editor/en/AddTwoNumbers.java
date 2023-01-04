package leetcode.editor.en;

//P2_Add Two Numbers

//leetcode submit region begin(Prohibit modification and deletion)
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
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0 , null);
        ListNode current = dummyHead;
        // declare new variables c1 and c2 to hold the initial reference of list1 and list2 ,
        // then we iterate the list later will not modify the original l1 l2
        ListNode c1 = l1;
        ListNode c2 = l2;
        int carry = 0;

        while(c1!=null || c2!=null || carry!=0){
            int val1 = (c1!=null)?c1.val:0;
            int val2 = (c2!=null)?c2.val:0;
            int sum = val1+val2+carry;
            carry = sum/10;
            current.next = new ListNode(sum%10 , null);
            current = current.next;
            if(c1!=null){
                c1=c1.next;
            }

            if(c2!=null){
                c2=c2.next;
            }
        }

        return dummyHead.next;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)


class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

