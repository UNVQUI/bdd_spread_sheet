package ar.edu.unq.eis.atdd_spread_sheet.useCases;

import ar.edu.unq.eis.atdd_spread_sheet.model.repositories.SpreadSheetRepository;
import ar.edu.unq.eis.atdd_spread_sheet.model.sheet.SpreadSheet;

public class GetCellFromSpreadSheet {

    private SpreadSheetRepository repository;

    public GetCellFromSpreadSheet(SpreadSheetRepository repository) {

        this.repository = repository;
    }

    public SpreadSheet findBy(String name) {

        return repository.findBy(name);
    }

    public Object getCellFromSheet(String spreadSheetName, String direccion) {
        return repository.findBy(spreadSheetName).get(direccion);
    }
}
