package ar.edu.unq.eis.atdd_spread_sheet.model.sheet;

import java.util.ArrayList;
import java.util.List;

public class SpreadSheet {
    private final String name;
    List<Cell> cells;

    public SpreadSheet() {
        cells = new ArrayList<Cell>();
        this.name = "unknown";
    }

    public SpreadSheet(String name) {

        cells = new ArrayList<Cell>();
        this.name = name;
    }

    public void set(Direccion a1, Integer numeroUno) {
        Cell newOne = findOrCreate(a1, numeroUno);
        if ( newOne == null) {
            cells.add(new Cell(a1, numeroUno));
        } else {
            newOne.setContenido(numeroUno);
        }
    }

    private Cell findOrCreate(Direccion a1, Integer defaultValue) {
        return cells.stream()
                .filter(c -> c.isAddressBy(a1))
                .findFirst()
                .orElse(null);
    }

    public void set(String dirComoStr, Integer numero) {
        Direccion direccion = new Direccion(dirComoStr);
        Cell theOne = cell(direccion);

        if (theOne == null) {
            theOne = new Cell(direccion);
            cells.add(theOne);
        }

        theOne.setContenido(numero);

    }

    public void set(String dirComoStr, String texto) {
        Direccion direccion = new Direccion(dirComoStr);
        Cell theOne = cell(direccion);

        if (theOne == null) {
            theOne = new Cell(direccion);
            cells.add(theOne);
        }

        theOne.setContenido(texto);

    }

    public void set(Direccion direccion, String texto) {
        Cell theOne = cell(direccion);

        if (theOne == null) {
            theOne = new Cell(direccion);
            cells.add(theOne);
        }

        theOne.setContenido(texto);

    }

    public Object get(String dirComoStr) {
        return get(new Direccion(dirComoStr));
    }

    public Object get(Direccion dir) {
        Cell theOne = cell(dir);

        return theOne.getContenido();
    }

    private Cell cell(Direccion direccion) {
        return cells.stream()
                .filter(c -> c.isAddressBy(direccion))
                .findFirst()
                .orElse(null);
    }
}