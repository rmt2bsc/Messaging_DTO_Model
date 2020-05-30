//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.30 at 04:53:53 AM CDT 
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
 * This is an extended version of the document that manages user resource types.
 * 
 * <p>Java class for resource_ext_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource_ext_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsrc_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="rsrc_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rsrc_type" type="{}resource_type"/>
 *         &lt;element name="rsrc_sub_type" type="{}resource_subtype_type"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource_ext_type", propOrder = {
    "rsrcId",
    "rsrcName",
    "rsrcType",
    "rsrcSubType",
    "url",
    "host",
    "description",
    "secured"
})
public class ResourceExtType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "rsrc_id", required = true)
    protected BigInteger rsrcId;
    @XmlElement(name = "rsrc_name", required = true)
    protected String rsrcName;
    @XmlElement(name = "rsrc_type", required = true)
    protected ResourceType rsrcType;
    @XmlElement(name = "rsrc_sub_type", required = true)
    protected ResourceSubtypeType rsrcSubType;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String host;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(defaultValue = "false")
    protected boolean secured;

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

    /**
     * Gets the value of the rsrcType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceType }
     *     
     */
    public ResourceType getRsrcType() {
        return rsrcType;
    }

    /**
     * Sets the value of the rsrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceType }
     *     
     */
    public void setRsrcType(ResourceType value) {
        this.rsrcType = value;
    }

    /**
     * Gets the value of the rsrcSubType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceSubtypeType }
     *     
     */
    public ResourceSubtypeType getRsrcSubType() {
        return rsrcSubType;
    }

    /**
     * Sets the value of the rsrcSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceSubtypeType }
     *     
     */
    public void setRsrcSubType(ResourceSubtypeType value) {
        this.rsrcSubType = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the secured property.
     * 
     */
    public boolean isSecured() {
        return secured;
    }

    /**
     * Sets the value of the secured property.
     * 
     */
    public void setSecured(boolean value) {
        this.secured = value;
    }

}
