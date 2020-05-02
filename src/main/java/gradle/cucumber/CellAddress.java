package gradle.cucumber;

public class CellAddress {
    private final String cellAddressAsStr;

    public CellAddress(String cellAddressAsStr) {
        this.cellAddressAsStr = cellAddressAsStr;
    }

    @Override
    public boolean equals(Object another) {
        if ( !this.getClass().equals(another.getClass())) {
            return false;
        }
        CellAddress o = (CellAddress)another;
        return this.cellAddressAsStr.equals(o.cellAddressAsStr);
    }
}
