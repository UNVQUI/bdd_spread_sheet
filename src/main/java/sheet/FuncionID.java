package sheet;

public class FuncionID {
    private String dir;
    private SpreadSheet sp;

    public FuncionID(String dirAsString) {
    dir = dirAsString;
    }

    public void setSpreadsheet(SpreadSheet spreadSheet) {
        sp = spreadSheet;
    }

    public Object value() {
        return sp.get(dir);
    }
}
