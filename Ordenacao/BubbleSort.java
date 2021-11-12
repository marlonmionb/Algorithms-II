package Ordenacao;

import java.util.Arrays;

public class BubbleSort {

    static public void bubbleSort(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            boolean swapped = true;
            for (int j = 0; j < vector.length - i - 1; j++) {
                swapped = false;
                if (vector[j] > vector[j + 1]) {
                    swap(vector, j, j + 1);
                    System.out.printf("Passagem %d -> %s \n", i, Arrays.toString(vector));
                    swapped = true;
                }
            }
        }
    }

    public static void swap(int[] v, int a, int b) {
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }

    static public void main(String[] args) {
        int[] vector = {36, 12, 29, 42, 10, 83};
        System.out.printf("Início -> %s \n", Arrays.toString(vector));
        bubbleSort(vector);
        System.out.printf("Fim -> %s \n", Arrays.toString(vector));
    }

}
