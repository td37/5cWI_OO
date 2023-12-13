package at.td.sorter;

public class Sorter {
    Algorithm algorithm;

    public void setAlgorithm(Algorithm algo) {
        this.algorithm = algo;
    }

    public int[] doSort(int[] data) {
        return algorithm.doSort(data);
    }
}
