package com.eproseed.coe.assignments.view.assignmentstaskflow;

import com.eproseed.coe.common.view.utils.ADFUtils;



import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.OperationBinding;

public class AssignmentsBrowseView {
    public AssignmentsBrowseView() {
        super();
    }

    
    private void commit() {
        OperationBinding operationBinding = ADFUtils.findOperation("Commit");
        operationBinding.execute();        
    }
    
    
    private void approve() {
        OperationBinding operationBinding = ADFUtils.findOperation("approve");
        operationBinding.execute();        
        commit();
    }
    
    public void approveButtonActionListener(ActionEvent actionEvent) {
        approve();
    }

    public void dialogListener(DialogEvent dialogEvent) {
        OperationBinding operationBinding = ADFUtils.findOperation("approveAll");
        operationBinding.execute();        
        commit();

    }
}
