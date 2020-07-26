package com.company;

public class MyMath {
    public static float[] multy(float[] dataX, float m) {
        float[] array = new float[dataX.length];
        for (int i = 0; i < dataX.length; i++) array[i] = dataX[i] * m;
        return array;
    }

    public static float[] sum(float[] dataX, float s) {
        float[] array = new float[dataX.length];
        for (int i = 0; i < dataX.length; i++) array[i] = dataX[i] + s;
        return array;
    }

    public static float getSumArray(float[] data) {
        float sum = 0;
        for (int i = 0; i < data.length; i++) sum += data[i];
        return sum;
    }

    public static float[] getNegativeArray(float[] data) {
        float[] array = new float[data.length];
        for (int i = 0; i < data.length; i++) array[i] = -data[i];
        return array;
    }
}
