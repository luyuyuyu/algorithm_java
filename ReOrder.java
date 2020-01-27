package list;

class ReOrder {
	public ListNode reorder(ListNode head) {
	    if (head == null || head.next == null) {
	    	return head;
	    }
	    //1.find the midNode
	    ListNode mid = midNode(head);
	    ListNode one = head;
	    //2.only reverse the second half
	    ListNode second = mid.next;
	    //break first list, otherwise infinite loop in merge
	    mid.next = null;
	    //ListNode newHead = reverse(head);
	    //3.merge and return
	    return merge(one, reverse(second));
		// Write your solution here
	}
	private ListNode midNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	private ListNode reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
	
	private ListNode merge(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;

		//int count = 1;
		while (list1 != null && list2 != null) {
			cur.next = list1;
			cur.next.next = list2;//????????????????????????????list1.next = list2
			list1 = list1.next;//********************************************
			list2 = list2.next;
			cur = cur.next.next;
		}
		if (list1 != null) {
			cur.next = list1;
		} else {
			cur.next = list2;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		
	}
}