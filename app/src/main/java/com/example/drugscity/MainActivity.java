package com.example.drugscity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MainProcess app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ゲーム処理実行（あとでスレッド化する）
        app = new MainProcess();
        app.mainGameLoop();
    }
}