package Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conditioner {
    public static void main(String[] args) throws Exception {
        int result = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String i = r.readLine();
        String j = r.readLine();
        String[] array = i.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        switch (j) {
            case ("freeze") -> result = Math.min(a, b);
            case ("heat") -> result = Math.max(a, b);
            case ("auto") -> result = b;
            case ("fan") -> result = a;
        }
        System.out.println(result);
    }
}