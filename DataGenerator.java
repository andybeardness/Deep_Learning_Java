package com.company;

import java.util.Random;

public class DataGenerator {
    public static float[] getData(int min, int max, int rows) {
        float[]    array = new float[rows];
        MyRandom rand  = new MyRandom();
        for (int i = 0; i < rows; i++) {
            array[i] = (float) rand.getRandomInt(min, max);
        }
        return array;
    }

    public static float[] getData(int rows) {
        return getData(0, 10, rows);
    }

    public static float[][] getData(int min, int max, int rows, int cols) {
        float[][] array = new float[rows][cols];
        for (int j = 0; j < rows; j++) {
            array[j] = getData(min, max, cols);
        }
        return array;
    }

    public static float[][] getData(int rows, int cols) {
        return getData(0, 10, rows, cols);
    }

    public static float[] getGoalF1(float[] dataX, int a, int b) {
        float[] array = new float[dataX.length];
        for (int i = 0; i < dataX.length; i++) {
            array[i] = dataX[i] * a + b;
        }
        return array;
    }

    public static float[] getWeights(int shapeX) {
        float[] array = new float[shapeX];
        Random rand = new Random();
        for (int i = 0; i < shapeX; i++) {
            array[i] = rand.nextFloat();
        }
        return array;
    }

    public static float getWeights() {
        Random rand = new Random();
        return rand.nextFloat();
    }

    public static float[] arrayInt2arrayFloat(int[] data) {
        float[] array = new float[data.length];
        for (int i = 0; i < data.length; i++) {
            array[i] = (float) data[i];
        }
        return array;
    }
}