//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.09 at 03:16:32 AM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for track_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="track_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="track_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="project_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="disc_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="track_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="track_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="composer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lyricist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location_servername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location_sharename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location_root_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location_filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "track_type", propOrder = {
    "trackId",
    "projectId",
    "discNumber",
    "trackNumber",
    "trackName",
    "hours",
    "minutes",
    "seconds",
    "producer",
    "composer",
    "lyricist",
    "locationServername",
    "locationSharename",
    "locationRootPath",
    "locationPath",
    "locationFilename",
    "comments",
    "tracking"
})
public class TrackType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "track_id", defaultValue = "0")
    protected int trackId;
    @XmlElement(name = "project_id", defaultValue = "0")
    protected int projectId;
    @XmlElement(name = "disc_number", defaultValue = "0")
    protected int discNumber;
    @XmlElement(name = "track_number", defaultValue = "0")
    protected int trackNumber;
    @XmlElement(name = "track_name")
    protected String trackName;
    @XmlElement(defaultValue = "0")
    protected Integer hours;
    @XmlElement(defaultValue = "0")
    protected Integer minutes;
    @XmlElement(defaultValue = "0")
    protected Integer seconds;
    protected String producer;
    protected String composer;
    protected String lyricist;
    @XmlElement(name = "location_servername")
    protected String locationServername;
    @XmlElement(name = "location_sharename")
    protected String locationSharename;
    @XmlElement(name = "location_root_path")
    protected String locationRootPath;
    @XmlElement(name = "location_path")
    protected String locationPath;
    @XmlElement(name = "location_filename")
    protected String locationFilename;
    protected String comments;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the trackId property.
     * 
     */
    public int getTrackId() {
        return trackId;
    }

    /**
     * Sets the value of the trackId property.
     * 
     */
    public void setTrackId(int value) {
        this.trackId = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     */
    public int getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     */
    public void setProjectId(int value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the discNumber property.
     * 
     */
    public int getDiscNumber() {
        return discNumber;
    }

    /**
     * Sets the value of the discNumber property.
     * 
     */
    public void setDiscNumber(int value) {
        this.discNumber = value;
    }

    /**
     * Gets the value of the trackNumber property.
     * 
     */
    public int getTrackNumber() {
        return trackNumber;
    }

    /**
     * Sets the value of the trackNumber property.
     * 
     */
    public void setTrackNumber(int value) {
        this.trackNumber = value;
    }

    /**
     * Gets the value of the trackName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     * Sets the value of the trackName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackName(String value) {
        this.trackName = value;
    }

    /**
     * Gets the value of the hours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHours(Integer value) {
        this.hours = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutes(Integer value) {
        this.minutes = value;
    }

    /**
     * Gets the value of the seconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeconds() {
        return seconds;
    }

    /**
     * Sets the value of the seconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeconds(Integer value) {
        this.seconds = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducer(String value) {
        this.producer = value;
    }

    /**
     * Gets the value of the composer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComposer() {
        return composer;
    }

    /**
     * Sets the value of the composer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComposer(String value) {
        this.composer = value;
    }

    /**
     * Gets the value of the lyricist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricist() {
        return lyricist;
    }

    /**
     * Sets the value of the lyricist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricist(String value) {
        this.lyricist = value;
    }

    /**
     * Gets the value of the locationServername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationServername() {
        return locationServername;
    }

    /**
     * Sets the value of the locationServername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationServername(String value) {
        this.locationServername = value;
    }

    /**
     * Gets the value of the locationSharename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSharename() {
        return locationSharename;
    }

    /**
     * Sets the value of the locationSharename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSharename(String value) {
        this.locationSharename = value;
    }

    /**
     * Gets the value of the locationRootPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationRootPath() {
        return locationRootPath;
    }

    /**
     * Sets the value of the locationRootPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationRootPath(String value) {
        this.locationRootPath = value;
    }

    /**
     * Gets the value of the locationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationPath() {
        return locationPath;
    }

    /**
     * Sets the value of the locationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationPath(String value) {
        this.locationPath = value;
    }

    /**
     * Gets the value of the locationFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationFilename() {
        return locationFilename;
    }

    /**
     * Sets the value of the locationFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationFilename(String value) {
        this.locationFilename = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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