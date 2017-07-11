package ru.home.wrapper.wrapper;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Валентин on 18.06.2017.
 */
public class StringTask {
    private class Valek {
    }

    public Map map;
    public ArrayList l;
    public int[] а = new int[3];
    public int fа[] = {3, 4, 6};
    public int[] fа1[] = {{3, 4, 6}, new int[3]};

    public static void main(String[] args) {

        String s1 = "f f ff gggf  gg  fdf  121";
        String s2 = s1.replace("g", "e");
        System.out.println(s2);
        int i1 = s2.length() / 2;

        String s3 = s2.substring(0, i1 - 1);
        String s4 = s2.substring(i1);
        StringBuffer sbf = new StringBuffer(s4);
        System.out.println(s3 + sbf.reverse());

        char[] sc = s2.toCharArray();
        for (int i = 0; i < sc.length / 2 - 1; i++) {
            System.out.print(sc[i]);
        }
        for (int i = sc.length - 1; i >= sc.length / 2; i--) {
            System.out.print(sc[i]);
        }
//
    }
}
