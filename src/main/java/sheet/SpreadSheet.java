package sheet;

import java.util.ArrayList;
import java.util.List;

public class SpreadSheet {
    List<Cell> cells;

    public SpreadSheet() {

        cells = new ArrayList<Cell>();
    }

    public void sum(Direccion result, Direccion celda1, Direccion celda2) {
        Cell celdaResultado = cell(result);
        celdaResultado.setContenido((int) cell(celda1).getContenido() + (int) cell(celda2).getContenido());
        cells.remove(celdaResultado);
        cells.add(celdaResultado);
    }

    public void set(Direccion a1, Integer numeroUno) {
        Cell newOne = new Cell(a1, numeroUno);
        cells.add(newOne);
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