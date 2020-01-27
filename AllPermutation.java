package DFS;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class AllPermutation {
	public List<String> permutations(String input) {
	    List<String> answer = new ArrayList<String>();
	    if (input.length() == 0) {
	    	answer.add("");
	    	return answer;
	    }
	    char[] inputArray = input.toCharArray();
	    helper(inputArray, 0, answer);
	    return answer;
		// Write your solution here
	}
	
	public void helper(char[] input, int position, List<String> answer) {
		if (position == input.length - 1) {
			answer.add(new String(input));//not input.tostring()
			return;
		}
		for (int i = position; i < input.length; ++i) {
			//helper(input, position + 1, answer);//swap with self is helper without swap
			swap(input, i, position);
			helper(input, position + 1, answer);
			swap(input, i, position);
		}
	}
	
	public void swap(char[] input, int i, int position) {
		char temp = input[i];
		input[i] = input[position];
		input[position] = temp;
	}
	
	public static void main(String[] args) {
		AllPermutation solution = new AllPermutation();
		String input = "";
		System.out.println(Arrays.toString(solution.permutations(input).toArray()));
	}
}