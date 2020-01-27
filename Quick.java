package sort;

import java.util.Arrays;
import java.util.Random;

class Quick {
	public static int[] quickSort(int[] array) {
	    if (array == null ||array.length == 0) {
	    	return array;
	    }
	    quickSort(array, 0, array.length - 1);
	    //System.out.println(Arrays.toString(array));
	    return array;
		// Write your solution here
	}
	
	public static void quickSort(int[] array, int left, int right) {
		if (left >= right) return;
		
		Random rand = new Random();
		int pivotIndex = left + rand.nextInt(right - left + 1);
		//int pivot = array[pivotIndex];
		pivotIndex = sort(array, pivotIndex, left, right - 1, right);
		quickSort(array, left, pivotIndex);
		quickSort(array, pivotIndex + 1, right);
	}
	
	public static int sort(int[] array, int pivotIndex, int leftBound, int rightBound, int end) {
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, end);
		while(leftBound <= rightBound) {
			if (array[leftBound] < pivot) {
				++leftBound;
			} else {
				swap(array, leftBound, rightBound);
				--rightBound;
			}
		}
		swap(array, leftBound, end);
		return leftBound;
	}
	
	public static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = {3, 2, 5, 6, 2};
		array = quickSort(array);
		System.out.println(Arrays.toString(array));
	}
}