package Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MonteKristo {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine();
        String b = r.readLine();
        String c = r.readLine();
        String d = r.readLine();
        String e = r.readLine();

        doIt(a, b, c, d, e);
    }

    private static void doIt(String a, String b, String c, String d, String e) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int intC = Integer.parseInt(c);
        int intD = Integer.parseInt(d);
        int intE = Integer.parseInt(e);

        System.out.println(checkSize(intA, intB, intC, intD, intE) ? "YES" : "NO");
    }

    private static boolean checkSize(int a, int b, int c, int d, int e) {
        int[] arrayBox = {a, b, c};
        int[] arrayHole = {d, e};
        Arrays.sort(arrayBox);
        Arrays.sort(arrayHole);
        return arrayBox[0] <= arrayHole[0] && arrayBox[1] <= arrayHole[1];
    }
}