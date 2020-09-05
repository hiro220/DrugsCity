package com.example.drugscity;

public class PlayerBase {
    private String drug;  //プレイヤーの選択した麻薬
    private String currentAction;  //プレイヤーの選択したアクション
    private int    turnNum;  //プレイヤーの行動順
    private boolean alive; //プレイヤーが生存しているか

    //プレイヤーが使用する麻薬を選択する
    public void selectDrug() {
    }

    //プレイヤーがそのターン使用するアクションを選択する
    public void selectAction() {
    }

    public boolean isDead() { return !(alive); }

    public void setDrug(String drugname) { drug = drugname; }

    public void setAction(String action) {
        currentAction = action;
    }

    public void setTurn(int turn) { turnNum = turn; }

    public String getDrug() {
        return drug;
    }

    public String getAction() {
        return currentAction;
    }

    public int getTurn() {
        return turnNum;
    }
}
