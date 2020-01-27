package DFS;

class test {
	public static void recursion(int x) {
		StringBuilder sb = new StringBuilder();
		helper(sb);
		// x == 9 when first return
	}
	
	public static void helper(StringBuilder sb) {
		if (sb.length() == 3) {
			return;
		}
		helper(sb.append('a'));
		System.out.println(sb.toString());// x == 9 when first return
	}
	
	public static void main(String[] args) {
		int x = 0;
		recursion(x);
	}
}