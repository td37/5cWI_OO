package at.td.sorter;

public class Insertation implements Algorithm{
    @Override
    public int[] doSort(int[] data) {
        int newValue;
        int range = 1;
        int swap;
        for (int i = 0; i < data.length; i++) {
            newValue = i+1;
            for (int j = 0; j < range; j++) {
                if(data[j]<data[newValue])
                    swap = data[i];
                data[i] = data[minIndex];
                data[minIndex] = swap;
            }

        }

        return data;
    }
}
