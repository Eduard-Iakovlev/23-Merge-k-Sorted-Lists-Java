package solution;

import model.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode();
        if (lists.length == 0) {
            result = null;
            return result;
        }
        List<Integer> dataMergeListNode = new ArrayList<>();
        for (ListNode node : lists) {
            while (node != null) {
                dataMergeListNode.add(node.val);
                node = node.next;
            }
        }
        dataMergeListNode.sort(Integer::compareTo);
        result = initList(dataMergeListNode);
        return result;
    }
    public ListNode initList(List<Integer> arr){
        if (arr.isEmpty()) return null;
        ListNode head = new ListNode();
        ListNode cur = head;
        head.val = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            cur.next = new ListNode(arr.get(i));
            cur = cur.next;
        }
        cur = null;
        return head;

    }
}
