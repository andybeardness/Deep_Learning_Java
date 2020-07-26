package com.company;

public class PrintData {
    private static String upper    = "=====================    ";
    private static String upLine   = "======= PRINT =======    ";
    private static String downLine = "======== END ========\n\n";

    private static void printHeader(String header) {
        System.out.println(upper);
        System.out.println(header);
        System.out.println(upLine);
    }

    private static void printBottom() {
        System.out.println(downLine);
    }

    public static void print(float data, String header) {
        printHeader(header);
        System.out.println(data);
        printBottom();
    }

    public static void print(float[][] data, String header) {
        printHeader(header);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " : ");
            }
            System.out.println("");
        }
        printBottom();
    }

    public static void print(float[] data, String header) {
        printHeader(header);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        printBottom();
    }
}
