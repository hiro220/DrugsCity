package com.example.drugscity;

import java.util.Random;

public class CpuPlayer extends PlayerBase{
    private int actionNumber;
    private int drugNumber;

    void selectCpuDrug(){
        drugNumber = randomInt();
    }

    void selectCpuAction(){
        actionNumber = randomInt();
    }

    int getDrugNumber(){
        return drugNumber;
    }

    int getActionNumber(){
        return actionNumber;
    }

    //0~9の整数をランダムに返す
    int randomInt() {
        Random rand = new Random();
        return rand.nextInt(10);
    }
}
