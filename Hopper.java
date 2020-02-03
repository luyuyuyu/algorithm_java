package DP;

class Hopper {
	public boolean canJump(int[] array) {
		if (array.length == 1) return true;
		boolean[] store = new boolean[array.length];
		store[array.length - 1] = true;
		for (int i = array.length - 2; i >= 0; --i) {
			int range = array[i];
			store[i] = false;
			if (i + range >= array.length - 1) store[i] = true;//******************************
			for (int j = i + 1; j <= i + range; ++j) {//may out of bound! *****************
				if (store[j] == true) {
					store[i] = true;
					break;
				}
			}
		}
		return store[0];
		// Write your solution here
	}
	
	public static void main(String[] args) {
		Hopper solution = new Hopper();
		System.out.println(solution.canJump(new int[] {1, 3, 2, 0, 3}));
	}
}