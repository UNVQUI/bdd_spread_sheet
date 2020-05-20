package sheet;

public class FunctionCell extends Cell {

    public FunctionCell(Direccion direccion) {
        super(direccion);
    }

    @Override
    public Object getContenido() {
        return ((FuncionID) contenido).value();
    }
}
