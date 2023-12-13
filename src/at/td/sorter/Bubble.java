package at.td.sorter;

public class Bubble implements Algorithm {
    @Override
    public int[] doSort(int[] data) {
        int swap;
        boolean sortedThisRound = false;

        for (int y = 0; y < data.length; y++) {

            for (int x = 0; x < data.length; x++) {
                if (x < data.length - 1) {
                    if (data[x] > data[x + 1]) {
                        swap = data[x];
                        data[x] = data[x + 1];
                        data[x + 1] = swap;
                        sortedThisRound = true;
                    }
                }
            }
            if (!sortedThisRound) {
                break;
            }
            sortedThisRound = false;
        }

        return data;
    }
}
