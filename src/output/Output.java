package output;

import check.CheckLists;
import model.ListNode;
import solution.Solution;

import java.util.List;

public class Output {
    private int test;
    private List<List<Integer>> listsData;
    private List<Integer> listDataExpected;

    private void setInteger(int test) {
        this.test = test;
    }
    private void setListsData(List<List<Integer>> listData) {
        this.listsData = listData;
    }
    private void setListDataExpected(List<Integer> listDataExpected) {
        this.listDataExpected = listDataExpected;
    }

    private void printListNodeLists(ListNode[] lists) {
        if (lists == null) {
            System.out.println("[]");
            return;
        }
        System.out.println("-------");
        for (ListNode list : lists) {
            list.printList();
        }
        System.out.println("-------");
    }

    public void setOutputData(int test, List<List<Integer>> listsData, List<Integer> listDataExpected) {
        setInteger(test);
        setListsData(listsData);
        setListDataExpected(listDataExpected);
    }

    public void printsolution() {
        System.out.println("============ Тест № " + test + " ============");
        System.out.println("Входные данные:");
        ListNode[] lists = null;

        if (listsData != null && !listsData.isEmpty()) {
            try {
                lists = new ListNode[listsData.size()];
                for (int i = 0; i < listsData.size(); i++) {
                    lists[i] = new ListNode();
                    lists[i].createList(listsData.get(i));
                }
            }
            catch (Exception e) { lists = null; }

        }

        printListNodeLists(lists);
        System.out.println("Ожидаемый результат:");
        ListNode expected = new ListNode();
        if (listDataExpected != null) {
            expected.createList(listDataExpected);
            expected.printList();
        } else {
            expected = null;
            System.out.println("[]");
        }
        System.out.println("Полученный результат:");
        Solution solution = new Solution();
        ListNode result = new ListNode();
        try {
            result = solution.mergeKLists(lists);
            result.printList();
        }
        catch (Exception e) {
            System.out.println("[]");
            result = null;
        }

        System.out.println("============ Проверка ============");
        if ((CheckLists.check(expected, result))) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест не пройден");
        }
        System.out.println("=================================\n");
    }

 }
