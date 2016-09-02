package com.eproseed.coe.common.view.taskflowtemplates.editflowtemplate;

import java.io.Serializable;

public class EditFlowTemplate implements Serializable {
    @SuppressWarnings("compatibility:-405673792501430433")
    private static final long serialVersionUID = 1L;


    private Serializable keyValue;
    
    
    public EditFlowTemplate() {
        super();
    }


    public void setKeyValue(Serializable keyValue) {
        this.keyValue = keyValue;
    }

    public Serializable getKeyValue() {
        return keyValue;
    }
}
