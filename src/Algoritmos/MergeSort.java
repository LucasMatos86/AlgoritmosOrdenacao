package Algoritmos;

import java.util.Arrays;

public class MergeSort {
	
	
	static void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;

		if (inputLength < 2) {
			return;
		}

		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		System.out.println(Arrays.toString(inputArray));
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
			
			// output igual soliciado
			if(i==0) {
			String n = Arrays.toString(inputArray);
			int tam = n.length()/2;
			String a = n.substring(0,tam);
			String b = n.substring(tam);
			System.out.println( a+ " | " + b);
			}
		}
		for (int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = inputArray[i];
			
		}

		mergeSort(leftHalf);
		mergeSort(rightHalf);

		merge(inputArray, leftHalf, rightHalf);

	}

	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		int i = 0, j = 0, k = 0;

		while (i < leftSize && j < rightSize) {
			if (leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			} else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}

		while (i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}

		while (j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}

	}

}
