public class PackCoca {
    private final float cantidad;
    private final float costo;

    public PackCoca(int cantidad, float costo) {
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public Item getItem() {
        return new Coca(this.costo / this.cantidad);
    }
}
