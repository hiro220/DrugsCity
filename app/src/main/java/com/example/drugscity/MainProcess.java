package com.example.drugscity;

public class MainProcess {

    private PlayerManagement playerManage;
    private final int FASE_NUM = 3;

    public void mainGameLoop(){
        /***
            ゲームのメインループ処理
         ***/
        boolean isGameEnd = false;
        while (!isGameEnd){
            // 1ターンの処理
            isGameEnd = doThreeFase();
            playerManage.checkDrug();
        }
    }

    private boolean doThreeFase(){
        /***
         3フェーズ処理する
         ***/

        boolean isGameEnd = false;
        for (int i = 0; i < FASE_NUM; i++){
            isGameEnd = doOneFase();
            if (isGameEnd){
                return isGameEnd;
            }
        }
        // isGameEndは絶対にfalse
        return isGameEnd;
    }

    private boolean doOneFase(){
        /***
         1フェーズの処理
         ***/
        playerManage.decideActionSequence();
        playerManage.decideAllAction();
        playerManage.doAction();
        return playerManage.isGameEnd();
    }
}
