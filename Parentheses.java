package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Parentheses {
	public List<String> validParentheses(int n) {
	    List<String> result = new ArrayList<String>();
	    int leftN = 0;
	    int rightN = 0;
	    StringBuilder prefix = new StringBuilder();
	    helper(result, leftN, rightN, n, prefix);
	    return result;
	}
	
	public void helper(List<String> result, int leftN, int rightN, int n, StringBuilder prefix) {
		if (rightN == n) {
			result.add(prefix.toString());
			return;
		}
		if (leftN < n) {
			prefix.append('(');
			helper(result, leftN + 1, rightN, n, prefix);
			prefix.deleteCharAt(prefix.length() - 1);
		}
		if (leftN > rightN) {
			prefix.append(')');
			helper(result, leftN, rightN + 1, n, prefix);
			prefix.deleteCharAt(prefix.length()- 1);
		}
	}
	
	public static void main(String[] args) {
		int n = 3;
		Parentheses solution = new Parentheses();
		System.out.println(Arrays.deepToString(solution.validParentheses(n).toArray()));
	}
}