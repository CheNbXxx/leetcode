package _0202

/**
  @user: chenqwwq
  @date: 2020/12/15
*/

/**
面试题 02.02. 返回倒数第 k 个节点
实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
注意：本题相对原题稍作改动
示例：

输入： 1->2->3->4->5 和 k = 2
输出： 4
说明：

给定的 k 保证是有效的。
*/

type ListNode struct {
	Val  int
	Next *ListNode
}

func kthToLast(head *ListNode, k int) int {
	fast := head
	for k > 1 {
		fast = fast.Next
		k--
	}

	for fast.Next != nil {
		fast = fast.Next
		head = head.Next
	}

	return head.Val
}
