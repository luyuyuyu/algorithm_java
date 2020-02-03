package DP;

class Fib {
	public long fibonacci(int K) {
	    if (K < 0) return 0L;
	    long[] store = new long[K + 1];
	    store[0] = 0;
	    store[1] = 1;
	    for (int i = 2; i <= K; ++i) {
	    	store[i] = store[i - 1] + store[i - 2];
	    }
	    return store[K];
	    // Write your solution here
	}
	
	public static void main(String[] args) {
		Fib solution = new Fib();
		System.out.println(solution.fibonacci(10));
	}
}