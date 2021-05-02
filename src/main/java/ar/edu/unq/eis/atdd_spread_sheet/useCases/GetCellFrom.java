package ar.edu.unq.eis.atdd_spread_sheet.useCases;

import ar.edu.unq.eis.atdd_spread_sheet.model.repositories.SpreadSheetRepository;

public class GetCellFrom {

    private SpreadSheetRepository repository;

    public GetCellFrom(SpreadSheetRepository repository) {

        this.repository = repository;
    }

    public Object getCellFromSheet(String spreadSheetName, String direccion) {
        return repository.findBy(spreadSheetName).get(direccion);
    }
}
