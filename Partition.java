package list;
//build another link using the nodes in existing link
class Partition {
	public ListNode partition(ListNode head, int target) {
		if (head == null || head.next == null) return head;
		ListNode small = new ListNode(0);
		ListNode big = new ListNode(0);
		ListNode smallCur = small;
		ListNode bigCur = big;
		while (head != null) {
			if (head.value < target) {
				smallCur.next = head;
				smallCur = smallCur.next;
			} else {
				bigCur.next = head;
				bigCur = bigCur.next;
			}
			head = head.next;
		}
		smallCur.next = big.next;
		small = small.next;
		bigCur.next = null;//or there would be cycle because in the exsiting link, the biggest ele may link to another node
		return small;
		//te your solution here
	}
}