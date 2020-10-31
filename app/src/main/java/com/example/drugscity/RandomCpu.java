package com.example.drugscity;

import java.util.Random;

public class CpuPlayer extends PlayerBase{
    //配列の中身は仮
    private String[] actionList = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    private String[] drugList = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};

    private String selectActionName;
    private String selectDrugName;
    private DrugsManagement drugsManagement = new DrugsManagement();

    //ランダムで薬を選ぶ。一回選ばれた薬は選ばれない。
    void selectCpuDrug(){
        while(true){
            selectDrugName = drugList[randomInt()];
            //選んだことのない薬だったらループから抜ける
            if(!drugsManagement.isSearchDrug(selectDrugName)){
                drugsManagement.addChoseDrug(selectDrugName);
                break;
            }
        }

    }

    //ランダムでアクションを選ぶ
    void selectCpuAction(){
        selectActionName = actionList[randomInt()];
    }

    String getSelectDrugName(){
        return selectDrugName;
    }

    String getSelectActionName(){
        return selectDrugName;
    }

    //0~8の整数をランダムに返す
    int randomInt() {
        Random rand = new Random();
        return rand.nextInt(9);
    }
}
