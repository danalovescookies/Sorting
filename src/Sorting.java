public class Sorting {
    public static void Sort(int[] data){
        for (int i = 1; i < data.length; i++) {
            int current = data[i];
            int j = i;
            while ((j > 0) && (data[j-1] > current)) {
                data[j] = data[j-1];
                j--;
            }
            data[j] = current;
        }
    }
}
