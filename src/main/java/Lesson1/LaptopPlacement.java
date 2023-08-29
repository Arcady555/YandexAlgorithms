package Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LaptopPlacement {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str = r.readLine();

        findTableSize(str);
    }

    private static void findTableSize(String str) {
        String[] array = str.split(" ");
        int l1 = Integer.parseInt(array[0]);
        int w1 = Integer.parseInt(array[1]);
        int l2 = Integer.parseInt(array[2]);
        int w2 = Integer.parseInt(array[3]);
        int l;
        int w;
        int rsl1 = (l1 + l2) * Math.max(w1, w2);
        int rsl2 = (l1 + w2) * Math.max(l2, w1);
        int rsl3 = (l2 + w1) * Math.max(l1, w2);
        int rsl4 = (w1 + w2) * Math.max(l1, l2);
        int rsl = Math.min(Math.min(rsl1,rsl2), Math.min(rsl3, rsl4));
        if (rsl == rsl1) {
            l = l1 + l2;
            w = Math.max(w1, w2);
        } else if (rsl == rsl2) {
            l = l1 + w2;
            w = Math.max(l2, w1);
        } else if (rsl == rsl3) {
            l = l2 + w1;
            w = Math.max(l1, w2);
        } else {
            l = w1 + w2;
            w = Math.max(l1, l2);
        }
        System.out.println(l + " " + w);
    }
}