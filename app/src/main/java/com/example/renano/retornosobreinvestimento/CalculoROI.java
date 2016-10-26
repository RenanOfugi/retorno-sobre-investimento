package com.example.renano.retornosobreinvestimento;

public class CalculoROI {

    public float calculaROI(float ganho, float investimento){

        float roi;

        roi = ((ganho - investimento)/investimento)*100;

        return roi;
    }
}

