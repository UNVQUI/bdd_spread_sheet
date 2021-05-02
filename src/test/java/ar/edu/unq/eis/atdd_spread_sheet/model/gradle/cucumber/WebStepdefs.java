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

public class WebStepdefs {
    protected final String spreadSheetName = "unknown";
    protected InMemoryRepositoryForSpreadSheet sheetRepository;

    @Before
    public void beforeScenario() {
        sheetRepository = new InMemoryRepositoryForSpreadSheet();

    }

    @Given("^Empty spreadsheet from web$")
    public void emptySpreadsheetFromWeb() {
        // Aquí va el código específico del mecanismo de despacho. Es una clase específica que
        // implementa el comportamiento específico.
        //
        // Utilizo la acción Set para simplificar.
        CreateSpreadSheet uc = new CreateSpreadSheet(sheetRepository);
        uc.create(spreadSheetName);
    }

    @When("^I fill the input-text for the cell \"([^\"]*)\" with \"([^\"]*)\"$")
    public void iFillTheInputTextForTheCellWith(String direccion, String value) throws Throwable {
        // Aquí va el código específico del mecanismo de despacho. Es una clase específica que
        // implementa el comportamiento específico.
        //
        //
        // Utilizo la acción Set para simplificar.
        SetCellContent uc = new SetCellContent(sheetRepository);

        uc.setCellFromSheet(spreadSheetName, direccion, value);
    }

    @Then("^The div for the cell \"([^\"]*)\" has value \"([^\"]*)\"$")
    public void theDivForTheCellHasValue(String direccion, String expectedValue) throws Throwable {
        // Aquí va el código específico del mecanismo de despacho. Es una clase específica que
        // implementa el comportamiento específico.
        //
        // Utilizo la acción Set para simplificar.
        GetCellFrom uc = new GetCellFrom(sheetRepository);

        Object currentValue = uc.getCellFromSheet(spreadSheetName, direccion);

        String actual = "<p>".concat(currentValue.toString()).concat("</p>");
        String expected = "<p>".concat(expectedValue).concat("</p>");

        assertEquals(expected, actual);

    }
}
