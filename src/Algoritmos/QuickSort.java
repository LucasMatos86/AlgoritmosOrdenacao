package Algoritmos;

import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);

		}
	}

	public static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1;
		while (i <= fim) {
			if (vetor[i] <= pivo) {
				System.out.println();
				i++;
			} else if (pivo < vetor[fim]) {
				fim--;
			} else {
				int troca = vetor[i];
				vetor[i] = vetor[fim];
				vetor[fim] = troca;
				i++;
				fim--;
			}
		}
		vetor[inicio] = vetor[fim];
		vetor[fim] = pivo;
		return fim;
	}
}
