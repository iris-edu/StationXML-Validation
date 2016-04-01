//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//

package edu.iris.dmc.fdsn.station.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for EquipmentType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstallationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CalibrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="resourceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentType", propOrder = { "type", "description", "manufacturer", "vendor", "model", "serialNumber",
		"installationDate", "removalDate", "calibrationDate", "any" })
public class Equipment {

	@XmlElement(name = "Type")
	protected String type;
	
	@NotNull(message = "{channel.sensor.notnull}")
	@XmlElement(name = "Description")
	protected String description;
	@XmlElement(name = "Manufacturer")
	protected String manufacturer;
	@XmlElement(name = "Vendor")
	protected String vendor;
	@XmlElement(name = "Model")
	protected String model;
	@XmlElement(name = "SerialNumber")
	protected String serialNumber;
	@XmlElement(name = "InstallationDate")
	// @XmlSchemaType(name = "dateTime")
	@XmlJavaTypeAdapter(DateAdapter.class)
	protected Date installationDate;
	@XmlElement(name = "RemovalDate")
	// @XmlSchemaType(name = "dateTime")
	@XmlJavaTypeAdapter(DateAdapter.class)
	protected Date removalDate;
	@XmlElement(name = "CalibrationDate")
	// @XmlSchemaType(name = "dateTime")
	@XmlJavaTypeAdapter(DateAdapter.class)
	protected List<Date> calibrationDate;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "resourceId")
	protected String resourceId;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the manufacturer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Sets the value of the manufacturer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setManufacturer(String value) {
		this.manufacturer = value;
	}

	/**
	 * Gets the value of the vendor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * Sets the value of the vendor property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVendor(String value) {
		this.vendor = value;
	}

	/**
	 * Gets the value of the model property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Sets the value of the model property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModel(String value) {
		this.model = value;
	}

	/**
	 * Gets the value of the serialNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Sets the value of the serialNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSerialNumber(String value) {
		this.serialNumber = value;
	}

	/**
	 * Gets the value of the installationDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public Date getInstallationDate() {
		return installationDate;
	}

	/**
	 * Sets the value of the installationDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setInstallationDate(Date value) {
		this.installationDate = value;
	}

	/**
	 * Gets the value of the removalDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public Date getRemovalDate() {
		return removalDate;
	}

	/**
	 * Sets the value of the removalDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setRemovalDate(Date value) {
		this.removalDate = value;
	}

	/**
	 * Gets the value of the calibrationDate property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the calibrationDate property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCalibrationDate().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link XMLGregorianCalendar }
	 * 
	 * 
	 */
	public List<Date> getCalibrationDate() {
		if (calibrationDate == null) {
			calibrationDate = new ArrayList<Date>();
		}
		return this.calibrationDate;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element }
	 * {@link Object }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
	}

	/**
	 * Gets the value of the resourceId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResourceId() {
		return resourceId;
	}

	/**
	 * Sets the value of the resourceId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResourceId(String value) {
		this.resourceId = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
