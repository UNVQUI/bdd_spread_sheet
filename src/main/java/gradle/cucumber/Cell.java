package gradle.cucumber;

public class Cell {

    private final CellAddress address;
    private final Content value;

    public Cell(CellAddress address, Integer i) {
        this.address = address;
        this.value = new Anumber(i);
    }

    public Cell(CellAddress address, String label) {
        this.address = address;
        this.value = new Label(label);
    }

    public Cell(CellAddress address, Identity function) {
        this.address = address;
        this.value = function;
    }

    public Object getValue() {
        return value.getCell();
    }

    public boolean isAddressedBy(CellAddress cellAddress) {
        return this.address.equals(cellAddress);
    }
}
