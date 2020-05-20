package sheet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SpreadSheetTest {
    private SpreadSheet sheet;

    @BeforeEach
    public void setup() {

        sheet = new SpreadSheet();
    }

    @Test
    public void testSetCellA2ThenGetA2ThenValueMatch() {
        /* Arrange */
        sheet.set("a2", 2);

        /* Act */
        Object numero = sheet.get("a2");

        /* Assert */
        assertEquals( 2, numero);

    }

    @Test
    public void testSetCellA1WithFunctionIdThenGetTheValueMatch(){
        FuncionID id = new FuncionID("a");
        Direccion dir = new Direccion("a1");
        sheet.set("a",2);
        sheet.set(dir,id);
        Object numero = sheet.get("a1");

        assertEquals( 2, numero);
    }
    @Test
    public void testSetCellA2WithFunctionIdThenGetTheValueMatch(){
        FuncionID id = new FuncionID("b");
        Direccion dir = new Direccion("a1");
        sheet.set("a",2);
        sheet.set("b",3);
        sheet.set(dir,id);
        Object numero = sheet.get("a1");

        assertEquals( 3, numero);
    }
}
