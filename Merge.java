package sort;

import java.util.Arrays;

class Merge {
	public int[] mergeSort(int[] array) {
		if (array == null || array.length == 0) {
			return array;
		}
		return partMerge(array, 0, array.length - 1);
	    
	}
	
	public int[] partMerge(int[] array, int left, int right) {
		if (left == right) {
			return new int[] {array[left]};//instead of return array;
		}
		int mid = left + (right - left) / 2;
		int[] array1 = partMerge(array, left, mid);
		int[] array2 = partMerge(array, mid + 1, right);
		return merge(array1, array2);
	}
	
	public int[] merge(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];
		int i = 0, j = 0, k = 0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) {
				result[k] = array1[i];
				++i;
				++k;
			} else {
				result[k] = array2[j];
				++j;
				++k;
			}
		}
		while (i < array1.length) {
			result[k] = array1[i];
			++i;
			++k;
		}
		while (j < array2.length) {
			result[k] = array2[j];
			++j;
			++k;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 6, 3, 7};
		Merge solution = new Merge();
		array = solution.mergeSort(array);
		System.out.println(Arrays.toString(array));
	}
}