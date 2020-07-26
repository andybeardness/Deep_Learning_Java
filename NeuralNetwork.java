package com.company;

import com.sun.source.tree.BreakTree;

public class NeuralNetwork {
    public static float[] getPrediction(float[] dataX, float a, float b, String type) {
        switch (type) {
            case "F1":
                float[] array;
                array = MyMath.multy(dataX, a);
                array = MyMath.sum(array, b);
                return array;
        }
        return null;
    }

    public static float[] getLoss(float[] dataY, float[] preds) {
        float[] array = new float[preds.length];
        for (int i = 0; i < preds.length; i++) {
            array[i] = dataY[i] - preds[i];
        }
        return array;
    }

    public static float[] getErrorsSquared(float[] dataLoss) {
        float[] array = new float[dataLoss.length];
        for (int i = 0; i < dataLoss.length; i++) {
            array[i] = (float) Math.pow(dataLoss[i], 2);
        }
        return array;
    }

    public static float getStepWeight(float dataX, float dataY, float weight, float lr) {
        float result;
        result  = dataX;  // idk, just for fun
        result *= weight; // prediction
        result -= dataY;  // loss
        result *= dataX;  // pre-step
        result *= lr;     // step!
        return result;
    }
}
