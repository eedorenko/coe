package com.eproseed.coe.assignments.model.adfbc.entities;

import com.eproseed.coe.common.model.adfbc.base.CoeEntityImpl;

import java.sql.Timestamp;

import java.time.LocalDate;

import java.time.LocalDateTime;

import java.time.LocalTime;

import java.time.ZoneId;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 01 11:04:58 CEST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------


public class AssignmentsImpl extends CoeEntityImpl {
    
    private final static String ASSIGNMENTS_SEQ="ASSIGNMENTS_SEQ";
    private final static LocalTime START_TIME=LocalTime.of(9,0);
    private final static LocalTime FINISH_TIME=LocalTime.of(18,0);
    
    
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AssignmentId,
        BusinessDate,
        EmployeeId,
        ProjectId,
        Starttime,
        Finishtime,
        Projects,
        Employees;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ASSIGNMENTID = AttributesEnum.AssignmentId.index();
    public static final int BUSINESSDATE = AttributesEnum.BusinessDate.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int STARTTIME = AttributesEnum.Starttime.index();
    public static final int FINISHTIME = AttributesEnum.Finishtime.index();
    public static final int PROJECTS = AttributesEnum.Projects.index();
    public static final int EMPLOYEES = AttributesEnum.Employees.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AssignmentsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.eproseed.coe.assignments.model.adfbc.entities.Assignments");
    }


    /**
     * Gets the attribute value for AssignmentId, using the alias name AssignmentId.
     * @return the value of AssignmentId
     */
    public Long getAssignmentId() {
        return (Long) getAttributeInternal(ASSIGNMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssignmentId.
     * @param value value to set the AssignmentId
     */
    public void setAssignmentId(Long value) {
        setAttributeInternal(ASSIGNMENTID, value);
    }

    /**
     * Gets the attribute value for BusinessDate, using the alias name BusinessDate.
     * @return the value of BusinessDate
     */
    public Timestamp getBusinessDate() {
        return (Timestamp) getAttributeInternal(BUSINESSDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BusinessDate.
     * @param value value to set the BusinessDate
     */
    public void setBusinessDate(Timestamp value) {
        setAttributeInternal(BUSINESSDATE, value);
    }

    /**
     * Gets the attribute value for EmployeeId, using the alias name EmployeeId.
     * @return the value of EmployeeId
     */
    public Long getEmployeeId() {
        return (Long) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeId.
     * @param value value to set the EmployeeId
     */
    public void setEmployeeId(Long value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the value of ProjectId
     */
    public Long getProjectId() {
        return (Long) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(Long value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for Starttime, using the alias name Starttime.
     * @return the value of Starttime
     */
    public Timestamp getStarttime() {
        return (Timestamp) getAttributeInternal(STARTTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Starttime.
     * @param value value to set the Starttime
     */
    public void setStarttime(Timestamp value) {
        setAttributeInternal(STARTTIME, value);
    }

    /**
     * Gets the attribute value for Finishtime, using the alias name Finishtime.
     * @return the value of Finishtime
     */
    public Timestamp getFinishtime() {
        return (Timestamp) getAttributeInternal(FINISHTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Finishtime.
     * @param value value to set the Finishtime
     */
    public void setFinishtime(Timestamp value) {
        setAttributeInternal(FINISHTIME, value);
    }

    /**
     * @return the associated entity com.eproseed.coe.common.model.adfbc.base.CoeEntityImpl.
     */
    public CoeEntityImpl getProjects() {
        return (CoeEntityImpl) getAttributeInternal(PROJECTS);
    }

    /**
     * Sets <code>value</code> as the associated entity com.eproseed.coe.common.model.adfbc.base.CoeEntityImpl.
     */
    public void setProjects(CoeEntityImpl value) {
        setAttributeInternal(PROJECTS, value);
    }


    /**
     * @return the associated entity com.eproseed.coe.common.model.adfbc.base.CoeEntityImpl.
     */
    public CoeEntityImpl getEmployees() {
        return (CoeEntityImpl) getAttributeInternal(EMPLOYEES);
    }

    /**
     * Sets <code>value</code> as the associated entity com.eproseed.coe.common.model.adfbc.base.CoeEntityImpl.
     */
    public void setEmployees(CoeEntityImpl value) {
        setAttributeInternal(EMPLOYEES, value);
    }

    /**
     * @param assignmentId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Long assignmentId) {
        return new Key(new Object[] { assignmentId });
    }

    @Override
    protected void initializePrimaryKeyValue() {
      setAssignmentId(getNextSequenceValue(ASSIGNMENTS_SEQ));   
    }
    
    
    private Timestamp constructTodayDateTime(LocalTime time) {
        LocalDateTime todayTime  = LocalDateTime.of(LocalDate.now(), time); 
        return Timestamp.valueOf(todayTime);
    }
    
    @Override
    protected void initializeDefaultValues() {
       setStarttime(constructTodayDateTime(START_TIME)); 
       setFinishtime(constructTodayDateTime(FINISH_TIME)); 
    }


}
