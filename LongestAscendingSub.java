package DP;

class LongestAscendingSub {
	public int longest(int[] array) {
		if (array.length == 0) return 0;
		int max = 1;
		int cur = 1;
		for (int i = 1; i < array.length; ++i) {
			if (array[i] > array[i - 1]) {
				++cur;
				max = Math.max(cur, max);//**********************{1, 2, 3, 4, 5}
			} else {
				cur = 1;
			}
		}
		
		return max;
		// Write your solution here
	}
	
	public static void main(String[] args) {
		LongestAscendingSub solution = new LongestAscendingSub ();
		System.out.println(solution.longest(new int[] {1, 3, 5, 2, 6}));
	}
}