package com.eproseed.coe.assignments.view.assignmentstaskflow;

import com.eproseed.coe.common.view.utils.ADFUtils;



import javax.faces.event.ActionEvent;
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
}
