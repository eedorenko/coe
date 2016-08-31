package com.eproseed.coe.common.view.taskflowtemplates.simplecrudflowtemplate;

import oracle.adf.model.BindingContext;
import oracle.adf.model.DataControlFrame;
import oracle.adf.model.SavepointHandle;


public class SimpleCRUDFlowTemplate {
    public SimpleCRUDFlowTemplate() {
        super();
    }
    
    private SavepointHandle savepointHandle;

    
    private DataControlFrame getCurrentDataControlFrame() {
        BindingContext context = BindingContext.getCurrent();
        String dcFrameName = context.getCurrentDataControlFrame();
        DataControlFrame dcFrame = context.findDataControlFrame(dcFrameName);
        return dcFrame;
    }
    
    
    public void createSavePoint() {
      DataControlFrame dcFrame = getCurrentDataControlFrame();
      savepointHandle = dcFrame.createSavepoint(); 
    }
    

    public void restoreSavePoint() {
      DataControlFrame dcFrame = getCurrentDataControlFrame();
      dcFrame.restoreSavepoint(savepointHandle);
    }

}
