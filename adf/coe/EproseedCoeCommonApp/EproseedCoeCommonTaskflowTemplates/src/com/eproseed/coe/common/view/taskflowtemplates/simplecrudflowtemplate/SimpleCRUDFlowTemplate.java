package com.eproseed.coe.common.view.taskflowtemplates.simplecrudflowtemplate;

import java.io.Serializable;

import oracle.adf.model.BindingContext;
import oracle.adf.model.DataControlFrame;
import oracle.adf.model.SavepointHandle;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.dcframe.DataControlFrameImpl;


public class SimpleCRUDFlowTemplate implements Serializable {
    @SuppressWarnings("compatibility:261460119439318919")
    private static final long serialVersionUID = 1L;

    public SimpleCRUDFlowTemplate() {
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
