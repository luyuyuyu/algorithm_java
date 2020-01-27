package list;

class GenerateNode {
	public ListNode generate(int n) {
	    ListNode head = new ListNode(0);
	    ListNode cur = head;
	    for (int i = 1; i < n; ++i) {
	    	cur.next = new ListNode(i);
	    	cur = cur.next;
	    }
	    return head;
		// Write your solution here
	}
	
	public static void main(String[] args) {
		GenerateNode solution = new GenerateNode();
		solution.generate(10);
	}
}