package at.td.sorter;

public class Main {
    public static void main(String[] args) {
        DataGenerator dg = new DataGenerator();
        int[] data = dg.generateDataArray(5, 1, 10);

        Bubble bubble = new Bubble();
        Selection selection = new Selection();

        Sorter sorter = new Sorter();
        sorter.setAlgorithm(selection);
        DataGenerator.printArray(data);
        //int[] dat = {5, 3, 7, 1, 2};
        int[] result = sorter.doSort(data);

        DataGenerator.printArray(result);
    }

}
