package Algoritmos;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] vetorShell = { 17, 25, 49, 12, 18, 23, 45, 38, 53, 42, 27, 13, 11, 28, 10, 14 };
		int[] vetorQuick = { 26, 33, 35, 29, 12, 22, 19 };
		int[] vetorMerge = { 23, 17, 8, 15, 9, 12, 19, 7 };
		int[] vetorHeap = { 12, 9, 13, 25, 18, 10, 22 };
		int op;

		do {
			exibirMenu();
			op = in.nextInt();
			switch (op) {
			case 1:
				System.out.println("\nVetor Inicial: "+ Arrays.toString(vetorShell));
				ShellSort.shellSort(vetorShell);
				System.out.println("Vetor Final: "+ Arrays.toString(vetorShell)+"\n");
				break;
				
			case 2:
				System.out.println("\nVetor Inicial: "+ Arrays.toString(vetorMerge));
				MergeSort.mergeSort(vetorMerge);
				System.out.println("Vetor Final: "+ Arrays.toString(vetorMerge)+"\n");
				break;
				
			case 3:// não conseguimos mostrar o output desejado
				System.out.println("\nVetor Inicial: "+ Arrays.toString(vetorQuick));
				QuickSort.quickSort(vetorQuick,0,vetorQuick.length-1);
				System.out.println("Vetor Final: "+ Arrays.toString(vetorQuick)+"\n");
				break;
				
			case 4:
				System.out.println("\nVetor Inicial: "+ Arrays.toString(vetorHeap));
				HeapSort.sort(vetorHeap);
				System.out.println("Vetor Final: "+ Arrays.toString(vetorHeap)+"\n");
				break;
			}

		} while (op != 0);
	}

	

	public static void exibirMenu() {
		System.out.println("1 - Metodo ShellSort: ");
		System.out.println("2 - Método MergerSort: ");
		System.out.println("3 - Método QuickSort: ");
		System.out.println("4 - Método HeapSort: ");
		System.out.println("0 - Encerrar! ");
	}

}
