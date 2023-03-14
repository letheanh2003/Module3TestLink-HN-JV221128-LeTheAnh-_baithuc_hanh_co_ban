package BT3;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] inArr = new int[50];
        for (int i = 0; i < inArr.length; i++) {
            inArr[i] = (int) Math.floor(Math.random() * 100);

        }
        //in mang
        System.out.println("Mang cua ban la: ");
        System.out.println(Arrays.toString(inArr));

        //sap xep mang tang dan
        System.out.println("mảng tăng dần và in mảng sau khi sắp xếp la: ");
        Arrays.sort(inArr);
        System.out.println(Arrays.toString(inArr));
    }
}
