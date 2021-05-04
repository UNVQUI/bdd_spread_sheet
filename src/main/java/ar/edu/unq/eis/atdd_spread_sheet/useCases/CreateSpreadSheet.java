package ar.edu.unq.eis.atdd_spread_sheet.useCases;

import ar.edu.unq.eis.atdd_spread_sheet.model.repositories.SpreadSheetRepository;

public class CreateSpreadSheet {

    private SpreadSheetRepository repository;

    public CreateSpreadSheet(SpreadSheetRepository repository) {


        this.repository = repository;
    }

    public void create(String name) {


        repository.create(name);
    }

}
