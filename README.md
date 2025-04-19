# 23. Merge k Sorted Lists

You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.



Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
1->4->5,
1->3->4,
2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []


Constraints:

k == lists.length
0 <= k <= 104
0 <= lists[i].length <= 500
-104 <= lists[i][j] <= 104
lists[i] is sorted in ascending order.
The sum of lists[i].length will not exceed 104.

# 23. Объединить k отсортированных списков

Вам дан массив из k связанных списков lists, каждый из которых отсортирован по возрастанию.

Объедините все связанные списки в один отсортированный связанный список и верните его.



Пример 1:

Ввод: списки = [[1,4,5],[1,3,4],[2,6]]
Вывод: [1,1,2,3,4,4,5,6]
Объяснение: Списки связаны между собой:
[
1->4->5,
1->3->4,
2->6
]
объединим их в один отсортированный список:
1->1->2->3->4->4->5->6
Пример 2:

Входные данные: списки = []
Результат: []
Пример 3:

Входные данные: списки = [[]]
Результат: []


Ограничения:

k == lists.length
0 <= k <= 104
0 <= lists[i].length <= 500
-104 <= lists[i][j] <= 104
lists[i] сортируется в порядке возрастания.
Сумма lists[i].length не будет превышать 104