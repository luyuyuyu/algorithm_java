package sort;

import java.util.Arrays;

//smaller than pivot before pivot, bigger after
class Partition {
	public static void partition(int[] array, int pivotIndex) {
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, array.length - 1);
		int leftBound = 0;
		int rightBound = array.length - 2;
		while (leftBound <= rightBound) {
			if (array[leftBound] < pivot) {//instead of array[rightBound]
				++leftBound;//leftBound = first num > pivot
			} else {
				swap(array, leftBound, rightBound);
				--rightBound;
			}
		}
		swap(array, leftBound, array.length - 1);
    }
	
	public static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		return;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 4, 5, 6, 1, 1, 1, 3};
		int pivot = 7;
		partition(array, pivot);
		System.out.println(Arrays.toString(array));
	}
}

/*
1 4 5 6 1 1 1 3
l           r
  l         r
1 1 5 6 1 1 4 3
  l       r
    l     r
1 1 1 6 1 5 4 3
    l   r
      l r
1 1 1 1 6 5 4 3
      l
      r
*/