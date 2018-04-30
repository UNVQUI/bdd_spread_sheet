package gradle.cucumber;

import java.util.ArrayList;
import java.util.List;

public class SpreadSheet {
    private List<Cell> cells;

    public SpreadSheet() {
        this.cells = new ArrayList<>();
    }
    public void set(String cellAddress, Integer i) {

        this.cells.add( new Cell(cellAddress, i));
    }

    public void set(String cellAddress, String label) {

        this.cells.add( new Cell(cellAddress, label));
    }

    public Object get(String cellAddress) {
        return this.cells.get(0).getValue();
    }
}
