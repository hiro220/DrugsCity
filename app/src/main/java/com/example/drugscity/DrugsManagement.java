package com.example.drugscity;


public class DrugsManagement {

    //選ばれた薬とその結果のリスト
    private String[][] choseList = new String[9][2];

    //選ばれた薬のみのリスト
    private String[] choseDrugList = new String[9];

    int listSize = 0;

    //二つのリストに選んだ薬を入れる
    void addChoseDrug(String addDrug){
        choseList[listSize][0] = addDrug;
        choseDrugList[listSize] = addDrug;
        listSize++;
    }

    //選んだ薬の結果をリストに入れる
    void addResult(String addResult){
        choseList[listSize][1] = addResult;
    }

    //引数の薬を選んだことがあるかを調べる
    Boolean isSearchDrug(String searchDrug){
        for(int i = 0; i <= listSize; i++){
            if(choseDrugList[i].equals(searchDrug)){
                return true;
            }
        }
        return false;
    }

    //引数の薬の結果を返す
    String getResult(String resultDrug){
        for(int i = 0; i <= listSize; i++){
            if(choseList[i][0].equals(resultDrug)){
                return choseList[i][1];
            }
        }
        return "";
    }

    //選んだ薬のリストを返す
    String[] getChoseDrugList(){
        return choseDrugList;
    }

}
