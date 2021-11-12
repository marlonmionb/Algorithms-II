package Ordenacao;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort (int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            int chave = vector[i];
            for (int j = i - 1; j >= 0 && vector[j] > chave; j--) {
                vector[j + 1] = vector[j];
                vector[j] = chave;
            }
            System.out.printf("Iteração do nro %d -> %s \n", chave, Arrays.toString(vector));
        }
    }

    static public void main(String[] args) {
        int[] vector = {2, 1, 4, 6, 23, 54, 67, 22, 12, 28, 112, 111};
        insertionSort(vector);
    }
}
