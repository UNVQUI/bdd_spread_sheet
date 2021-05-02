package ar.edu.unq.eis.atdd_spread_sheet.infrastructure;

import ar.edu.unq.eis.atdd_spread_sheet.model.repositories.SpreadSheetRepository;
import ar.edu.unq.eis.atdd_spread_sheet.model.sheet.SpreadSheet;

import java.util.ArrayList;

public class InMemoryRepositoryForSpreadSheet implements SpreadSheetRepository {

    private final ArrayList<SpreadSheet> spreadSheets;

    public InMemoryRepositoryForSpreadSheet() {
        spreadSheets = new ArrayList<SpreadSheet>();
    }

    @Override
    public SpreadSheet create(String name) {
        spreadSheets.add( new SpreadSheet(name));
        return spreadSheets.get(spreadSheets.size() - 1);
    }

    @Override
    public SpreadSheet findBy(String name) {
        return spreadSheets.get(0);
    }
}
