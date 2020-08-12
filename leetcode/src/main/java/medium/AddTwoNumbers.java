package medium;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode last = null, l3 = null;
        int carry = 0, result = 0;
        do {
            result = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = result / 10;
            result = result % 10;

            // add result as node to l3 list
            if (l3 == null) {
                l3 = last = new ListNode(result);
            } else {
                ListNode node = new ListNode(result);
                last.next = node;
                last = node;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        } while (l1 != null || l2 != null || carry != 0);
        return l3;
    }
}

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode listNode = (ListNode) o;

        if (val != listNode.val) return false;
        return next != null ? next.equals(listNode.next) : listNode.next == null;
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
