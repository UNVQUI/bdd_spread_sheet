package gradle.cucumber;

public class CellAddress {
    private final String address;

    public CellAddress(String address) {

        this.address = address;
    }

    @Override
    public boolean equals(Object other) {
        if ( !other.getClass().equals(this.getClass())) {
            return false;
        }

        CellAddress another = (CellAddress)other;

        return this.address.equals(another.address);
    }
}
