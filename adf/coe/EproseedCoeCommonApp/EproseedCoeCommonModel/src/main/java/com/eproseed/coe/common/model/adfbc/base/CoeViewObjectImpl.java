package com.eproseed.coe.common.model.adfbc.base;

import oracle.jbo.Row;
import oracle.jbo.server.ViewDefImpl;
import oracle.jbo.server.ViewObjectImpl;

public class CoeViewObjectImpl extends ViewObjectImpl {
    public CoeViewObjectImpl(String string, ViewDefImpl viewDefImpl) {
        super(string, viewDefImpl);
    }

    public CoeViewObjectImpl() {
        super();
    }
    
    public void appendNewRow()
     {
       Row row = createRow();
       last();
       next();
       insertRow(row);
     }

}
