import java.util.Stack;

public class DefeatCondition {

    public DrugDataFrame drugStatus;     //敗北条件を管理する
    public Stack<String> popedDrugBuf;   //popされた敗北条件のデータを保存するバッファ
    private Stack DrugdataBuf;         //ドラッグ追加時に一時的に敗北条件を退避させるためのバッファ

    DefeatCondition(DrugDataFrame drugData) {
        drugOrigin = drugData.defCondition;
        drugStatus = drugData;
    }

    //攻撃が有効か判定し、敗北したかどうかを返す
    public int judgeAttack(String attackName) {
        //攻撃判定
        if(drugStatus.defCondition.peek() == attackName) {
            popedDrugBuf.push(drugStatus.pop());
        } else {
            while(popedDrugBuf.empty() != true) {
                drugStatus.push(popedDrugBuf.pop());
            }
        }

        //敗北判定
        if(drugStatus.empty()) {
            return 1;
        } else {
            return 0;
        }
    }

    //守る選択で敗北条件を追加
    public void addDrugCon() {
        while(drugStatus.empty() != true) {
            DrugdataBuf.push(drugStatus.pop());
        }
        drugStatus.push(drugStatus.addDefCon);
        while(DrugdataBuf.empty()) {
            DrugStatus.push(DrugdataBuf.pop());
        }
    }
}
