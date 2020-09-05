package com.example.drugscity;

import java.util.Collections;

public class PhaseManagement {

    //順番を格納する関数 & 引数でプレイヤーとCPUのインスタンスをArrayListでほしい
    void setTurnNum(ArrayList<PlayerBase> playerList) {
        /***
         引数のArrayListの中身の順番を変えて、アクションする順番を決める
         ***/
        int cnt = 1;

        //ArrayListの中身の順番を変える
        Collections.shuffle(playerList);

        for(int i = 0; i < playerList.size(); i++) {
            //脱落したプレイヤーだったら飛ばす
            if(playerList.get(i).isDead()){
                continue;
            }

            playerList.get(i).setTurn(cnt);
            cnt++;
        }
    }

}
