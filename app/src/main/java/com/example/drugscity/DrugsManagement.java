package com.example.drugscity;

public class DrugsManagement {

    String checkDrugs(ArrayList<PlayerBase> playerList, String targetDrug){
        /**
         * 引数のtargetDrugを持つplayerがいるか確認して、Stringで返す関数
         */

        for(int i = 0; i < playerList.size(); i++){
            if(playerList.get(i).isDead()){
                continue;
            }

            if(targetDrug.equals(playerList.get(i).getDrug())){
                //仮
                return "○○がtargetDrugを使用しています";
            }
        }
        //仮
        return "いません";
    }
}
