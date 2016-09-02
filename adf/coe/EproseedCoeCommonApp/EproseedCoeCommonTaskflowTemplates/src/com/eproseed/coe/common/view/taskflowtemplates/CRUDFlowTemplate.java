package com.eproseed.coe.common.view.taskflowtemplates;

import java.io.Serializable;

import oracle.adf.model.BindingContext;
import oracle.adf.model.DataControlFrame;
import oracle.adf.model.binding.DCDataControl;

public class CRUDFlowTemplate implements Serializable {
    @SuppressWarnings("compatibility:-541149651630277654")
    private static final long serialVersionUID = 1L;

    public CRUDFlowTemplate() {
        super();
    }
    
    private String savePointHandle;

    
    private DCDataControl getCurrentRootDataControl() {
        BindingContext context = BindingContext.getCurrent();
        DataControlFrame dcFrame = context.dataControlFrame();
        return dcFrame.findDataControl("EproseedCoeServiceDataControl");

    }
    
    
    public void createSavePoint() {
        savePointHandle = (String) getCurrentRootDataControl().createSavepoint();
    }
    

    public void restoreSavePoint() {
      getCurrentRootDataControl().restoreSavepoint(savePointHandle);
    }
    
}
