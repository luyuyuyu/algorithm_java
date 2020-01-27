//sorted list
package list;

class Insert {
	//sorted, head <= target <= tail
	public ListNode insertNode(ListNode head, int target) {
		ListNode first = head;
		ListNode second = head.next;
		while(second != null) {
			if (first.value <= target && second.value >= target) {
				insert(target, first, second);
				return head;
			}
			first = first.next;
			second = second.next;
		}
		insert(target, first, null);
		return head;
	}
	
	public static void insert(int taget, ListNode first, ListNode second) {
		first.next = new ListNode(taget);
		first.next.next = second;
		return;
	}
	//insert at tail
	public ListNode insertNodeTail(ListNode head, int target) {
	    ListNode newNode = new ListNode(target);
		if (head == null) {
			head = newNode;
			return head;
		}
		ListNode cur = head;
		while (cur.next != null) cur = cur.next;
		cur.next = newNode;
		return head;
		// Write your solution here
	}
	//***********************************************************************
	//sorted, with duplicated ele, not know the head larger or the target larger
	public ListNode insert1(ListNode head, int value) {
	    ListNode newNode = new ListNode(value);
	    if (head == null) return newNode;
	    if (head.value > value) {
	    	newNode.next = head;
	    	return newNode;
	    }
	    ListNode cur = head;
	    while (cur.next != null) {
	    	if (cur.value <= value && cur.next.value >= value) {
	    		newNode.next = cur.next;
	    		cur.next = newNode;
	    		return head;
	    	}
	    	cur = cur.next;
	    }
	    cur.next = newNode;
	    return head;
		// Write your solution here
	}
	
}