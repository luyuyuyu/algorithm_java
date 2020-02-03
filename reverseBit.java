package bit;

class reverseBit {
	//method2: inplace swap; like reversing a string
	//2 pointers
	//************************************
	public long reverseBits1(long n) {
		int i = 0;
		int j = 31;
		while (i < j) {
			n = swap(n, i ,j);
			i++;
			j--;
		}
		return n;
	    // Write your solution here
	}


	public long swap(long n, int i, int j) {//***
		long biti = (n >> i) & 1L;
		long bitj = (n >> j) & 1L;
		if (biti == bitj) return n;
		//bit i != bitj, then swap is taking one's complement, use bit ^ 1
		n ^= (1L << i);//1 is wrong, must 1L why???????????????????
		n ^= (1L << j);
		//same as (1L << i) + (1L << j); as (1L << i) | (1L << j); same as (1L << i) ^ (1L << j)???
		//n |= biti << j;//n |= (1 << k) is set kth bit as 1, not set as others, set as 0 use bit ^ 1
		//n |= bitj << i;
		return n;
	}
	
	//method1: new another long to store
	public long reverseBits(long n) {
		long answer = 0;
	    for (int i = 0 ; i < 31; ++i) {
	    	long digit = n & 1L;
	    	n >>>= 1;
	    	answer |= digit;
	    	answer <<= 1;
	    }
	    long digit = n & 1L;
	    n >>>= 1;
	    answer |= digit;
	    return answer;
		// Write your solution here
	}
}