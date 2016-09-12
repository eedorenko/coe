package com.eproseed.coe.main.view.controller;


import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;
/**
 * This class manages the dynamic region on the index page
 * It provides the memory of which task flow is currently selected within the 
 * region and the methods to switch that value
 */
public class MainDynamicRegionManager implements Serializable {
    @SuppressWarnings("compatibility:-5329817642937831563")
    private static final long serialVersionUID = -4633485426455218156L;
    private static final String DASHBOARD_TASKFLOW   = "/WEB-INF/com/eproseed/coe/dashboard/view/dashboardtaskflow/DashboardTaskFlow.xml#DashboardTaskFlow";
    private static final String EMPLOYEES_TASKFLOW   = "/WEB-INF/com/eproseed/coe/employees/view/employeestaskflow/EmployeesTaskFlow.xml#EmployeesTaskFlow";
    private static final String DEPARTMENTS_TASKFLOW = "/WEB-INF/com/eproseed/coe/departments/view/departmentstasktlow/DepartmentsTaskFlow.xml#DepartmentsTaskFlow";
    private static final String ASSIGNMENTS_TASKFLOW = "/WEB-INF/com/eproseed/coe/assignments/view/assignmentstaskflow/AssignmentsTaskFlow.xml#AssignmentsTaskFlow";
    
    private String taskFlowId = DASHBOARD_TASKFLOW;
    private String activeRegion = "dashboard";

    public MainDynamicRegionManager() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String dashboard() {
        setDynamicTaskFlowId(DASHBOARD_TASKFLOW);
        setActiveRegion("dashboard");
        return null;
    }

    public String employees() {
        setDynamicTaskFlowId(EMPLOYEES_TASKFLOW);
        setActiveRegion("employees");
        return null;
    }

    public String departments() {
        setDynamicTaskFlowId(DEPARTMENTS_TASKFLOW);
        setActiveRegion("departments");
        return null;
    }
    public String assignments() {
        setDynamicTaskFlowId(ASSIGNMENTS_TASKFLOW);
        setActiveRegion("assignments");
        return null;
    }


    public void setActiveRegion(String activeRegion) {
        this.activeRegion = activeRegion;
    }

    public String getActiveRegion() {
        return activeRegion;
    }
}
