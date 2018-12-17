//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.17 at 10:37:55 AM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for item_association_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item_association_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assoc_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="assoc_item_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="item_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="assoc_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item_association_criteria_type", propOrder = {
    "assocId",
    "assocItemId",
    "itemId",
    "assocType"
})
public class ItemAssociationCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "assoc_id", required = true)
    protected BigInteger assocId;
    @XmlElement(name = "assoc_item_id", required = true)
    protected BigInteger assocItemId;
    @XmlElement(name = "item_id", required = true)
    protected BigInteger itemId;
    @XmlElement(name = "assoc_type", required = true)
    protected String assocType;

    /**
     * Gets the value of the assocId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssocId() {
        return assocId;
    }

    /**
     * Sets the value of the assocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssocId(BigInteger value) {
        this.assocId = value;
    }

    /**
     * Gets the value of the assocItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssocItemId() {
        return assocItemId;
    }

    /**
     * Sets the value of the assocItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssocItemId(BigInteger value) {
        this.assocItemId = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemId(BigInteger value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the assocType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocType() {
        return assocType;
    }

    /**
     * Sets the value of the assocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocType(String value) {
        this.assocType = value;
    }

}
