package DFS;

import java.util.Arrays;
import java.util.List;
import java.util.*;

class CombineCoins {
	public List<List<Integer>> combinations(int target, int[] coins) {
	    List<List<Integer>> answer = new ArrayList<List<Integer>> ();
	    List<Integer> combo = new ArrayList<Integer> ();
	    helper(answer, combo, target, coins, 0);
	    return answer;
		// Write your solution here
	}
	
	public void helper(List<List<Integer>> answer, List<Integer> combo, 
int target, int[] coins, int index) {
		if (index == coins.length - 1) {
			if (target % coins[index] == 0) {
				combo.add(target / coins[index]);
				answer.add(new ArrayList<Integer> (combo));//how to add list
				combo.remove(combo.size() - 1);
			}
			return;
		}
		
		int max = target / coins[index];
		for (int i = 0; i <= max; ++i) {//declare out for loop, target changes otherwise
			combo.add(i);
			helper(answer, combo, target - i * coins[index], coins, index + 1);//target - i * coins[index]
			combo.remove(combo.size() - 1);
		}		
	}
	
	public static void main(String[] args) {
		int target = 10;
		int[] coins = {10, 5, 3, 2, 1};
		CombineCoins solution = new CombineCoins();
		System.out.println(Arrays.toString(solution.combinations(target, coins).toArray()));
	}
}