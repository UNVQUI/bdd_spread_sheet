package ar.edu.unq.eis.atdd_spread_sheet.model.sheet;

import java.util.Objects;

public class Direccion {
    private String direccion;

    public Direccion(String direccion) {

        this.direccion = direccion;
    }

    public Direccion() {
        direccion = "<indefinida>";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion1 = (Direccion) o;
        return Objects.equals(direccion, direccion1.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }
}
