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
        for (int i = 0; i < sc.length/2 - 1; i++) {
            System.out.print(sc[i]);
        }
        for (int i = sc.length - 1; i >= sc.length/2; i--) {
            System.out.print(sc[i]);
        }
//
}}
//
//        int n = 1;
//        System.out.println(int.class);

//        while (true) {
//            System.out.println("Костя балбес");
//        }
////        int i = 0;
////        for (  ;  ;  ) {return;}
//       int[][] i ={{2, 5, 7, 8, 3, 0},{2, 3}};
       //       int i1[] = new int[2];
//        int[] j = {1, 2, 3};
//        int[][] g = new int[2][3];
//        String s = "f f ff gggf  gg  fdf  121";
////        StringTask test = new StringTask() {
////
////        }

//        int i = 1;
//        int j;
//        switch (i){
//            case 1: j = 111;
//            break;
//            case 2: j = 222;
//            break;
//            default: j = 23;
//            break;
//        }
//}
//
//        Float x = 4f;
//        System.out.println(x.compareTo(3f));
//        System.out.println(x.compareTo(5f));
//        System.out.println(x.compareTo(8f));
//
//        Short z = 1;
//        int i = 3;
//        String s;
//        switch (i){
//            case 1: s="";
//                break;
//            case 2: s="";
//                break;
//            default: s = "";
//                break;}
//    }
//
//   static public void dfsaf (final String s){
//int i;
//
//    }
//private void dfsaf (int i) {}
//}
