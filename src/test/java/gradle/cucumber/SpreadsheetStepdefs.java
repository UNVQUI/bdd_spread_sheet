package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sheet.Direccion;
import sheet.SpreadSheet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class SpreadsheetStepdefs {
    private SpreadSheet sheet;

    @Given("^Empty spreadsheet$")
    public void emptySpreadsheet() {

        sheet = new SpreadSheet();
    }

    @When("^I set \"([^\"]*)\" content with \"([^\"]*)\"$")
    public void iSetContentWith(String direccion, String valor) throws Throwable {

        Direccion a1 = new Direccion(direccion);
        Integer numeroUno = Integer.parseInt(valor);

        sheet.set(a1, numeroUno);
    }

    @Then("^The cell \"([^\"]*)\" has value \"([^\"]*)\"$")
    public void theCellHasValue(String direccion, String valor) throws Throwable {
        Integer unNumero = (Integer)sheet.get( direccion );

        Integer expectec = Integer.parseInt(valor);
        assertEquals( expectec, unNumero);
    }
}
