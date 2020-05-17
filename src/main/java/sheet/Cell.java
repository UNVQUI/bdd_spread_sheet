package sheet;

public class Cell {
    protected final Direccion direccion;
    protected Object contenido;

    public Cell(Direccion dir, Integer value) {

        this.direccion = dir;
        this.contenido = value;
    }

    public Cell(Direccion direccion) {
        this.direccion = direccion;
    }

    public boolean isAddressBy(Direccion direccion) {

        return direccion.equals(this.direccion);
    }

    public void setContenido(Object obj) {
        contenido = obj;
    }

    public Object getContenido() {

        return this.contenido;
    }
}
