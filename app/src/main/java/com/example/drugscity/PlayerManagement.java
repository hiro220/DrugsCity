package com.example.drugscity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PlayerManagement extends AppCompatActivity {

    //プレイヤーのインスタンス
    player p1 = new player();

    //CPUのインスタンス
    cpu_player c1 = new cpu_player();
    cpu_player c2 = new cpu_player();
    cpu_player c3 = new cpu_player();
    cpu_player c4 = new cpu_player();

    //プレイヤーのアクション管理のインスタンス
    PhaseManagement phase = new  PhaseManagement();

    //役職確認のインスタンス


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_management);
    }


}