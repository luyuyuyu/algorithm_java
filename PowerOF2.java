package bit;

class PowerOf2 {
	//if power of 2, 2^ 10, 2 ^ 2....only one 1 in bit representation, and the sign bit is not 1
	public boolean isPowerOfTwo(int number) {
	    if (number < 0) return false; //exclude the situation of the sign bit is 1
	    //judge whether only one 1 in bit representation
	    //1 & 1 == 1; 0 & 1 == 0;that is any bit & 1 = itself
	    int count = 0;
	    for (int i = 0; i < 64; ++i) {
	    	if (number % 2 == 1) ++count;
	    	number = number >> 1;
	    }
	    return count == 1 ? true : false;
		// Write your solution here
	}
	
	public static void main(String[] args) {
		
	}
}