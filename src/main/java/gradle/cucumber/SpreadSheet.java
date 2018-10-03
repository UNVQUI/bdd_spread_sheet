package gradle.cucumber;

import java.util.ArrayList;
import java.util.List;

public class SpreadSheet {
    private List<Cell> cells;

    public SpreadSheet() {
        this.cells = new ArrayList<>();
    }
    public void set(String cellAddress, Integer i) {

        this.cells.add( new ACell(cellAddress, i));
    }

    public void set(String cellAddress, String label) {

        this.cells.add( new ACell(cellAddress, label));
    }

    public Object get(String cellAddress) {
        Cell cell = this.getReference(cellAddress);
        return cell.getValue();
    }

    public Cell getReference(String cellAddressAsStr) {
        CellAddress address = new CellAddress(cellAddressAsStr);

        for(Cell another : this.cells) {
            if ( another.isAddressBy(address)) {
                return another;
            }
        }

        return new NoACell();
    }

    public void set(String cellAddress, Identity formula) {
        this.cells.add( new ACell(cellAddress, formula));
    }
}
