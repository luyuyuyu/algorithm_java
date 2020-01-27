package list;

class Cycle {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next.next == null) return false;
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
	}
}