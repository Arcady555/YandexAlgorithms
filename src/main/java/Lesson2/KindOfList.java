package Lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KindOfList {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        while (!str.equals("-2000000000")) {
            str = r.readLine();
            if (!str.equals("-2000000000")) {
                stringBuilder.append(str).append(" ");
            }
        }

        KindOfList kindOfList = new KindOfList();
        kindOfList.toDo(stringBuilder.toString());
    }

    public void toDo(String str) {
        if (str.equals("")) {
            System.out.println("RANDOM");
        } else {
            String[] stringArray = str.split(" ");
            int[] intArray = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            System.out.println(defineKind(intArray));
        }
    }

    private String defineKind(int[] array) {
        String rsl = "";
        if (array.length == 1 || isAllEqual(array)) {
            rsl = "CONSTANT";
        } else {
            int[] sortedArray = new int[array.length];
            System.arraycopy(array, 0, sortedArray, 0, array.length);
            Arrays.sort(sortedArray);
            if (Arrays.equals(array, sortedArray)) {
                if (isExactlyUp(array)) {
                    rsl = "ASCENDING";
                } else {
                    rsl = "WEAKLY ASCENDING";
                }
            } else if (isEqualReverse(array, sortedArray)){
                if (isExactlyDown(array)) {
                    rsl = "DESCENDING";
                } else {
                    rsl = "WEAKLY DESCENDING";
                }
            } else {
                rsl = "RANDOM";
            }
        }
        return rsl;
    }

    private boolean isExactlyUp(int[] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] <= array[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    private boolean isExactlyDown(int[] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= array[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    private boolean isEqualReverse(int[] array1, int[] array2) {
        boolean rsl = false;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[array2.length - 1 - i]) {
                    rsl = true;
                } else {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    private boolean isAllEqual(int[] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != array[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}