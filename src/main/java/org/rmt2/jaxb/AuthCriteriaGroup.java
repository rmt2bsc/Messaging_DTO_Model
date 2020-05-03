//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.03 at 12:23:25 AM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for auth_criteria_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auth_criteria_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_profile_criteria" type="{}user_profile_criteria_type"/>
 *         &lt;element name="user_app_roles_criteria" type="{}user_app_roles_criteria_type"/>
 *         &lt;element name="resource_criteria" type="{}resource_criteria_type"/>
 *         &lt;element name="resource_subtype_criteria" type="{}resource_subtype_criteria_type"/>
 *         &lt;element name="user_resource_access_criteria" type="{}user_resource_access_criteria_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth_criteria_group", propOrder = {
    "userProfileCriteria",
    "userAppRolesCriteria",
    "resourceCriteria",
    "resourceSubtypeCriteria",
    "userResourceAccessCriteria"
})
public class AuthCriteriaGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "user_profile_criteria", required = true)
    protected UserProfileCriteriaType userProfileCriteria;
    @XmlElement(name = "user_app_roles_criteria", required = true)
    protected UserAppRolesCriteriaType userAppRolesCriteria;
    @XmlElement(name = "resource_criteria", required = true)
    protected ResourceCriteriaType resourceCriteria;
    @XmlElement(name = "resource_subtype_criteria", required = true)
    protected ResourceSubtypeCriteriaType resourceSubtypeCriteria;
    @XmlElement(name = "user_resource_access_criteria", required = true)
    protected UserResourceAccessCriteriaType userResourceAccessCriteria;

    /**
     * Gets the value of the userProfileCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link UserProfileCriteriaType }
     *     
     */
    public UserProfileCriteriaType getUserProfileCriteria() {
        return userProfileCriteria;
    }

    /**
     * Sets the value of the userProfileCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfileCriteriaType }
     *     
     */
    public void setUserProfileCriteria(UserProfileCriteriaType value) {
        this.userProfileCriteria = value;
    }

    /**
     * Gets the value of the userAppRolesCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link UserAppRolesCriteriaType }
     *     
     */
    public UserAppRolesCriteriaType getUserAppRolesCriteria() {
        return userAppRolesCriteria;
    }

    /**
     * Sets the value of the userAppRolesCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAppRolesCriteriaType }
     *     
     */
    public void setUserAppRolesCriteria(UserAppRolesCriteriaType value) {
        this.userAppRolesCriteria = value;
    }

    /**
     * Gets the value of the resourceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCriteriaType }
     *     
     */
    public ResourceCriteriaType getResourceCriteria() {
        return resourceCriteria;
    }

    /**
     * Sets the value of the resourceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCriteriaType }
     *     
     */
    public void setResourceCriteria(ResourceCriteriaType value) {
        this.resourceCriteria = value;
    }

    /**
     * Gets the value of the resourceSubtypeCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceSubtypeCriteriaType }
     *     
     */
    public ResourceSubtypeCriteriaType getResourceSubtypeCriteria() {
        return resourceSubtypeCriteria;
    }

    /**
     * Sets the value of the resourceSubtypeCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceSubtypeCriteriaType }
     *     
     */
    public void setResourceSubtypeCriteria(ResourceSubtypeCriteriaType value) {
        this.resourceSubtypeCriteria = value;
    }

    /**
     * Gets the value of the userResourceAccessCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link UserResourceAccessCriteriaType }
     *     
     */
    public UserResourceAccessCriteriaType getUserResourceAccessCriteria() {
        return userResourceAccessCriteria;
    }

    /**
     * Sets the value of the userResourceAccessCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserResourceAccessCriteriaType }
     *     
     */
    public void setUserResourceAccessCriteria(UserResourceAccessCriteriaType value) {
        this.userResourceAccessCriteria = value;
    }

}
