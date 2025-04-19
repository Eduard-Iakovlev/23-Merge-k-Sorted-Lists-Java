package model;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void createList(List<Integer> arr){
        if (arr.isEmpty()) return;
        ListNode cur = this;
        this.val = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            cur.next = new ListNode(arr.get(i));
            cur = cur.next;
        }
        cur = null;
    }

    public void printList() {
        ListNode cur = this;

        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) System.out.print("->");
            cur = cur.next;
        }
        System.out.println();
    }
}
