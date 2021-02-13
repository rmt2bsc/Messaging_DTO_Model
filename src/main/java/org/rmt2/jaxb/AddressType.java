//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 07:24:52 PM CST 
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
 * <p>Java class for address_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addr_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="person_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="business_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="addr1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zip" type="{}zipcode_type"/>
 *         &lt;element name="zip_ext" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="phone_home" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_work" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_work_ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_main" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_cell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_pager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address_type", propOrder = {
    "addrId",
    "personId",
    "businessId",
    "addr1",
    "addr2",
    "addr3",
    "addr4",
    "zip",
    "zipExt",
    "phoneHome",
    "phoneWork",
    "phoneWorkExt",
    "phoneMain",
    "phoneCell",
    "phoneFax",
    "phonePager"
})
public class AddressType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "addr_id", required = true, defaultValue = "0")
    protected BigInteger addrId;
    @XmlElement(name = "person_id", required = true)
    protected BigInteger personId;
    @XmlElement(name = "business_id", required = true)
    protected BigInteger businessId;
    @XmlElement(required = true)
    protected String addr1;
    protected String addr2;
    protected String addr3;
    protected String addr4;
    @XmlElement(required = true)
    protected ZipcodeType zip;
    @XmlElement(name = "zip_ext")
    protected BigInteger zipExt;
    @XmlElement(name = "phone_home")
    protected String phoneHome;
    @XmlElement(name = "phone_work")
    protected String phoneWork;
    @XmlElement(name = "phone_work_ext")
    protected String phoneWorkExt;
    @XmlElement(name = "phone_main")
    protected String phoneMain;
    @XmlElement(name = "phone_cell")
    protected String phoneCell;
    @XmlElement(name = "phone_fax")
    protected String phoneFax;
    @XmlElement(name = "phone_pager")
    protected String phonePager;

    /**
     * Gets the value of the addrId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddrId() {
        return addrId;
    }

    /**
     * Sets the value of the addrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddrId(BigInteger value) {
        this.addrId = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonId(BigInteger value) {
        this.personId = value;
    }

    /**
     * Gets the value of the businessId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessId() {
        return businessId;
    }

    /**
     * Sets the value of the businessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessId(BigInteger value) {
        this.businessId = value;
    }

    /**
     * Gets the value of the addr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr1() {
        return addr1;
    }

    /**
     * Sets the value of the addr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr1(String value) {
        this.addr1 = value;
    }

    /**
     * Gets the value of the addr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr2() {
        return addr2;
    }

    /**
     * Sets the value of the addr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr2(String value) {
        this.addr2 = value;
    }

    /**
     * Gets the value of the addr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr3() {
        return addr3;
    }

    /**
     * Sets the value of the addr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr3(String value) {
        this.addr3 = value;
    }

    /**
     * Gets the value of the addr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr4() {
        return addr4;
    }

    /**
     * Sets the value of the addr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr4(String value) {
        this.addr4 = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link ZipcodeType }
     *     
     */
    public ZipcodeType getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipcodeType }
     *     
     */
    public void setZip(ZipcodeType value) {
        this.zip = value;
    }

    /**
     * Gets the value of the zipExt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZipExt() {
        return zipExt;
    }

    /**
     * Sets the value of the zipExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZipExt(BigInteger value) {
        this.zipExt = value;
    }

    /**
     * Gets the value of the phoneHome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneHome() {
        return phoneHome;
    }

    /**
     * Sets the value of the phoneHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneHome(String value) {
        this.phoneHome = value;
    }

    /**
     * Gets the value of the phoneWork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneWork() {
        return phoneWork;
    }

    /**
     * Sets the value of the phoneWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneWork(String value) {
        this.phoneWork = value;
    }

    /**
     * Gets the value of the phoneWorkExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneWorkExt() {
        return phoneWorkExt;
    }

    /**
     * Sets the value of the phoneWorkExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneWorkExt(String value) {
        this.phoneWorkExt = value;
    }

    /**
     * Gets the value of the phoneMain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneMain() {
        return phoneMain;
    }

    /**
     * Sets the value of the phoneMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneMain(String value) {
        this.phoneMain = value;
    }

    /**
     * Gets the value of the phoneCell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCell() {
        return phoneCell;
    }

    /**
     * Sets the value of the phoneCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCell(String value) {
        this.phoneCell = value;
    }

    /**
     * Gets the value of the phoneFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneFax() {
        return phoneFax;
    }

    /**
     * Sets the value of the phoneFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneFax(String value) {
        this.phoneFax = value;
    }

    /**
     * Gets the value of the phonePager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhonePager() {
        return phonePager;
    }

    /**
     * Sets the value of the phonePager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhonePager(String value) {
        this.phonePager = value;
    }

}
