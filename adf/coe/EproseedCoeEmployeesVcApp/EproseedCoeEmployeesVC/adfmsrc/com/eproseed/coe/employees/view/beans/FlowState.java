package com.eproseed.coe.employees.view.beans;


import java.io.Serializable;


public class FlowState implements Serializable {
    @SuppressWarnings("compatibility:-3203265047838731727")
    private static final long serialVersionUID = 2958201727290755679L;

    
    //State holders for the flow input params
    private int _selectedTile = 0;
    private String _rowKeyId;

    
    public FlowState() {
    }
  


    public void setSelectedTile(int selectedTile) {
        this._selectedTile = selectedTile;
    }

    public int getSelectedTile() {
        return _selectedTile;
    }

    public void setRowKeyId(String rowKeyId) {
        this._rowKeyId = rowKeyId;
    }

    public String getRowKeyId() {
        return _rowKeyId;
    }


   

}
