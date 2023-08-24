package Lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PhoneNumbers {
    public static void main(String[] args) throws Exception {
        String result = "";
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String phone = r.readLine();
        String phone1 = r.readLine();
        String phone2 = r.readLine();
        String phone3 = r.readLine();
        String intPhone = parseToInt(phone);
        String intPhone1 = parseToInt(phone1);
        String intPhone2 = parseToInt(phone2);
        String intPhone3 = parseToInt(phone3);
        System.out.println(compare(intPhone, intPhone1));
        System.out.println(compare(intPhone, intPhone2));
        System.out.println(compare(intPhone, intPhone3));
    }

    private static String parseToInt(String str) {
        char[] array = str.toCharArray();
        char[] rslArray = new char[11];
        int i = rslArray.length - 1;
        for (int j = array.length - 1; j >= 0; j--) {
            if (array[j] == '0' || array[j] == '1' || array[j] == '2' || array[j] == '3' || array[j] == '4' ||
                    array[j] == '5' || array[j] == '6' || array[j] == '7' || array[j] == '8' || array[j] == '9') {
                rslArray[i] = array[j];
                i--;
            }
        }
        if (rslArray[0] == '\u0000') {
            rslArray[0] = '8';
            rslArray[1] = '4';
            rslArray[2] = '9';
            rslArray[3] = '5';
        }
        if (rslArray[0] == '7') {
            rslArray[0] = '8';
        }
        StringBuilder str1 = new StringBuilder();
        for (char element : rslArray) {
            str1.append(element);
        }
        return str1.toString();
    }

    private static String compare(String a, String b) {
        return a.equals(b) ? "YES" : "NO";
    }
}