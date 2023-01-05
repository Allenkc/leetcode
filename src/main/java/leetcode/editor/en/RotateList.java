package leetcode.editor.en;

//P61_Rotate List

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        int length = getLength(head);
        int rotateNum = k % length;
        if (rotateNum == 0) {
            return head;
        }

        ListNode dummyHead = new ListNode(0, head);
        ListNode first = dummyHead;
        ListNode second = dummyHead;

        while(rotateNum+1 > 0){
            second = second.next;
            rotateNum--;
        }

        ListNode secondTail = new ListNode(0 ,null);
        while(second!=null){
            if(second.next == null){
                secondTail.next = second;
            }
            first = first.next;
            second = second.next;
        }

        ListNode secondHead = first.next;
        first.next = null;

        dummyHead.next = secondHead;
        secondTail.next.next = head;

        return secondHead;

    }

    private int getLength(ListNode node) {
        int count = 0;
        ListNode current = node;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
