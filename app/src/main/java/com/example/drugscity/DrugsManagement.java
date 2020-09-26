package com.example.drugscity;


public class DrugsManagement {

    private String[][] choseList = new String[9][2];
    private String[] choseDrugList = new String[9];

    void addChoseDrug(String addDrug, int i){
        choseList[i][0] = addDrug;
        choseDrugList[i] = addDrug;
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

    String[] getChoseDrugList(){
        return choseDrugList;
    }

}
