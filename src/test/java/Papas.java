public class Papas extends Item {
    private double costo;

    public Papas(double costo) {
        this.costo = costo;
    }

    @Override
    public double getCosto() {
        return this.costo;
    }
}
