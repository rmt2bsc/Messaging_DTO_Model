//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.03 at 12:23:25 AM CDT 
//


package org.rmt2.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xact_custom_criteria_target_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xact_custom_criteria_target_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HEADER"/>
 *     &lt;enumeration value="DETAILS"/>
 *     &lt;enumeration value="FULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xact_custom_criteria_target_type")
@XmlEnum
public enum XactCustomCriteriaTargetType {

    HEADER,
    DETAILS,
    FULL;

    public String value() {
        return name();
    }

    public static XactCustomCriteriaTargetType fromValue(String v) {
        return valueOf(v);
    }

}
