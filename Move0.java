package sort;

import java.util.Arrays;

class Move0 {
	public static int[] moveZero(int[] array) {
	    int left = 0;
		int end = array.length - 1;
	    while (left < end) {//cannot use for loop cause left does not shift every time.
	    	if (array[left] == 0) {//need to check whether left is 0, if not, shift
	    		swap(array, left, end);
	    		--end;
	    	} else {
	    		++left;
	    	}
	    }
	    return array;
	}
	
	public static void swap(int[] array, int cur, int end) {
		int temp = array[cur];
		array[cur] = array[end];
		array[end] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = {0, 0, 1, 1, 0, 1, 0};
		array = moveZero(array);
		System.out.println(Arrays.toString(array));
	}
}