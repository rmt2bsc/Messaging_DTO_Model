//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.28 at 07:43:09 PM CDT 
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
 * <p>Java class for transaction_detail_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction_detail_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="company" type="{}business_type" minOccurs="0"/>
 *         &lt;element name="transactions" type="{}xact_list_type" minOccurs="0"/>
 *         &lt;element name="creditors" type="{}creditor_list_type"/>
 *         &lt;element name="creditor_types" type="{}creditortype_type" maxOccurs="unbounded"/>
 *         &lt;element name="customers" type="{}customer_list_type"/>
 *         &lt;element name="purchase_orders" type="{}purchase_order_list_type" minOccurs="0"/>
 *         &lt;element name="sales_orders" type="{}sales_order_list_type" minOccurs="0"/>
 *         &lt;element name="xact_codes" type="{}xact_code_list_type" minOccurs="0"/>
 *         &lt;element name="xact_code_groups" type="{}xact_code_group_list_type" minOccurs="0"/>
 *         &lt;element name="xact_categories" type="{}xact_category_list_type" minOccurs="0"/>
 *         &lt;element name="attachment" type="{}report_attachment_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_detail_group", propOrder = {
    "company",
    "transactions",
    "creditors",
    "creditorTypes",
    "customers",
    "purchaseOrders",
    "salesOrders",
    "xactCodes",
    "xactCodeGroups",
    "xactCategories",
    "attachment"
})
public class TransactionDetailGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BusinessType company;
    protected XactListType transactions;
    @XmlElement(required = true)
    protected CreditorListType creditors;
    @XmlElement(name = "creditor_types", required = true)
    protected List<CreditortypeType> creditorTypes;
    @XmlElement(required = true)
    protected CustomerListType customers;
    @XmlElement(name = "purchase_orders")
    protected PurchaseOrderListType purchaseOrders;
    @XmlElement(name = "sales_orders")
    protected SalesOrderListType salesOrders;
    @XmlElement(name = "xact_codes")
    protected XactCodeListType xactCodes;
    @XmlElement(name = "xact_code_groups")
    protected XactCodeGroupListType xactCodeGroups;
    @XmlElement(name = "xact_categories")
    protected XactCategoryListType xactCategories;
    protected ReportAttachmentType attachment;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessType }
     *     
     */
    public BusinessType getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessType }
     *     
     */
    public void setCompany(BusinessType value) {
        this.company = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link XactListType }
     *     
     */
    public XactListType getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactListType }
     *     
     */
    public void setTransactions(XactListType value) {
        this.transactions = value;
    }

    /**
     * Gets the value of the creditors property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorListType }
     *     
     */
    public CreditorListType getCreditors() {
        return creditors;
    }

    /**
     * Sets the value of the creditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorListType }
     *     
     */
    public void setCreditors(CreditorListType value) {
        this.creditors = value;
    }

    /**
     * Gets the value of the creditorTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditorTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditorTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditortypeType }
     * 
     * 
     */
    public List<CreditortypeType> getCreditorTypes() {
        if (creditorTypes == null) {
            creditorTypes = new ArrayList<CreditortypeType>();
        }
        return this.creditorTypes;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerListType }
     *     
     */
    public CustomerListType getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerListType }
     *     
     */
    public void setCustomers(CustomerListType value) {
        this.customers = value;
    }

    /**
     * Gets the value of the purchaseOrders property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderListType }
     *     
     */
    public PurchaseOrderListType getPurchaseOrders() {
        return purchaseOrders;
    }

    /**
     * Sets the value of the purchaseOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderListType }
     *     
     */
    public void setPurchaseOrders(PurchaseOrderListType value) {
        this.purchaseOrders = value;
    }

    /**
     * Gets the value of the salesOrders property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderListType }
     *     
     */
    public SalesOrderListType getSalesOrders() {
        return salesOrders;
    }

    /**
     * Sets the value of the salesOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderListType }
     *     
     */
    public void setSalesOrders(SalesOrderListType value) {
        this.salesOrders = value;
    }

    /**
     * Gets the value of the xactCodes property.
     * 
     * @return
     *     possible object is
     *     {@link XactCodeListType }
     *     
     */
    public XactCodeListType getXactCodes() {
        return xactCodes;
    }

    /**
     * Sets the value of the xactCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCodeListType }
     *     
     */
    public void setXactCodes(XactCodeListType value) {
        this.xactCodes = value;
    }

    /**
     * Gets the value of the xactCodeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link XactCodeGroupListType }
     *     
     */
    public XactCodeGroupListType getXactCodeGroups() {
        return xactCodeGroups;
    }

    /**
     * Sets the value of the xactCodeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCodeGroupListType }
     *     
     */
    public void setXactCodeGroups(XactCodeGroupListType value) {
        this.xactCodeGroups = value;
    }

    /**
     * Gets the value of the xactCategories property.
     * 
     * @return
     *     possible object is
     *     {@link XactCategoryListType }
     *     
     */
    public XactCategoryListType getXactCategories() {
        return xactCategories;
    }

    /**
     * Sets the value of the xactCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCategoryListType }
     *     
     */
    public void setXactCategories(XactCategoryListType value) {
        this.xactCategories = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link ReportAttachmentType }
     *     
     */
    public ReportAttachmentType getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportAttachmentType }
     *     
     */
    public void setAttachment(ReportAttachmentType value) {
        this.attachment = value;
    }

}
