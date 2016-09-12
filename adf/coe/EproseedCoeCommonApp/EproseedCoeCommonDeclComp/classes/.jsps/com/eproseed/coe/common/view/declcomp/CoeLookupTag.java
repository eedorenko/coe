// Do not edit this file!
// This file has been automatically generated by ADF.
// 
package com.eproseed.coe.common.view.declcomp;

import oracle.adfinternal.view.faces.taglib.region.RichDeclarativeComponentTag;
import oracle.adf.view.rich.component.rich.fragment.RichDeclarativeComponent;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import javax.el.ValueExpression;
import javax.servlet.jsp.JspException;

public class CoeLookupTag extends RichDeclarativeComponentTag {

  public CoeLookupTag() {
  }

  public String getComponentType() {
    return "com.eproseed.coe.common.view.declcomp.CoeLookupComponentType";
  }

  protected String getViewId() {
    return "/com/eproseed/coe/common/view/declcomp/CoeLookup.jsf";
  }

  protected RichDeclarativeComponent createComponent() {
    return new CoeLookupComponent();
  }

  public void setValue(ValueExpression value) {
    this._value = value;
  }

  public void setModel(ValueExpression model) {
    this._model = model;
  }

  public void setDescrValue(ValueExpression descrValue) {
    this._descrValue = descrValue;
  }

  public void setPopupTitle(ValueExpression popupTitle) {
    this._popupTitle = popupTitle;
  }

  public void setLabel(ValueExpression label) {
    this._label = label;
  }

  public void setColumns(ValueExpression columns) {
    this._columns = columns;
  }

  public void setAutoSubmit(ValueExpression autoSubmit) {
    this._autoSubmit = autoSubmit;
  }

  public void setImmediate(ValueExpression immediate) {
    this._immediate = immediate;
  }

  public void setValueBinding(ValueExpression valueBinding) {
    this._valueBinding = valueBinding;
  }


  protected void setProperties(FacesBean bean) {
    super.setProperties(bean);
    if (_value != null)
      bean.setValueExpression(_VALUE_KEY, _value);
    if (_model != null)
      bean.setValueExpression(_MODEL_KEY, _model);
    if (_descrValue != null)
      bean.setValueExpression(_DESCRVALUE_KEY, _descrValue);
    if (_popupTitle != null)
      bean.setValueExpression(_POPUPTITLE_KEY, _popupTitle);
    if (_label != null)
      bean.setValueExpression(_LABEL_KEY, _label);
    if (_columns != null)
      bean.setValueExpression(_COLUMNS_KEY, _columns);
    if (_autoSubmit != null)
      bean.setValueExpression(_AUTOSUBMIT_KEY, _autoSubmit);
    if (_immediate != null)
      bean.setValueExpression(_IMMEDIATE_KEY, _immediate);
    if (_valueBinding != null)
      bean.setValueExpression(_VALUEBINDING_KEY, _valueBinding);
  }

  public void release() {
    super.release();
    _value = null;
    _model = null;
    _descrValue = null;
    _popupTitle = null;
    _label = null;
    _columns = null;
    _autoSubmit = null;
    _immediate = null;
    _valueBinding = null;
  }

  private ValueExpression _value;
  private ValueExpression _model;
  private ValueExpression _descrValue;
  private ValueExpression _popupTitle;
  private ValueExpression _label;
  private ValueExpression _columns;
  private ValueExpression _autoSubmit;
  private ValueExpression _immediate;
  private ValueExpression _valueBinding;

  private static final PropertyKey _VALUE_KEY = PropertyKey.createPropertyKey("value");
  private static final PropertyKey _MODEL_KEY = PropertyKey.createPropertyKey("model");
  private static final PropertyKey _DESCRVALUE_KEY = PropertyKey.createPropertyKey("descrValue");
  private static final PropertyKey _POPUPTITLE_KEY = PropertyKey.createPropertyKey("popupTitle");
  private static final PropertyKey _LABEL_KEY = PropertyKey.createPropertyKey("label");
  private static final PropertyKey _COLUMNS_KEY = PropertyKey.createPropertyKey("columns");
  private static final PropertyKey _AUTOSUBMIT_KEY = PropertyKey.createPropertyKey("autoSubmit");
  private static final PropertyKey _IMMEDIATE_KEY = PropertyKey.createPropertyKey("immediate");
  private static final PropertyKey _VALUEBINDING_KEY = PropertyKey.createPropertyKey("valueBinding");

}