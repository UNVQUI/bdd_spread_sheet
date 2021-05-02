package ar.edu.unq.eis.atdd_spread_sheet.delivery.cli;

import ar.edu.unq.eis.atdd_spread_sheet.infrastructure.InMemoryRepositoryForSpreadSheet;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.CreateSpreadSheet;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.GetCellFrom;

public class CLI {

    private final InMemoryRepositoryForSpreadSheet rep;

    public CLI() {
        rep = new InMemoryRepositoryForSpreadSheet();

    }

    public static void main(String[] args) {
        CLI cli = new CLI();

        String name = "notas 2021-01";

        // If args are:
        //  create <name>
        {
            cli.create(name);
        }

        // If args are:
        //  get "a1" from <name>
        {
            cli.getCell(name, "a1");
        }
    }

    private void getCell(String spreadSheetName, String cellDir) {
        GetCellFrom uc = new GetCellFrom(this.rep);

        Object content = uc.getCellFromSheet(spreadSheetName, cellDir);

        System.out.println(String.format("a1: %4d", content.toString()));

    }

    private void create(String name) {

        CreateSpreadSheet uc = new CreateSpreadSheet(this.rep);

        String spreadSheetName = name;

        uc.create(spreadSheetName);

    }
}
