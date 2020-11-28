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

    //ゲームに参加してるプレイヤー情報のインスタンス
    private playerBase[] playerData = new playerBase[];

    public void actionReset(){
        /***
         ターン開始時に各プレイヤーが受けたアクションをリセットする
         ***/

        Log.i(TAG, "actionReset: ");

        playerBase.actionReset();
    }
    
    public void decideActionSequence(){
        /***
         アクションの処理順序を決定し、各プレイヤーに自分のアクション処理順序を伝える
         ***/
        Log.i(TAG, "decideActionSequence: ");

        //各プレイヤーの行動順を取得する
        playerNum = player.setTurn();
        cpu1Num = cpu1.setTurn();
        cpu2Num = cpu2.setTurn();
        cpu3Num = cpu3.setTurn();
        cpu4Num = cpu4.setTurn();
    }

    public void decideAllAction(){
        /***
         各プレイヤーに行うアクションを決定するように通知する
         ***/

        Log.i(TAG, "decideAllAction: ");

    }

    public void doAction(){
        /***
         事前に決定した順序で各プレイヤーが決めたアクションを処理していく
         ***/
        Log.i(TAG, "doAction: ");

    }

    public boolean isGameEnd(){
        /***
         現時点で残っているプレイヤーの人数を確かめ、1人のみならTrueをリターンする。 そうでないならFalseをリターンする
         ***/
        Log.i(TAG, "isGameEnd: ");

        //脱落したプレイヤーの数
        int deadPlayerNum = 0;

        for(int i = 0; i < playerData.size(); i++) {
            //脱落したプレイヤーの数を数える
            if(playerData.get(i).isDead()){
                deadPlayerNum++;
            }
        }

        //プレイヤーが残り一人かどうか確認する
        if(playerData.size() - deadPlayerNum == 1){
            return true;
        }else{
            return false;
        }
    }

    public void checkDrug(){
        /***
         各プレイヤーに確認したい麻薬を選択してもらい、該当するプレイヤーがいるならそのプレイヤーを、いないなら誰もいない旨を伝える
         ***/
        Log.i(TAG, "checkDrug: ");

        for(int i = 0; i < playerData.size(); i++) {
            //脱落したプレイヤーの数を数える
            if(playerData.getDrug){
                deadPlayerNum++;
            }
        }
    }
}
