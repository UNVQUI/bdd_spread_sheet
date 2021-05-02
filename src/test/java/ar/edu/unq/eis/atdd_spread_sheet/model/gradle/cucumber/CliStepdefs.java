package ar.edu.unq.eis.atdd_spread_sheet.model.gradle.cucumber;

import ar.edu.unq.eis.atdd_spread_sheet.delivery.cli.CliAction;
import ar.edu.unq.eis.atdd_spread_sheet.infrastructure.InMemoryRepositoryForSpreadSheet;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.CreateSpreadSheet;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.GetCellFrom;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.SetCellContent;
import cucumber.api.PendingException;
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
        /***
         * Aquí va el código específico del mecanismo de despacho.Es una clase específica que
         * implementa el comportamiento específico. Pueden considerar el 'set' y el 'get' de los
         * valores de las celdas.
         */
        CreateSpreadSheet uc = new CreateSpreadSheet(sheetRepository);
        uc.create(spreadSheetName);
    }

    @When("^I write command set number \"([^\"]*)\"$")
    public void iWriteCommandSet(String cmdLine) throws Throwable {
        CliAction action = new CliAction(
                new GetCellFrom(this.sheetRepository),
                new SetCellContent(this.sheetRepository));

        action.executeNumber(cmdLine);

    }

    @Then("^I read value with command \"([^\"]*)\" and the value is \"([^\"]*)\"$")
    public void iReadValueWithCommandAndTheValueIs(String cmdLine, String expectedValue) throws Throwable {
        CliAction action = new CliAction(
                new GetCellFrom(this.sheetRepository),
                new SetCellContent(this.sheetRepository));

        Object actual = action.getNumber(cmdLine);
        Integer expected = Integer.parseInt(expectedValue);

        assertEquals(expected, actual);

    }
}
