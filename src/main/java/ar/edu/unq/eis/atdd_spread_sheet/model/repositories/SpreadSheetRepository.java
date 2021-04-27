package ar.edu.unq.eis.atdd_spread_sheet.model.repositories;

import ar.edu.unq.eis.atdd_spread_sheet.model.sheet.SpreadSheet;

public interface SpreadSheetRepository {
    SpreadSheet create(String name);

    SpreadSheet findBy(String name);
}
