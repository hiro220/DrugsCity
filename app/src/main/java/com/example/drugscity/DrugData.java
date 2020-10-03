package com.example.drugscity;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DrugData {

    //drugの名称
    private static final String mazaiName = "魔剤";
    private static final String grassName = "草";
    private static final String powderMintName = "パウダーミント";
    private static final String mouseName = "マウス";
    private static final String smokyAromaName = "スモーキーアロマ";
    private static final String jokerName = "ジョーカー";
    private static final String spiderDrugName = "スパイダードラッグ";
    private static final String peridotName = "ペリドット";
    private static final String nShotName = "nShot";
    private static final String lifeBugName = "ライフバグ";

    //敗北条件
    private static final String mazaiDefCon[] = {"5", "8"};
    private static final String grassDefCon[] = {"2", "9"};
    private static final String powderMintDefCon[] = {"10", "1"};
    private static final String mouseDefCon[] = {"7", "4"};
    private static final String smokyAromaDefCon[] = {"3", "10"};
    private static final String jokerDefCon[] = {"1", "6"};
    private static final String spiderDefCon[] = {"9", "2"};
    private static final String peridotDefCon[] = {"6", "3"};
    private static final String nShotDefCon[] = {"4", "7"};
    private static final String lifeBugDefCon[] = {"8", "5"};

    //追加される敗北条件
    private static final String addmazaiDefCon[] = {"4"};
    private static final String addgrassDefCon[] = {"5"};
    private static final String addpowderMintDefCon[] = {"3"};
    private static final String addmouseDefCon[] = {"2"};
    private static final String addsmokyAromaDefCon[] = {"1"};
    private static final String addjokerDefCon[] = {"3"};
    private static final String addspiderDefCon[] = {"4"};
    private static final String addperidotDefCon[] = {"5"};
    private static final String addnShotDefCon[] = {"2"};
    private static final String addlifeBugDefCon[] = {"1"};

    //drugデータの作成
    public static final DrugDataFrame mazai = new DrugDataFrame(mazaiName, mazaiDefCon, addmazaiDefCon);
    public static final DrugDataFrame grass = new DrugDataFrame(grassName, grassDefCon, addgrassDefCon);
    public static final DrugDataFrame powder = new DrugDataFrame(powderMintName, powderMintDefCon, addpowderMintDefCon);
    public static final DrugDataFrame mouse = new DrugDataFrame(mouseName, mouseDefCon, addmouseDefCon);
    public static final DrugDataFrame smoky = new DrugDataFrame(smokyAromaName, smokyAromaDefCon, addsmokyAromaDefCon);
    public static final DrugDataFrame joker = new DrugDataFrame(jokerName, jokerDefCon, addjokerDefCon);
    public static final DrugDataFrame spider = new DrugDataFrame(spiderDrugName, spiderDefCon, addspiderDefCon);
    public static final DrugDataFrame peridot = new DrugDataFrame(peridotName, peridotDefCon, addperidotDefCon);
    public static final DrugDataFrame nShot = new DrugDataFrame(nShotName, nShotDefCon, addnShotDefCon);
    public static final DrugDataFrame lifebug = new DrugDataFrame(lifeBugName, lifeBugDefCon, addlifeBugDefCon);
}

class DrugDataFrame {

    public String name; //drugの名称
    public Stack<String> defCondition = new Stack<String>(); //drugの敗北条件
    public String[] addDefCon;  //追加される敗北条件

    DrugDataFrame(String drugName, String defeatCondition[], String addDefeatCondition[]) {
        name = drugName;
        addDefCon = addDefeatCondition;
        //stackに敗北条件をpush
        for (String defData: defeatCondition) {
            defCondition.push(defData);
        }

    }
}
