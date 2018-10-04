package gradle.cucumber;

public class Formula {
    private final String formulaStr;

    public Formula(String formulaStr) {
        this.formulaStr = formulaStr;
    }

    public Identity getFunction(SpreadSheet sheet) {
        return new Identity(sheet.getReference(this.cellReferenceStr()));
    }

    private String cellReferenceStr() {
        return this.formulaStr.substring(4,6);
    }
}
