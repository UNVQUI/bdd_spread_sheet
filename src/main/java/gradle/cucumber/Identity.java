package gradle.cucumber;

public class Identity implements Content {
    private final Cell cell;

    public Identity(Cell value) {
        this.cell = value;
    }

    @Override
    public Object getCell() {
        return this.cell.getValue();
    }
}
