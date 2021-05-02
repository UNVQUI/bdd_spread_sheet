package ar.edu.unq.eis.atdd_spread_sheet.model.gradle.cucumber;

import ar.edu.unq.eis.atdd_spread_sheet.delivery.InMemoryRepositoryForSpreadSheet;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.CreateSpreadSheet;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.GetCellFrom;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.SetCellContent;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CliStepdefs {
    protected final String spreadSheetName = "unknown";
    protected InMemoryRepositoryForSpreadSheet sheetRepository;

    @Before
    public void beforeScenario() {
        sheetRepository = new InMemoryRepositoryForSpreadSheet();

    }

    @Given("^Empty spreadsheet from cli$")
    public void emptySpreadsheet() {
        // Aquí va el código específico del mecanismo de despacho. Es una clase específica que
        // implementa el comportamiento específico.
        //
        // Ej.: CLIXYZ
        //
        // Utilizo la acción Set para simplificar.
        CreateSpreadSheet uc = new CreateSpreadSheet(sheetRepository);
        uc.create(spreadSheetName);
    }

    @When("^I write command set \"([^\"]*)\" content with number \"([^\"]*)\"$")
    public void iWriteCommandSetContentWith(String direccion, String value) throws Throwable {

        // Aquí va el código específico del mecanismo de despacho. Es una clase específica que
        // implementa el comportamiento específico.
        //
        // Ej.: CLIXYZ
        //
        // Utilizo la acción Set para simplificar.
        SetCellContent uc = new SetCellContent(sheetRepository);

        uc.setCellFromSheet(spreadSheetName, direccion, Integer.parseInt(value));
    }

    @Then("^The command returns \"([^\"]*)\" when cell is \"([^\"]*)\"$")
    public void theCommandReturnWhenCellIs(String text, String direccion) throws Throwable {
        // Aquí va el código específico del mecanismo de despacho. Es una clase específica que
        // implementa el comportamiento específico.
        //
        // Ej.: CLIGetCellValue.
        //   Este se encarga de concatenar la dirección, agrega ":" y le concatena el valor
        //   de la celda.
        //
        // Utilizo la acción Set para simplificar.
        GetCellFrom uc = new GetCellFrom(sheetRepository);

        Integer unNumero = (Integer) uc.getCellFromSheet(spreadSheetName, direccion);

        String actual = direccion.concat(": ").concat(unNumero.toString());
        String expected = text;

        assertEquals(expected, actual);
    }
}
