package bit;

class NumOfDifBits {
	// xor bit by bit, then count up; 1 ^ 0 = 1, 1 ^ 1 = 0, 0 ^ 0 = 0, different return 1
	public int diffBits(int a, int b) {
		a ^= b;// a = a ^ b
	    int count = 0;
	    while (a != 0) {//while (a > 0) {
	    	count += a & 1;//a & 1 return whether the last bit is 1//count += a % 2;????
	    	a >>>= 1;
	    }
	    return count;
		// Write your solution here
	}
	
	public static void main(String[] args) {
		
	}
}