import java.util.Stack;

public class DefeatCondition {

    public Stack<String> drugOrigin;   //敗北条件を元の状態に戻すためのデータ
    public DrugDataFrame drugStatus;
    private Stack DrugdataBuf;         //一時的に敗北条件を退避させるためのバッファ

    DefeatCondition(DrugDataFrame drugData) {
        drugOrigin = drugData.defCondition;
        drugStatus = drugData;
    }

    //攻撃が有効か判定し、敗北したかどうかを返す
    public judgeAttack(String attackName) {
        if(drugStatus.defCondition.peek() == attackName) {
            drugStatus.pop();
        }

        if(drugStatus.empty) {
            return 1;
        } else {
            return 0;
        }
    }
}
