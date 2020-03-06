//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.06 at 04:26:24 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for customer_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="target_level" type="{}xact_custom_criteria_target_type"/>
 *         &lt;element name="customer" type="{}customer_type" minOccurs="0"/>
 *         &lt;element name="contact_details" type="{}business_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer_criteria_type", propOrder = {
    "targetLevel",
    "customer",
    "contactDetails"
})
public class CustomerCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "target_level", required = true)
    @XmlSchemaType(name = "string")
    protected XactCustomCriteriaTargetType targetLevel;
    protected CustomerType customer;
    @XmlElement(name = "contact_details")
    protected BusinessType contactDetails;

    /**
     * Gets the value of the targetLevel property.
     * 
     * @return
     *     possible object is
     *     {@link XactCustomCriteriaTargetType }
     *     
     */
    public XactCustomCriteriaTargetType getTargetLevel() {
        return targetLevel;
    }

    /**
     * Sets the value of the targetLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCustomCriteriaTargetType }
     *     
     */
    public void setTargetLevel(XactCustomCriteriaTargetType value) {
        this.targetLevel = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessType }
     *     
     */
    public BusinessType getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessType }
     *     
     */
    public void setContactDetails(BusinessType value) {
        this.contactDetails = value;
    }

}
