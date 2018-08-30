//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.30 at 05:43:52 PM CDT 
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
 * <p>Java class for resource_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsrc_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rsrc_type_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rsrc_subtype_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rsrc_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource_criteria_type", propOrder = {
    "rsrcId",
    "rsrcTypeId",
    "rsrcSubtypeId",
    "rsrcName"
})
public class ResourceCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "rsrc_id")
    protected BigInteger rsrcId;
    @XmlElement(name = "rsrc_type_id")
    protected BigInteger rsrcTypeId;
    @XmlElement(name = "rsrc_subtype_id")
    protected BigInteger rsrcSubtypeId;
    @XmlElement(name = "rsrc_name")
    protected String rsrcName;

    /**
     * Gets the value of the rsrcId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsrcId() {
        return rsrcId;
    }

    /**
     * Sets the value of the rsrcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsrcId(BigInteger value) {
        this.rsrcId = value;
    }

    /**
     * Gets the value of the rsrcTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsrcTypeId() {
        return rsrcTypeId;
    }

    /**
     * Sets the value of the rsrcTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsrcTypeId(BigInteger value) {
        this.rsrcTypeId = value;
    }

    /**
     * Gets the value of the rsrcSubtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsrcSubtypeId() {
        return rsrcSubtypeId;
    }

    /**
     * Sets the value of the rsrcSubtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsrcSubtypeId(BigInteger value) {
        this.rsrcSubtypeId = value;
    }

    /**
     * Gets the value of the rsrcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcName() {
        return rsrcName;
    }

    /**
     * Sets the value of the rsrcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcName(String value) {
        this.rsrcName = value;
    }

}
