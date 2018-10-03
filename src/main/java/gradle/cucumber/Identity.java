package gradle.cucumber;

public class Identity implements  Contenido {
    private final Cell cell;

    public Identity(Cell aCell) {
        this.cell = aCell;
    }

    @Override
    public Object getValue() {
        return this.cell.getValue();
    }
}
