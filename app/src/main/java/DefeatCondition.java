import java.util.Stack;

public class DefeatCondition {

    public Stack<String> drugOrigin;
    public DrugDataFrame drugStatus;
    private Stack DrugdataBuf;

    DefeatCondition(DrugDataFrame drugData) {
        drugOrigin = drugData.defCondition;
        drugStatus = drugData;
    }

}
