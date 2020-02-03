package bit;

import java.util.HashSet;

class AllUnique {
	//method 1: HashSet
	//set is all the char appear in word[0, i - 1]
	public boolean allUnique(String word) {
		HashSet<Character> set = new HashSet<>();
	    for (int i = 0; i < word.length(); ++i) {
	    	if (set.contains(word.charAt(i))) return false;
	    	set.add(word.charAt(i));
	    }
	    return true;
		// Write your solution here
	}
	
	//method 2: bit
	//use a int, and each bit to map each char, 
	//assumption: only lowerCase letter
	//a 32 bit int can store all letters whether exist in the word
	public boolean allUnique1(String word) {
		int store = 0;
		for (int i = 0; i < word.length(); ++i) {
			int index = word.charAt(i) - 'a';
			int judge = (store >> index) & 1;//right shift does not change store
			if (judge == 1) return false;
			store |= 1 << index;//set a bit to 1
		}
		return true;
		// Write your solution here
	}
	
	//all ascii 256 bit, a int 32 bit, need 256/32 = 8 int
	public boolean allUniqueAll256Ascii(String word) {
		int[] store = new int[] {0, 0, 0, 0, 0, 0, 0, 0};//or new int[8], never new int[8] {0,0,0,0,0,0,0,0}
		for (int i = 0; i < word.length(); ++i) {
			char ch = word.charAt(i);
			int row = ch / 32;//char / 32 will use the ascii of ch directly
			int col = ch % 32;
			int judge = (store[row] >> col) & 1;
			if (judge == 1) return false;
			store[row] |= (1 << col);
		}
		return true;
		// Write your solution here
	}
}