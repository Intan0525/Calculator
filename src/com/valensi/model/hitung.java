/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

/**
 *
 * @author user
 */
public class hitung {

    int operator = 0;
    double operator1;
    double operator2;
    private double result;

    public void setOperand(String opr) {
        if (!opr.equals("")) {
            if (operator == 0) {
                operator1 = Double.valueOf(opr);
            } else {
                operator2 = Double.valueOf(opr);
            }
        }
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    /**
     * @return the result
     */
    public double getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(double hasil) {
        this.result = hasil;
    }

    public void process() {
        switch (operator) {
            case 1:
                result = operator1 + operator2;
                break;
            case 2:
                result = operator1 - operator2;
                break;

            case 3:
                result = operator1 * operator2;
                break;
            case 4:
                result = operator1 / operator2;
                break;
            case 5:
                result = operator1 % operator2;
                break;
            case 6:
                result = 1 / operator1;
                break;

        }
        operator1 = result;
    }

}
