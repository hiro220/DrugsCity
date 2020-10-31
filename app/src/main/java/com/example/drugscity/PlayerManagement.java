package com.example.drugscity;

import android.util.Log;

public class PlayerManagement {
    private fianal String TAG = "PlayerManagement";

    //プレイヤーのインスタンス
    private Player player = new Player();

    //CPUのインスタンス
    private CpuPlayer cpu1 = new CpuPlayer();
    private CpuPlayer cpu2 = new CpuPlayer();
    private CpuPlayer cpu3 = new CpuPlayer();
    private CpuPlayer cpu4 = new CpuPlayer();

    //プレイヤーのアクション管理のインスタンス
    private PhaseManagement phaseManage = new PhaseManagement();

    //役職管理のインスタンス
    private DrugsManagement drug = new DrugsManagement();

    //CPUの
    private playerBase[] playerData = new playerBase[];

    public void actionReset(){
        /***
         ターン開始時に各プレイヤーが受けたアクションをリセットする
         ***/

        playerBase.actionReset();
        Log.i(TAG, "actionReset: ");
    }
    
    public void decideActionSequence(){
        /***
         アクションの処理順序を決定し、各プレイヤーに自分のアクション処理順序を伝える
         ***/
        Log.i(TAG, "decideActionSequence: ");
    
    }

    public void decideAllAction(){
        /***
         各プレイヤーに行うアクションを決定するように通知する
         ***/

        //
        Log.i(TAG, "decideAllAction: ");

    }

    public void doAction(){
        /***
         事前に決定した順序で各プレイヤーが決めたアクションを処理していく
         ***/
        Log.i(TAG, "doAction: ");

    }

    public boolean isGameEnd(ArrayList<PlayerBase> playerList){
        /***
         現時点で残っているプレイヤーの人数を確かめ、1人のみならTrueをリターンする。 そうでないならFalseをリターンする
         ***/
        //脱落したプレイヤーの数
        int deadPlayerNum = 0;

        for(int i = 0; i < playerList.size(); i++) {
            //脱落したプレイヤーの数を数える
            if(playerList.get(i).isDead()){
                deadPlayerNum++;
            }
        }

        //プレイヤーが残り一人かどうか確認する
        if(playerList.size() - deadPlayerNum == 1){
            return true;
        }else{
            return false;
        }

        Log.i(TAG, "isGameEnd: ");
    }

    public void checkDrug(){
        /***
         各プレイヤーに確認したい麻薬を選択してもらい、該当するプレイヤーがいるならそのプレイヤーを、いないなら誰もいない旨を伝える
         ***/
        Log.i(TAG, "checkDrug: ");

    }
}
