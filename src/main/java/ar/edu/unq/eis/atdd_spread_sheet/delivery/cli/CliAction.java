package ar.edu.unq.eis.atdd_spread_sheet.delivery.cli;

import ar.edu.unq.eis.atdd_spread_sheet.useCases.GetCellFrom;
import ar.edu.unq.eis.atdd_spread_sheet.useCases.SetCellContent;

public class CliAction {
    private static final String ACTION_GET_NUMBER = "getnumber";
    private static final String ACTION_SET_NUMBER = "setnumber";

    private GetCellFrom getCellFrom;
    private SetCellContent setCellContent;

    public CliAction(GetCellFrom getCellFrom, SetCellContent setCellContent) {

        this.getCellFrom = getCellFrom;
        this.setCellContent = setCellContent;
    }

    /***
     *
     * @param cmdLine "cli setnumber a1 1 from unknown"
     */
    public void executeNumber(String cmdLine) {
        String[] elements = cmdLine.split("\\s+");

        String action = elements[1];

        if ( action.equals(ACTION_SET_NUMBER)) {
            String spreadSheetName = elements[5];
            String dir = elements[2];
            int value = Integer.parseInt(elements[3]);

            this.setCellContent.setCellFromSheet(spreadSheetName, dir, value);
        }
    }

    /***
     *
     * @param cmdLine "cli getnumber a1 from unknown"
     * @return
     */
    public Object getNumber(String cmdLine) {
        String[] elements = cmdLine.split("\\s+");

        String action = elements[1];

        if ( action.equals(ACTION_GET_NUMBER)) {
            String spreadSheetName = elements[4];
            String dir = elements[2];

            return this.getCellFrom.getCellFromSheet(spreadSheetName, dir);
        }

        return null;
    }
}
