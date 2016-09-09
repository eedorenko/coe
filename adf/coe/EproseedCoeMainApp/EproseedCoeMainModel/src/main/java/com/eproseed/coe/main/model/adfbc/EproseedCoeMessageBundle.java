package com.eproseed.coe.main.model.adfbc;

import java.util.ListResourceBundle;

public class EproseedCoeMessageBundle extends ListResourceBundle {


    public static final String INVALID_ASSIGNMENTS_TIMESL = "CK_ASSIGNMENTS_TIMES";


    private static final Object[][] sMessageStrings = new String[][] {
        { INVALID_ASSIGNMENTS_TIMESL, "Finish time should be greater then start time" } };

    /**Return String Identifiers and corresponding Messages in a two-dimensional array.
     */
    protected Object[][] getContents() {
        return sMessageStrings;
    }
}
