package Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Makes {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str = r.readLine();

        findAmountOfMakes(str);
    }

    private static void findAmountOfMakes(String str) {
        int result = 0;
        String[] array = str.split(" ");
        try {
            int n = Integer.parseInt(array[0]);
            int k = Integer.parseInt(array[1]);
            int m = Integer.parseInt(array[2]);
            if (n > 0 && k > 0 && m > 0) {
                while (n >= k) {
                    int resultOfLoop = (n / k) * (k / m);
                    result += resultOfLoop;
                    int surplus = n % k + (k % m) * resultOfLoop;
                    n = surplus;
                }
            }
        } catch (Exception e) {
            result = -1;
        }
        System.out.println(result);
    }
}