package com.example.drugscity;

import java.util.Collections;
import java.util.Comparator;

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
                playerList.get(i).setTurn(0);
                continue;
            }
            playerList.get(i).setTurn(cnt);
            cnt++;
        }
    }

    void checkTurn(ArrayList<PlayerBase> playerList){
        /***
         引数のplayerListにセットされている順番を最終確認する
         ***/
        //守るを選択したプレイヤーを探す
        for(int i = 0; i < playerList.size(); i++) {
            //defenceは守るアクションの仮の名前
            if(playerList.get(i).getAction == "defence"){
                playerList.get(i).setTurn(0);
            }
        }
        //playerListをアクションの順番でソートする
        Collections.sort(playerList, new Comparator<playerBase>(){
            @Override
            public int compare(playerList p1, playerList p2){
                return p1.getTurn() - p2.getTurn();
            }
        });
    }
}
