//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.02 at 11:31:53 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * This is the document that houses binary data and large text which the data elements can be mapped to the content table from the mime database.   The binary data can be of any multimedia resource such as documents, images, audio, video, and other binary forms of data.
 * 
 * <p>Java class for mime_content_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mime_content_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="content_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="mime_type_details" type="{}mime_type" maxOccurs="unbounded"/>
 *         &lt;element name="app_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="module_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="binary_data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="text_data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mime_content_type", propOrder = {
    "contentId",
    "mimeTypeDetails",
    "appCode",
    "moduleCode",
    "filename",
    "filepath",
    "filesize",
    "binaryData",
    "textData"
})
public class MimeContentType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "content_id", required = true, defaultValue = "0")
    protected BigInteger contentId;
    @XmlElement(name = "mime_type_details", required = true)
    protected List<MimeType> mimeTypeDetails;
    @XmlElement(name = "app_code")
    protected String appCode;
    @XmlElement(name = "module_code")
    protected String moduleCode;
    protected String filename;
    protected String filepath;
    @XmlElement(required = true, defaultValue = "0")
    protected BigInteger filesize;
    @XmlElement(name = "binary_data")
    protected byte[] binaryData;
    @XmlElement(name = "text_data")
    protected String textData;

    /**
     * Gets the value of the contentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentId() {
        return contentId;
    }

    /**
     * Sets the value of the contentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentId(BigInteger value) {
        this.contentId = value;
    }

    /**
     * Gets the value of the mimeTypeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mimeTypeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMimeTypeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MimeType }
     * 
     * 
     */
    public List<MimeType> getMimeTypeDetails() {
        if (mimeTypeDetails == null) {
            mimeTypeDetails = new ArrayList<MimeType>();
        }
        return this.mimeTypeDetails;
    }

    /**
     * Gets the value of the appCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * Sets the value of the appCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCode(String value) {
        this.appCode = value;
    }

    /**
     * Gets the value of the moduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * Sets the value of the moduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleCode(String value) {
        this.moduleCode = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilepath(String value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the filesize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilesize() {
        return filesize;
    }

    /**
     * Sets the value of the filesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilesize(BigInteger value) {
        this.filesize = value;
    }

    /**
     * Gets the value of the binaryData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryData() {
        return binaryData;
    }

    /**
     * Sets the value of the binaryData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryData(byte[] value) {
        this.binaryData = value;
    }

    /**
     * Gets the value of the textData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextData() {
        return textData;
    }

    /**
     * Sets the value of the textData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextData(String value) {
        this.textData = value;
    }

}
