package gradle.cucumber;

public class ACell implements Cell {

    private final CellAddress address;
    private final Contenido value;

    public ACell(String address, Integer i) {
        this.address = new CellAddress(address);
        this.value = new ANumber(i);
    }

    public ACell(String address, String label) {
        this.address = new CellAddress(address);
        this.value = new ALabel(label);
    }

    public ACell(String address, Identity formula) {
        this.address = new CellAddress(address);
        this.value = formula;
    }

    public Object getValue() {
        return value.getValue();
    }

    public boolean isAddressBy(CellAddress address) {
        return this.address.equals(address);
    }
}
