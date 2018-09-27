import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChinoTest {
    @Test
    public void testRamiroCompraUnaCocaDe50PesosHabiendoCostad5LaRentaEs45() {
        Coca c = new Coca(5);
        IntencionVenta venta = new IntencionVenta(c, 50);

        double actual = venta.renta();

        assertEquals(45, actual, 0.01);
    }

    @Test
    public void testJoaquinCompraFasoDe100HabiendoCostad10LaRentaEs90() {
        Faso f = new Faso(10);
        IntencionVenta venta = new IntencionVenta(f, 100);

        double actual = venta.renta();

        assertEquals(90, actual, 0.01);
    }

    @Test
    public void testLucianaCompraPapas30HabiendoCostad40LaRentaEs0() {
        Papas p = new Papas(40);
        IntencionVenta venta = new IntencionVenta(p, 30);

        double actual = venta.renta();

        assertEquals(0, actual, 0.01);
    }

    @Test
    public void testFacundoCompraCoca50SiendoQueElChinoCompro200CocasA2() {
        PackCoca pack = new PackCoca(200, 2);
        IntencionVenta venta = new IntencionVenta(
                pack.getItem(),
                50
        );

        double actual = venta.renta();

        assertEquals(49.99, actual, 0.1);
    }

    @Test
    public void testFacundoCompraCoca50SiendoQueElChinoCompro2500CocasA20() {
        PackCoca pack = new PackCoca(2500, 20);
        IntencionVenta venta = new IntencionVenta(
                pack.getItem(),
                50
        );

        double actual = venta.renta();

        assertEquals(49.992, actual, 0.001);
    }

    @Test
    public void testFacundoCompraComboBajon150SiendoQueElChinoCompro2500CocasA20PapasDe30() {
        PackCoca pack = new PackCoca(2500, 20);
        Papas papa = new Papas(30);
        IntencionVenta venta = new IntencionVenta(
                pack.getItem(),
                papa,
                150
        );

        double actual = venta.renta();

        assertEquals(119.992, actual, 0.001);
    }
}
