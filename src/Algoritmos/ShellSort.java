package Algoritmos;

import java.util.Arrays;

public class ShellSort {


	public static void shellSort(int vetor[]) {
		int n = vetor.length;
		int j, i, h;

		for (h = n / 4; h > 0; h = h / 2) {

			for (i = 0; i < vetor.length; i++) {
				int temp = vetor[i];

				for (j = i; j >= h && vetor[j - h] > temp; j -= h)
					vetor[j] = vetor[j - h];

				vetor[j] = temp;

			}

			System.out.print(Arrays.toString(vetor));
			System.out.print(" | H = " + h);
			System.out.println("");
		}
	}
}