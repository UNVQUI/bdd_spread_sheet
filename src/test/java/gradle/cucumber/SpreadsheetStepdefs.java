package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sheet.Direccion;
import sheet.SpreadSheet;
///import sheet.

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class SpreadsheetStepdefs {
    private SpreadSheet sheet;

    @Given("^Empty spreadsheet$")
    public void emptySpreadsheet() {

        sheet = new SpreadSheet();
    }

    @When("^I set \"([^\"]*)\" content with \"([^\"]*)\"$")
    public void iSetContentWithNumber(String direccion, String numero) throws Throwable {

        Direccion dir = new Direccion(direccion);
        Integer numeroUno = Integer.parseInt(numero);

        sheet.set(dir, numeroUno);
    }

    @When("^I set \"([^\"]*)\" content with '([^\"]*)'$")
    public void iSetContentWithStr(String direccion, String texto) throws Throwable {

        Direccion dir = new Direccion(direccion);

        sheet.set(dir, texto);
    }

    @Then("^The cell \"([^\"]*)\" has value \"([^\"]*)\"$")
    public void theCellHasValueNumber(String direccion, String valor) throws Throwable {
        Integer unNumero = (Integer) sheet.get(direccion);

        Integer expectec = Integer.parseInt(valor);
        assertEquals(expectec, unNumero);
    }

    @Then("^The cell \"([^\"]*)\" has value '([^\"]*)'$")
    public void theCellHasValueStr(String direccion, String valor) throws Throwable {
        Object content = sheet.get(direccion);

        Object expected = valor;
        assertEquals(expected, content);
    }


    @And("^I set \"([^\"]*)\" using a formula suma \"([^\"]*)\" \"([^\"]*)\"$")
    public void iSetUsingAFormulaSuma(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Integer unNumero = (Integer) sheet.get(arg1);
        Integer otroNumero = (Integer) sheet.get(arg2);

        Direccion dir = new Direccion(arg0);
        Integer numeroUno = unNumero + otroNumero;

        sheet.set(dir, numeroUno);
    }

    @When("^I set \"([^\"]*)\" using a formula \"=suma([^\"]*)\"$")
    public void iSetUsingAFormula(String direccion, String direcciones) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String [] dir = direcciones.replace("(","").replace(")","").split(",");

        Direccion dire = new Direccion(direccion);
        Integer unNumero = (Integer) sheet.get((dir[0]));
        Integer otroNumero = (Integer) sheet.get((dir[1]));

        sheet.set(dire, unNumero + otroNumero);
    }

}