//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.12 at 06:44:01 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.RMT2Base;


/**
 * <p>Java class for sales_order_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sales_order_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sales_order_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="customer_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customer_account_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiced" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="invoice_details" type="{}sales_invoice_type" minOccurs="0"/>
 *         &lt;element name="order_total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="effective_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="status_history" type="{}sales_order_status_history_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sales_order_items" type="{}sales_order_item_list_type" minOccurs="0"/>
 *         &lt;element name="tracking" type="{}record_tracking_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sales_order_type", propOrder = {
    "salesOrderId",
    "customerId",
    "customerName",
    "customerAccountNo",
    "invoiced",
    "invoiceDetails",
    "orderTotal",
    "effectiveDate",
    "statusHistory",
    "salesOrderItems",
    "tracking"
})
public class SalesOrderType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "sales_order_id", required = true, defaultValue = "0")
    protected BigInteger salesOrderId;
    @XmlElement(name = "customer_id", required = true)
    protected BigInteger customerId;
    @XmlElement(name = "customer_name", required = true)
    protected String customerName;
    @XmlElement(name = "customer_account_no", required = true)
    protected String customerAccountNo;
    protected boolean invoiced;
    @XmlElement(name = "invoice_details")
    protected SalesInvoiceType invoiceDetails;
    @XmlElement(name = "order_total")
    protected BigDecimal orderTotal;
    @XmlElement(name = "effective_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "status_history")
    protected List<SalesOrderStatusHistoryType> statusHistory;
    @XmlElement(name = "sales_order_items")
    protected SalesOrderItemListType salesOrderItems;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the salesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSalesOrderId() {
        return salesOrderId;
    }

    /**
     * Sets the value of the salesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSalesOrderId(BigInteger value) {
        this.salesOrderId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerId(BigInteger value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountNo() {
        return customerAccountNo;
    }

    /**
     * Sets the value of the customerAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountNo(String value) {
        this.customerAccountNo = value;
    }

    /**
     * Gets the value of the invoiced property.
     * 
     */
    public boolean isInvoiced() {
        return invoiced;
    }

    /**
     * Sets the value of the invoiced property.
     * 
     */
    public void setInvoiced(boolean value) {
        this.invoiced = value;
    }

    /**
     * Gets the value of the invoiceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SalesInvoiceType }
     *     
     */
    public SalesInvoiceType getInvoiceDetails() {
        return invoiceDetails;
    }

    /**
     * Sets the value of the invoiceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesInvoiceType }
     *     
     */
    public void setInvoiceDetails(SalesInvoiceType value) {
        this.invoiceDetails = value;
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderTotal(BigDecimal value) {
        this.orderTotal = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the statusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderStatusHistoryType }
     * 
     * 
     */
    public List<SalesOrderStatusHistoryType> getStatusHistory() {
        if (statusHistory == null) {
            statusHistory = new ArrayList<SalesOrderStatusHistoryType>();
        }
        return this.statusHistory;
    }

    /**
     * Gets the value of the salesOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderItemListType }
     *     
     */
    public SalesOrderItemListType getSalesOrderItems() {
        return salesOrderItems;
    }

    /**
     * Sets the value of the salesOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderItemListType }
     *     
     */
    public void setSalesOrderItems(SalesOrderItemListType value) {
        this.salesOrderItems = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTrackingType }
     *     
     */
    public RecordTrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTrackingType }
     *     
     */
    public void setTracking(RecordTrackingType value) {
        this.tracking = value;
    }

}
