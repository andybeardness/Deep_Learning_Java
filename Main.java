package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        int dataMin = 0;
        int dataMax = 10;
        int dataRows = 10;

        float learningRate = 0.002f;

        float[] dataX = DataGenerator.getData(dataMin, dataMax, dataRows);
        float[] dataY = DataGenerator.getGoalF1(dataX, a, b);

        float dataWa = DataGenerator.getWeights();
        float dataWb = DataGenerator.getWeights();

        PrintData.print(dataX, "Data X");
        PrintData.print(dataY, "Data Y");

        PrintData.print(dataWa, "Weight A");
        PrintData.print(dataWb, "Weight B");

        float[] preds = NeuralNetwork.getPrediction(dataX, dataWa, dataWb, "F1");
        float[] loss  = NeuralNetwork.getLoss(dataY, preds);
        float[] errors = NeuralNetwork.getErrorsSquared(loss);

        PrintData.print(preds, "PREDS");
        PrintData.print(loss, "LOSS");
        PrintData.print(errors, "ERRORS");

        float sumError = MyMath.getSumArray(errors);

        PrintData.print(sumError, "SUM OF ERRORS");

//        float[] step = MyMath.sum()

        float X;
        float Y;
        float step;

        for (int epoch = 0; epoch < 10; epoch++) {
            System.out.println("CURRENT EPOCH == " + epoch);
            for (int cycle = 0; cycle < dataX.length; cycle++) {
                X = dataX[cycle];
                Y = dataY[cycle];
                step = NeuralNetwork.getStepWeight(X, Y, dataWa, learningRate);

                System.out.println("X      == " + X);
                System.out.println("Y      == " + Y);
                System.out.println("a      == " + a);
                System.out.println("STEP   == " + step);
                System.out.println("OLD Wa == " + dataWa);
                dataWa -= step;
                System.out.println("NEW Wa == " + dataWa);
                System.out.println("\n\n");
            }
        }
    }
}
