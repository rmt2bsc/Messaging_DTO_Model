//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 07:24:52 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * The purchase order item record.
 * 
 * <p>Java class for purchase_order_item_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchase_order_item_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchase_order_item_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="purchase_order" type="{}purchase_order_type"/>
 *         &lt;element name="item" type="{}inventory_item_type"/>
 *         &lt;element name="unit_cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="qty_received" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="qty_returned" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
@XmlType(name = "purchase_order_item_type", propOrder = {
    "purchaseOrderItemId",
    "purchaseOrder",
    "item",
    "unitCost",
    "qty",
    "qtyReceived",
    "qtyReturned",
    "tracking"
})
public class PurchaseOrderItemType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "purchase_order_item_id", required = true)
    protected BigInteger purchaseOrderItemId;
    @XmlElement(name = "purchase_order", required = true)
    protected PurchaseOrderType purchaseOrder;
    @XmlElement(required = true)
    protected InventoryItemType item;
    @XmlElement(name = "unit_cost")
    protected BigDecimal unitCost;
    @XmlElement(required = true, defaultValue = "0")
    protected BigInteger qty;
    @XmlElement(name = "qty_received", required = true, defaultValue = "0")
    protected BigInteger qtyReceived;
    @XmlElement(name = "qty_returned", required = true, defaultValue = "0")
    protected BigInteger qtyReturned;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the purchaseOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchaseOrderItemId() {
        return purchaseOrderItemId;
    }

    /**
     * Sets the value of the purchaseOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchaseOrderItemId(BigInteger value) {
        this.purchaseOrderItemId = value;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderType }
     *     
     */
    public PurchaseOrderType getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderType }
     *     
     */
    public void setPurchaseOrder(PurchaseOrderType value) {
        this.purchaseOrder = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryItemType }
     *     
     */
    public InventoryItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryItemType }
     *     
     */
    public void setItem(InventoryItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCost(BigDecimal value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQty(BigInteger value) {
        this.qty = value;
    }

    /**
     * Gets the value of the qtyReceived property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtyReceived() {
        return qtyReceived;
    }

    /**
     * Sets the value of the qtyReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtyReceived(BigInteger value) {
        this.qtyReceived = value;
    }

    /**
     * Gets the value of the qtyReturned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtyReturned() {
        return qtyReturned;
    }

    /**
     * Sets the value of the qtyReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtyReturned(BigInteger value) {
        this.qtyReturned = value;
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
