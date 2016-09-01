package com.eproseed.coe.common.model.adfbc.base;

import oracle.jbo.AttributeList;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;

public class CoeEntityImpl extends EntityImpl {
    public CoeEntityImpl() {
        super();
    }
    
    protected void initializePrimaryKeyValue() {
        
    }

    @Override
    public void create(AttributeList attributeList) {
      super.create(attributeList);
      initializePrimaryKeyValue();
    }
      
    
    protected void initializeDefaultValues() {
        
    }


    @Override
    protected void initDefaultExpressionAttributes(AttributeList nameValuePair) { 
      super.initDefaultExpressionAttributes(nameValuePair);
      initializeDefaultValues();
    }
    
    protected Long getNextSequenceValue(String sequenceName) {
      SequenceImpl seq = new SequenceImpl(sequenceName, getDBTransaction());
      return seq.getSequenceNumber().longValue();
    }


}
