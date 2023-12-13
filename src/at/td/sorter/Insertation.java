package at.td.sorter;

public class Insertation implements Algorithm {
    @Override
    public int[] doSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int newValue = data[i];
            int j = i;
            while (j>0 && data[j-1]>newValue){
                data[j] = data[j-1];
                j--;
            }
            data[j] = newValue;
        }

        return data;
    }
}
