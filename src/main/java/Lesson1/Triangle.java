package Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws Exception {
        String result = "NO";
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        if (a + b > c && a + c > b && b + c > a) {
            result = "YES";
        }
        System.out.println(result);
    }
}