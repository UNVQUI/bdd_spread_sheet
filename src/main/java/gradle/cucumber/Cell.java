package gradle.cucumber;

public class Cell {

    private final String address;
    private final Object value;

    public Cell(String address, Integer i) {
        this.address = address;
        this.value = i;
    }

    public Cell(String address, String label) {
        this.address = address;
        this.value = label;
    }

    public Object getValue() {
        return value;
    }
}
