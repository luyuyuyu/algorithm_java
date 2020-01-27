package list;

class CountNode {
	public int count(ListNode head) {
	    ListNode cur = head;
	    int count = 1;
	    while (cur != null) {
	    	cur = cur.next;
	    	++count;
	    }
	    return count;
		// Write your solution here
	}
	
	public static void main(String[] args) {
		
	}
}