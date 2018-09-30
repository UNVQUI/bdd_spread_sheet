package gradle.cucumber;

public class Formula {
    public Formula(String formulaAsString) {
    }

    public Identity createUsing(SpreadSheet spreadSheet) {
        return new Identity(spreadSheet.getReference("a1"));
    }
}
