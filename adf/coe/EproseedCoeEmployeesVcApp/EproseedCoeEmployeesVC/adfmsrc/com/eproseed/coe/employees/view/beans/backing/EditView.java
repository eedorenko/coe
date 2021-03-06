package com.eproseed.coe.employees.view.beans.backing;



import java.util.Date;
import java.util.Map;

import oracle.adf.share.logging.ADFLogger;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.render.ClientEvent;

import com.eproseed.coe.employees.view.beans.FlowState;

/**
 * Holds event handlers specific to the ViewPerson fragment
 */
public class EditView {
    private static ADFLogger _logger = ADFLogger.createADFLogger(EditView.class);
    private static final String INFOTILE_EVENT_PAYLOAD = "index";
    private FlowState _pfState;
    private static final long day = (long) (1000 * 60 * 60 * 24);
    
    public EditView() {
    }

    public void setPfState(FlowState _pfState) {
        this._pfState = _pfState;
    }

    public FlowState getPfState() {
        return _pfState;
    }

    public void setSelectedTile(int selectedTile) {
        getPfState().setSelectedTile(selectedTile);
    }

    public int getSelectedTile() {
        return getPfState().getSelectedTile();
    }

    public void infoTileSelectionHandler(ClientEvent clientEvent) {
        Map eventParams = clientEvent.getParameters();
        if (eventParams.containsKey(INFOTILE_EVENT_PAYLOAD)){
            //Numerical values from JS come accross as doubles 
//            int selectedTile = Integer.parseInt((String)eventParams.get(INFOTILE_EVENT_PAYLOAD));
            int selectedTile = ((Double)eventParams.get(INFOTILE_EVENT_PAYLOAD)).intValue();
            _logger.info("Selected Infotile no: " + selectedTile);
            setSelectedTile (selectedTile);
            AdfFacesContext.getCurrentInstance().addPartialTarget(clientEvent.getComponent());
                
        }
    }

    public Date getTimelineStart() {
        return new Date(new Date().getTime() - (7 * day));
    }

    public Date getTimelineEnd() {
        return new Date(getTimelineStart().getTime() + (180 * day));
    }

}
