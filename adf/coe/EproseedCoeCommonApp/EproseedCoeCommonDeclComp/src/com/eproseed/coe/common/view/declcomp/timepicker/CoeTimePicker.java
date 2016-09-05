package com.eproseed.coe.common.view.declcomp.timepicker;

import com.eproseed.coe.common.view.utils.JSFUtils;


import java.sql.Timestamp;

import java.time.LocalDateTime;
import java.time.LocalTime;

import java.util.Map;


import oracle.adf.view.rich.component.fragment.UIXDeclarativeComponent;

import oracle.jbo.uicli.binding.JUCtrlAttrsBinding;


public class CoeTimePicker {
    public CoeTimePicker() {
        super();
    }

    public Integer getHours() {
        return getTime().getHour();
    }

    public void setHours(Integer value) {
        setTime(value, getMinutes());
    }

    public Integer getMinutes() {
        return getTime().getMinute();
    }

    public void setMinutes(Integer value) {
        setTime(getHours(), value);
    }

    private void setTime(int hours, int minutes) {
        LocalDateTime time = LocalDateTime.of(getTime().toLocalDate(), LocalTime.of(hours, minutes));
        getValueBinding().setInputValue(Timestamp.valueOf(time));
    }


    private LocalDateTime getTime() {
        Timestamp timeStampTime = (Timestamp) getValueBinding().getInputValue();
        return timeStampTime.toLocalDateTime();
    }

    private Map getAttributes() {
        return getMyself().getAttributes();
    }

    private JUCtrlAttrsBinding getValueBinding() {
       return (JUCtrlAttrsBinding) getAttributes().get("valueBinding");
    }


    public UIXDeclarativeComponent getMyself() {
        UIXDeclarativeComponent _this =
            (UIXDeclarativeComponent) JSFUtils.getValueObject("#{comp}", UIXDeclarativeComponent.class);
        return _this;
    }


}
