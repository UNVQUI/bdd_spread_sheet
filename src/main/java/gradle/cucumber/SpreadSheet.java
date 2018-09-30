package gradle.cucumber;

import java.util.ArrayList;
import java.util.List;

public class SpreadSheet {
    private List<Cell> cells;

    public SpreadSheet() {

        this.cells = new ArrayList<>();
    }
    public void set(String cellAddress, Integer i) {

        this.cells.add( new Cell(new CellAddress(cellAddress), i));
    }

    public void set(String cellAddress, String label) {

        this.cells.add( new Cell(new CellAddress(cellAddress), label));
    }

    public void set(String cellAddress, Identity function) {
        this.cells.add( new Cell(new CellAddress(cellAddress), function));
    }

    public Object get(String cellAddress) {
        CellAddress ca = new CellAddress(cellAddress);

        Cell cellWithValue = this.findCellBy(ca);

        return cellWithValue.getValue();
    }

    public Cell getReference(String cellAddress) {
        CellAddress ca = new CellAddress("a1");

        return  this.findCellBy(ca);
    }

    private Cell findCellBy(CellAddress cellAddress) {
        for( Cell c : this.cells) {
            if (c.isAddressedBy(cellAddress) ) {
                return c;
            }
        }
        return null;
    }
}
