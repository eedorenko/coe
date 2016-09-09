package com.eproseed.coe.common.view.errorhandler;

import java.sql.SQLIntegrityConstraintViolationException;

import oracle.adf.model.binding.DCErrorHandlerImpl;

import oracle.jbo.DMLConstraintException;

public class EproseedCoeErrorHandler extends DCErrorHandlerImpl {
    public EproseedCoeErrorHandler() {
        super();
    }


    protected boolean skipException(Exception ex) {
        if (ex instanceof DMLConstraintException) {
            return false;
        } else if (ex instanceof SQLIntegrityConstraintViolationException) {
            return true;
        }
        return super.skipException(ex);
    }


}
