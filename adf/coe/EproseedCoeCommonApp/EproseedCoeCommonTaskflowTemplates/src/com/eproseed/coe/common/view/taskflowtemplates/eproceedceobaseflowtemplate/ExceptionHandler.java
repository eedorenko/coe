package com.eproseed.coe.common.view.taskflowtemplates.eproceedceobaseflowtemplate;

import com.eproseed.coe.common.view.utils.JSFUtils;

import oracle.adf.controller.ControllerContext;
import oracle.adf.controller.ViewPortContext;

public class ExceptionHandler {
    public ExceptionHandler() {
        super();
    }
    
    public void handleException()
    {
      ControllerContext context = ControllerContext.getInstance();
      ViewPortContext currentRootViewPort = context.getCurrentViewPort();

      if (currentRootViewPort.isExceptionPresent())
      {
        Exception ex = currentRootViewPort.getExceptionData();
        if (ex != null)
        {
          JSFUtils.addFacesErrorMessage(ex.getMessage());
          JSFUtils.renderResponse();
        }
      }
    }    
}
