package OOPS1;

public class DynamicArray {
    private int[] data;
    private int nextElementIndex;

    public DynamicArray() {
        data = new int[5];
    }

    public int size() {
        return nextElementIndex;
    }

    public int get(int i) {
        if (i >= nextElementIndex) {
            return 0;
        }
        return data[i];
    }

    public boolean isEmpty() {
        return nextElementIndex == 0;
    }
}
