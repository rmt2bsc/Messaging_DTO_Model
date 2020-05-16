//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.15 at 09:52:05 PM CDT 
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
 * <p>Java class for pagination_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pagination_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="page_no" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="page_row_count" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="page_count" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="page_max_links" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="query_row_count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pagination_query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagination_type", propOrder = {
    "pageNo",
    "pageRowCount",
    "pageCount",
    "pageMaxLinks",
    "queryRowCount",
    "paginationQuery"
})
public class PaginationType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "page_no", required = true, defaultValue = "0")
    protected BigInteger pageNo;
    @XmlElement(name = "page_row_count", required = true)
    protected BigInteger pageRowCount;
    @XmlElement(name = "page_count")
    protected double pageCount;
    @XmlElement(name = "page_max_links", required = true)
    protected BigInteger pageMaxLinks;
    @XmlElement(name = "query_row_count")
    protected long queryRowCount;
    @XmlElement(name = "pagination_query", required = true)
    protected String paginationQuery;

    /**
     * Gets the value of the pageNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageNo() {
        return pageNo;
    }

    /**
     * Sets the value of the pageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageNo(BigInteger value) {
        this.pageNo = value;
    }

    /**
     * Gets the value of the pageRowCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageRowCount() {
        return pageRowCount;
    }

    /**
     * Sets the value of the pageRowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageRowCount(BigInteger value) {
        this.pageRowCount = value;
    }

    /**
     * Gets the value of the pageCount property.
     * 
     */
    public double getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     */
    public void setPageCount(double value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the pageMaxLinks property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageMaxLinks() {
        return pageMaxLinks;
    }

    /**
     * Sets the value of the pageMaxLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageMaxLinks(BigInteger value) {
        this.pageMaxLinks = value;
    }

    /**
     * Gets the value of the queryRowCount property.
     * 
     */
    public long getQueryRowCount() {
        return queryRowCount;
    }

    /**
     * Sets the value of the queryRowCount property.
     * 
     */
    public void setQueryRowCount(long value) {
        this.queryRowCount = value;
    }

    /**
     * Gets the value of the paginationQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaginationQuery() {
        return paginationQuery;
    }

    /**
     * Sets the value of the paginationQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaginationQuery(String value) {
        this.paginationQuery = value;
    }

}
