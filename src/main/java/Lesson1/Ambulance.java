package Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ambulance {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str = r.readLine();

        toDo(str);
    }

    private static void toDo(String str) {
        String[] array = str.split(" ");
        int k1 = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);
        int k2 = Integer.parseInt(array[2]);
        int p2 = Integer.parseInt(array[3]);
        int n2 = Integer.parseInt(array[4]);

        findGateAndFloor(k1, m, k2, p2, n2);
    }

    private static void findGateAndFloor(int k1, int m, int k2, int p2, int n2) {
        int n1 = 1;
        int p1 = 1;
        if (m < n2) {
            n1 = -1;
            p1 = -1;
        } else {
            int boxAmount = m * (p2 - 1) + n2;
            if (k1 != 1) {
                if (boxAmount == 1) {
                    if (m == 1) {
                        if (k1 > k2) {
                            p1 = 0;
                        }
                    } else {
                        n1 = -1;
                        p1 = -1;
                    }
                } else {
                    int flatAmountOnTheFloor = k2 % boxAmount == 0 ? k2 / boxAmount : k2 / boxAmount + 1;
                    if (flatAmountOnTheFloor == 1) {
                        n1 = -1;
                        p1 = -1;
                    } else {
                            while (k1 > flatAmountOnTheFloor) {
                                k1 -= flatAmountOnTheFloor;
                                n1++;
                                if (n1 == m + 1) {
                                    n1 = 1;
                                    p1++;
                                }
                            }
                        }

                }
            }
        }
        System.out.println(p1 + " " + n1);
    }
}