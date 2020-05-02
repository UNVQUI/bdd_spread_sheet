package gradle.cucumber;

public interface Cell {
    Object getValue();
    boolean isAddressBy(CellAddress address);
}
