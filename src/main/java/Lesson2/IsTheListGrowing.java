package Lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsTheListGrowing {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str = r.readLine();

        toDo(str);
    }

    private static void toDo(String str) {
        String[] stringArray = str.split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        System.out.println(isGrow(intArray) ? "YES" : "NO");
    }

    private static boolean isGrow(int[] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] <= array[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}