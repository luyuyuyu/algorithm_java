package DFS;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class AllSubset62 {
	public List<String> subSets(String set) {
		List<String> answer = new ArrayList<>();
		if (set == null) return answer;
		char[] setArray = set.toCharArray();
		StringBuilder prefix = new StringBuilder();
		helper(setArray, 0, prefix, answer);
		return answer;
	} 
	
	public void helper(char[] set, int index, StringBuilder prefix, List<String> answer) {
		if (index == set.length) {
			answer.add(new String(prefix));// same with prefix.toString. the diff between stringbuilder to string and char[] to string
			return;
		}
		helper(set, index + 1, prefix.append(set[index]), answer);
		prefix.deleteCharAt(prefix.length() - 1);
		helper(set, index + 1, prefix, answer);
		
	}
	
	public static void main(String[] args) {
		String set = "String";
		AllSubset62 solution = new AllSubset62();
		System.out.println(Arrays.deepToString(solution.subSets(set).toArray()));
	}
}