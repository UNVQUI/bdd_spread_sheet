import gradle.cucumber.SpreadSheet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SpreadSheetTest {
    @Test
    public void testSpreadsheetWithA1andA2ValueRetrieving() {
        SpreadSheet sheet = new SpreadSheet();

        sheet.set("a1", "label");
        sheet.set("a2", 1);

        assertEquals( 1, sheet.get("a2"));
        assertEquals( "label", sheet.get("a1"));

    }
}
