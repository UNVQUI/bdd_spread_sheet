package ar.edu.unq.eis.atdd_spread_sheet.useCases;

import ar.edu.unq.eis.atdd_spread_sheet.delivery.InMemoryRepositoryForSpreadSheet;
import ar.edu.unq.eis.atdd_spread_sheet.model.sheet.Direccion;
import ar.edu.unq.eis.atdd_spread_sheet.model.sheet.SpreadSheet;

public class SetCellFromSpreadSheet {
    private InMemoryRepositoryForSpreadSheet repository;

    public SetCellFromSpreadSheet(InMemoryRepositoryForSpreadSheet sheetRepository) {

        this.repository = sheetRepository;
    }

    public void setCellFromSheet(String spreadSheetName, String dir, int value) {
        SpreadSheet sheet = this.repository.findBy(spreadSheetName);

        sheet.set(dir, value);
    }

    public void setCellFromSheet(String spreadSheetName, String dir, String value) {
        SpreadSheet sheet = this.repository.findBy(spreadSheetName);

        sheet.set(dir, value);
    }
}
