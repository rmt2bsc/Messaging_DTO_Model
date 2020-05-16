//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.15 at 09:52:05 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for project_detail_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project_detail_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee_type" type="{}employeetype_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="employee_title" type="{}employee_title_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="employee" type="{}employee_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="client" type="{}client_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="project" type="{}project_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="employee_project" type="{}employee_project_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timesheet_status" type="{}timesheet_status_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timesheet_status_history" type="{}timesheet_status_history_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timesheet" type="{}timesheet_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="task" type="{}task_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="project_task" type="{}project_task_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="time_log" type="{}event_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="project_period" type="{}project_periods_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project_detail_group", propOrder = {
    "employeeType",
    "employeeTitle",
    "employee",
    "client",
    "project",
    "employeeProject",
    "timesheetStatus",
    "timesheetStatusHistory",
    "timesheet",
    "task",
    "projectTask",
    "timeLog",
    "projectPeriod"
})
public class ProjectDetailGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "employee_type")
    protected List<EmployeetypeType> employeeType;
    @XmlElement(name = "employee_title")
    protected List<EmployeeTitleType> employeeTitle;
    protected List<EmployeeType> employee;
    protected List<ClientType> client;
    protected List<ProjectType> project;
    @XmlElement(name = "employee_project")
    protected List<EmployeeProjectType> employeeProject;
    @XmlElement(name = "timesheet_status")
    protected List<TimesheetStatusType> timesheetStatus;
    @XmlElement(name = "timesheet_status_history")
    protected List<TimesheetStatusHistoryType> timesheetStatusHistory;
    protected List<TimesheetType> timesheet;
    protected List<TaskType> task;
    @XmlElement(name = "project_task")
    protected List<ProjectTaskType> projectTask;
    @XmlElement(name = "time_log")
    protected List<EventType> timeLog;
    @XmlElement(name = "project_period")
    protected List<ProjectPeriodsType> projectPeriod;

    /**
     * Gets the value of the employeeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeetypeType }
     * 
     * 
     */
    public List<EmployeetypeType> getEmployeeType() {
        if (employeeType == null) {
            employeeType = new ArrayList<EmployeetypeType>();
        }
        return this.employeeType;
    }

    /**
     * Gets the value of the employeeTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeTitleType }
     * 
     * 
     */
    public List<EmployeeTitleType> getEmployeeTitle() {
        if (employeeTitle == null) {
            employeeTitle = new ArrayList<EmployeeTitleType>();
        }
        return this.employeeTitle;
    }

    /**
     * Gets the value of the employee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeType }
     * 
     * 
     */
    public List<EmployeeType> getEmployee() {
        if (employee == null) {
            employee = new ArrayList<EmployeeType>();
        }
        return this.employee;
    }

    /**
     * Gets the value of the client property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the client property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientType }
     * 
     * 
     */
    public List<ClientType> getClient() {
        if (client == null) {
            client = new ArrayList<ClientType>();
        }
        return this.client;
    }

    /**
     * Gets the value of the project property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the project property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectType }
     * 
     * 
     */
    public List<ProjectType> getProject() {
        if (project == null) {
            project = new ArrayList<ProjectType>();
        }
        return this.project;
    }

    /**
     * Gets the value of the employeeProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeProjectType }
     * 
     * 
     */
    public List<EmployeeProjectType> getEmployeeProject() {
        if (employeeProject == null) {
            employeeProject = new ArrayList<EmployeeProjectType>();
        }
        return this.employeeProject;
    }

    /**
     * Gets the value of the timesheetStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timesheetStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimesheetStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetStatusType }
     * 
     * 
     */
    public List<TimesheetStatusType> getTimesheetStatus() {
        if (timesheetStatus == null) {
            timesheetStatus = new ArrayList<TimesheetStatusType>();
        }
        return this.timesheetStatus;
    }

    /**
     * Gets the value of the timesheetStatusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timesheetStatusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimesheetStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetStatusHistoryType }
     * 
     * 
     */
    public List<TimesheetStatusHistoryType> getTimesheetStatusHistory() {
        if (timesheetStatusHistory == null) {
            timesheetStatusHistory = new ArrayList<TimesheetStatusHistoryType>();
        }
        return this.timesheetStatusHistory;
    }

    /**
     * Gets the value of the timesheet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timesheet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimesheet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetType }
     * 
     * 
     */
    public List<TimesheetType> getTimesheet() {
        if (timesheet == null) {
            timesheet = new ArrayList<TimesheetType>();
        }
        return this.timesheet;
    }

    /**
     * Gets the value of the task property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the task property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskType }
     * 
     * 
     */
    public List<TaskType> getTask() {
        if (task == null) {
            task = new ArrayList<TaskType>();
        }
        return this.task;
    }

    /**
     * Gets the value of the projectTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectTask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectTaskType }
     * 
     * 
     */
    public List<ProjectTaskType> getProjectTask() {
        if (projectTask == null) {
            projectTask = new ArrayList<ProjectTaskType>();
        }
        return this.projectTask;
    }

    /**
     * Gets the value of the timeLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getTimeLog() {
        if (timeLog == null) {
            timeLog = new ArrayList<EventType>();
        }
        return this.timeLog;
    }

    /**
     * Gets the value of the projectPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectPeriodsType }
     * 
     * 
     */
    public List<ProjectPeriodsType> getProjectPeriod() {
        if (projectPeriod == null) {
            projectPeriod = new ArrayList<ProjectPeriodsType>();
        }
        return this.projectPeriod;
    }

}
