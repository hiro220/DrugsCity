package com.example.drugscity;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DrugData {

    //drugの名称
    public static final String mazaiName = "魔剤";
    public static final String grassName = "草";
    public static final String powderMintName = "パウダーミント";
    public static final String mouseName = "マウス";
    public static final String smokyAromaName = "スモーキーアロマ";
    public static final String jokerName = "ジョーカー";
    public static final String spiderDrugName = "スパイダードラッグ";
    public static final String peridotName = "ペリドット";
    public static final String nShotName = "nShot";
    public static final String lifeBugName = "ライフバグ";

    //敗北条件
    public static final String mazaiDefCon[] = {"5", "8"};
    public static final String grassDefCon[] = {"2", "9"};
    public static final String powderMintDefCon[] = {"10", "1"};
    public static final String mouseDefCon[] = {"7", "4"};
    public static final String smokyAromaDefCon[] = {"3", "10"};
    public static final String jokerDefCon[] = {"1", "6"};
    public static final String spiderDefCon[] = {"9", "2"};
    public static final String peridotDefCon[] = {"6", "3"};
    public static final String nShotDefCon[] = {"4", "7"};
    public static final String lifeBugDefCon[] = {"8", "5"};

    //追加される敗北条件
    public static final String addmazaiDefCon[] = {"4"};
    public static final String addgrassDefCon[] = {"5"};
    public static final String addpowderMintDefCon[] = {"3"};
    public static final String addmouseDefCon[] = {"2"};
    public static final String addsmokyAromaDefCon[] = {"1"};
    public static final String addjokerDefCon[] = {"3"};
    public static final String addspiderDefCon[] = {"4"};
    public static final String addperidotDefCon[] = {"5"};
    public static final String addnShotDefCon[] = {"2"};
    public static final String addlifeBugDefCon[] = {"1"};

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

private class DrugDataFrame {

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
