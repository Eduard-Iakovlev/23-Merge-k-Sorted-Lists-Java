package check;

import model.ListNode;

public interface CheckLists {
    static boolean check(ListNode expected, ListNode actual) {
        if (expected == null && actual == null) return true;
        ListNode currentExpected = expected;
        ListNode currentActual = actual;
        while (currentExpected != null && currentActual != null) {
            if (currentExpected.val != currentActual.val) {
                return false;
            }
            currentExpected = currentExpected.next;
            currentActual = currentActual.next;
        }
        if (currentExpected != null || currentActual != null) return false;
        return true;
    }
}
