package Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Metro {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine();
        String b = r.readLine();
        String n = r.readLine();
        String m = r.readLine();

        doIt(a, b, n, m);
    }

    private static void doIt(String a, String b, String n, String m) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int intN = Integer.parseInt(n);
        int intM = Integer.parseInt(m);

        findMinAndMaxTime(intA, intB, intN, intM);
    }

    private static void findMinAndMaxTime(int a, int b, int n, int m) {
        int oneMax = (n + 1) * a + n;
        int oneMin = n + a * (n - 1);
        int twoMax = (m + 1) * b + m;
        int twoMin = m + b * (m - 1);
        if (oneMax < twoMin || twoMax < oneMin) {
            System.out.println("-1");
        } else {
            int rslMax = Math.min(oneMax, twoMax);
            int rslMin = Math.max(oneMin, twoMin);
            System.out.println(rslMin + " " + rslMax);
        }
    }
}