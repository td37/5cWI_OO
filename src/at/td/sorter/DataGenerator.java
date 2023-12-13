package at.td.sorter;

import java.util.Random;

public class DataGenerator {
    public int[] generateDataArray(int size) {
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }

    public int[] generateDataArray(int size, int min, int max) {
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(max - min) + min;
        }
        return data;
    }

    public static void printArray(int[] data) {
        for (int number : data) {
            System.out.print(number + "   ");
        }
        System.out.println();
    }
}
