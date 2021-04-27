package ar.edu.unq.eis.atdd_spread_sheet.delivery;

import ar.edu.unq.eis.atdd_spread_sheet.model.sheet.SpreadSheet;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.CreateSpreadSheet;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.GetCellFromSpreadSheet;

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
        GetCellFromSpreadSheet uc = new GetCellFromSpreadSheet(this.rep);

        Object content = uc.getCellFromSheet(spreadSheetName, cellDir);

        System.out.println(String.format("a1: %4d", content.toString()));

    }

    private void create(String name) {

        CreateSpreadSheet uc = new CreateSpreadSheet(this.rep);

        String spreadSheetName = name;

        uc.create(spreadSheetName);

    }
}
