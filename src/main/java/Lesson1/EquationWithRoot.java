package Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EquationWithRoot {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine();
        String b = r.readLine();
        String c = r.readLine();
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int intC = Integer.parseInt(c);
        if (intA == 0) {
            if (intB == intC * intC) {
                System.out.println("MANY SOLUTIONS");
            } else {
                System.out.println("NO SOLUTION");
            }
        } else {
            int rsl = (intC * intC - intB) / intA;
            System.out.println((intC * intC - intB) % intA == 0 && intC >= 0 ? rsl : "NO SOLUTION");
        }
    }
}