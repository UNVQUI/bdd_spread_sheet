package gradle.cucumber;

import cucumber.api.PendingException;
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

    @Given("^Spreadsheet with values in b1 and c1$")
    public void spreadSheetWithValuesInB1AndC1() {
        sheet = new SpreadSheet();
        sheet.set(new Direccion("a1"),0);
        sheet.set(new Direccion("b1"),1);
        sheet.set(new Direccion("c1"),1);
    }

    @When("^I sum \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSumB1AndC1(String direccion1, String direccion2) throws Throwable {
        sheet.sum(new Direccion("a1"), new Direccion(direccion1), new Direccion(direccion2));
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
        Integer unNumero = (Integer)sheet.get( direccion );

        Integer expectec = Integer.parseInt(valor);
        assertEquals( expectec, unNumero);
    }

    @Then("^The cell \"([^\"]*)\" has value '([^\"]*)'$")
    public void theCellHasValueStr(String direccion, String valor) throws Throwable {
        Object content = sheet.get( direccion );

        Object expected = valor;
        assertEquals( expected, content);
    }

}
