package com.example.drugscity;

public class PlayerManagement {
    //プレイヤーのインスタンス
    player p1 = new player();

    //CPUのインスタンス
    cpu_player c1 = new cpu_player();
    cpu_player c2 = new cpu_player();
    cpu_player c3 = new cpu_player();
    cpu_player c4 = new cpu_player();

    //プレイヤーのアクション管理のインスタンス
    PhaseManagement phase = new PhaseManagement();

    //役職管理のインスタンス
    DrugData drug = new DrugData();

    //ターン開始時に各プレイヤーが受けたアクションをリセットする
    public void actionReset(){

    }

    //アクションの処理順序を決定し、各プレイヤーに自分のアクション処理順序を伝える
    public void decideActionSequence(){

    }
    //各プレイヤーに行うアクションを決定するように通知する
    public void decideAllAction(){

    }

    //事前に決定した順序で各プレイヤーが決めたアクションを処理していく
    public void doAction(){

    }

    //現時点で残っているプレイヤーの人数を確かめ、1人のみならTrueをリターンする。 そうでないならFalseをリターンする
    public void isGameEnd(){

    }

    //各プレイヤーに確認したい麻薬を選択してもらい、該当するプレイヤーがいるならそのプレイヤーを、いないなら誰もいない旨を伝える
    public void checkDrug(){

    }
}
