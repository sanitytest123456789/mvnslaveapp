package com.mymuveapp.app;

public class calapp {
    private static String value;
    private static String secondValue;

    calapp(){}

    calapp(String newValue, String newSecondValue) {
        value = newValue;
        secondValue = newSecondValue;

    }

    public static void calculateValue(){
        System.out.println("New value to be calculated");

    }

    public static void setValue(String newValue){
        value = newValue;

    }

    public static void setSecondValue(String newSecondValue){
        secondValue = newSecondValue;
    }


}
