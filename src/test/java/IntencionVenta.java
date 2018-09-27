import java.util.ArrayList;
import java.util.List;

public class IntencionVenta {
    private List<Item> items;
    private float precioVenta;

    public IntencionVenta(Item item, float precioVenta) {
        this.items = new ArrayList<Item>();
        this.items.add(item);
        this.precioVenta = precioVenta;

    }

    public IntencionVenta(Item item, Papas papa, int precioVenta) {
        this.items = new ArrayList<Item>();
        this.items.add(item);
        this.items.add(papa);
        this.precioVenta = precioVenta;
    }

    public double renta() {
        return Math.max(0,this.precioVenta - this.costoAcumulado());
    }

    private double costoAcumulado() {
        double result = 0;

        for(Item i : this.items) {
            result += i.getCosto();
        }

        return result;
    }
}
