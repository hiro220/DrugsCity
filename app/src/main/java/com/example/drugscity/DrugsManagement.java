package com.example.drugscity;


public class DrugsManagement {

    private String[][] choseList = new String[9][2];

    void addChoseDrug(String addDrug, int i){
        choseList[i][0] = addDrug;
    }

    void addResult(String addResult, int i){
        choseList[i][1] = addResult;
    }

    String getChoseDrug(int i){
        return choseList[i][0];
    }

    String getResult(int i){
        return choseList[i][1];
    }

}
