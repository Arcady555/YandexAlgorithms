package Lesson0;

public class Sort {

    public int[] toSort(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 2; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
        if (array.length > 1 && array[0] > array[1] ) {
            boolean flag = true;
            for (int i = 1; i < array.length; i++) {
                if (array[0] < array[i]) {
                    swapZero(array, i - 1);
                    flag = false;
                    break;
                }
            }

            if (flag) {
                for (int i = array.length - 1; i > 0 ; i--) {
                    swapZero(array, i);
                }
            }
        }
        return array;
    }
    private void swap(int[] array, int a, int b) {
            swapZero(array, a);
            swapZero(array, b);
            swapZero(array, a);
    }

    private void swapZero(int[] array, int x) {
        int tmp = array[x];
        array[x] = array[0];
        array[0] = tmp;
    }
}
