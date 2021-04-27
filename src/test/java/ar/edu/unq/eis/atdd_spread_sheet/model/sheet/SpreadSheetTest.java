package ar.edu.unq.eis.atdd_spread_sheet.model.sheet;

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
}
