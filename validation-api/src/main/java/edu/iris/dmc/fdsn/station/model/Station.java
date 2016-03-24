//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//

package edu.iris.dmc.fdsn.station.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hibernate.validator.constraints.NotEmpty;

import edu.iris.dmc.validation.rule.EpochRange;
import edu.iris.dmc.validation.rule.NoOverlap;

/**
 * This type represents a Station epoch. It is common to only have a single
 * station epoch with the station's creation and termination dates as the epoch
 * start and end dates.
 * 
 * <p>
 * Java class for StationType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="StationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fdsn.org/xml/station/1}BaseNodeType">
 *       &lt;sequence>
 *         &lt;element name="Latitude" type="{http://www.fdsn.org/xml/station/1}LatitudeType"/>
 *         &lt;element name="Longitude" type="{http://www.fdsn.org/xml/station/1}LongitudeType"/>
 *         &lt;element name="Elevation" type="{http://www.fdsn.org/xml/station/1}DistanceType"/>
 *         &lt;element name="Site" type="{http://www.fdsn.org/xml/station/1}SiteType"/>
 *         &lt;element name="Vault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Geology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://www.fdsn.org/xml/station/1}EquipmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Operator" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="Contact" type="{http://www.fdsn.org/xml/station/1}PersonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WebSite" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TotalNumberChannels" type="{http://www.fdsn.org/xml/station/1}CounterType" minOccurs="0"/>
 *         &lt;element name="SelectedNumberChannels" type="{http://www.fdsn.org/xml/station/1}CounterType" minOccurs="0"/>
 *         &lt;element name="ExternalReference" type="{http://www.fdsn.org/xml/station/1}ExternalReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Channel" type="{http://www.fdsn.org/xml/station/1}ChannelType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@EpochRange(message="{station.epoch.range}")
@edu.iris.dmc.validation.rule.Distance(margin = 1, message = "{station.channel.distance}")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationType", propOrder = { "latitude", "longitude", "elevation", "site", "vault", "geology",
		"equipment", "operator", "creationDate", "terminationDate", "totalNumberChannels", "selectedNumberChannels",
		"externalReference", "channels" })
public class Station extends BaseNodeType {

	@NotNull(message = "{station.code.notnull}")
	@Pattern(regexp = "[A-Za-z0-9\\*\\?]{1,5}", message = "{station.code.regex}")
	@XmlAttribute(name = "code", required = true)
	protected String code;

	@NotNull(message = "{station.starttime.notnull}")
	@XmlAttribute(name = "startDate", required = true)
	// @XmlSchemaType(name = "dateTime")
	@XmlJavaTypeAdapter(DateAdapter.class)
	protected Date startDate;
	@XmlAttribute(name = "endDate")
	// @XmlSchemaType(name = "dateTime")
	@XmlJavaTypeAdapter(DateAdapter.class)
	protected Date endDate;
	@edu.iris.dmc.validation.rule.Latitude(min = -90, max = 90, required = true, message = "{station.latitude}")
	@XmlElement(name = "Latitude", required = true)
	protected Latitude latitude;
	@edu.iris.dmc.validation.rule.Longitude(min = -180, max = 180, required = true, message = "{station.longitude}")
	@XmlElement(name = "Longitude", required = true)
	protected Longitude longitude;

	@NotNull(message = "station.elevation")
	@XmlElement(name = "Elevation", required = true)
	protected Distance elevation;
	@XmlElement(name = "Site", required = true)
	protected Site site;
	@XmlElement(name = "Vault")
	protected String vault;
	@XmlElement(name = "Geology")
	protected String geology;
	@XmlElement(name = "Equipment")
	protected List<Equipment> equipment;
	@XmlElement(name = "Operator")
	protected List<Station.Operator> operator;
	@NotNull(message = "{station.creationtime}")
	@XmlElement(name = "CreationDate", required = true)
	// @XmlSchemaType(name = "dateTime")
	@XmlJavaTypeAdapter(DateAdapter.class)
	protected Date creationDate;
	@XmlElement(name = "TerminationDate")
	// @XmlSchemaType(name = "dateTime")
	@XmlJavaTypeAdapter(DateAdapter.class)
	protected Date terminationDate;
	@XmlElement(name = "TotalNumberChannels")
	protected BigInteger totalNumberChannels;
	@XmlElement(name = "SelectedNumberChannels")
	protected BigInteger selectedNumberChannels;
	@XmlElement(name = "ExternalReference")
	protected List<ExternalReferenceType> externalReference;

	@NoOverlap(message = "{station.channel.overlap}")
	@XmlElement(name = "Channel")
	protected List<Channel> channels;

	@XmlTransient
	private Network network;

	/**
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCode(String value) {
		this.code = value;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	/*
	 * public void afterUnmarshal(Unmarshaller u, Object parent) { this.network
	 * = (Network) parent; }
	 */

	public void addChannel(Channel channel) {
		channel.setStation(this);
		if (this.channels == null) {
			this.channels = new ArrayList<Channel>();
		}
		this.channels.add(channel);
	}

	public void merge(Channel channel) {
		if (channel == null) {
			return;
		}

		int index = this.channels.indexOf(channel);
		if (index < 0) {
			this.channels.add(channel);
			return;
		}
		// if you get here, duplicate channels, so ignore
	}

	public void add(Comment comment) {
		if (comment == null) {
			return;
		}
		if (this.comment == null) {
			this.comment = new ArrayList<Comment>();
		}
		this.comment.add(comment);
	}

	/**
	 * Gets the value of the latitude property.
	 * 
	 * @return possible object is {@link Latitude }
	 * 
	 */
	public Latitude getLatitude() {
		return latitude;
	}

	/**
	 * Sets the value of the latitude property.
	 * 
	 * @param value
	 *            allowed object is {@link Latitude }
	 * 
	 */
	public void setLatitude(Latitude value) {
		this.latitude = value;
	}

	/**
	 * Gets the value of the longitude property.
	 * 
	 * @return possible object is {@link Longitude }
	 * 
	 */
	public Longitude getLongitude() {
		return longitude;
	}

	/**
	 * Sets the value of the longitude property.
	 * 
	 * @param value
	 *            allowed object is {@link Longitude }
	 * 
	 */
	public void setLongitude(Longitude value) {
		this.longitude = value;
	}

	/**
	 * Gets the value of the elevation property.
	 * 
	 * @return possible object is {@link Distance }
	 * 
	 */
	public Distance getElevation() {
		return elevation;
	}

	/**
	 * Sets the value of the elevation property.
	 * 
	 * @param value
	 *            allowed object is {@link Distance }
	 * 
	 */
	public void setElevation(Distance value) {
		this.elevation = value;
	}

	/**
	 * Gets the value of the site property.
	 * 
	 * @return possible object is {@link Site }
	 * 
	 */
	public Site getSite() {
		return site;
	}

	/**
	 * Sets the value of the site property.
	 * 
	 * @param value
	 *            allowed object is {@link Site }
	 * 
	 */
	public void setSite(Site value) {
		this.site = value;
	}

	/**
	 * Gets the value of the vault property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVault() {
		return vault;
	}

	/**
	 * Sets the value of the vault property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVault(String value) {
		this.vault = value;
	}

	/**
	 * Gets the value of the geology property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGeology() {
		return geology;
	}

	/**
	 * Sets the value of the geology property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGeology(String value) {
		this.geology = value;
	}

	/**
	 * Gets the value of the equipment property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the equipment property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getEquipment().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Equipment
	 * }
	 * 
	 * 
	 */
	public List<Equipment> getEquipment() {
		if (equipment == null) {
			equipment = new ArrayList<Equipment>();
		}
		return this.equipment;
	}

	/**
	 * Gets the value of the operator property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the operator property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOperator().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Station.Operator }
	 * 
	 * 
	 */
	public List<Station.Operator> getOperator() {
		if (operator == null) {
			operator = new ArrayList<Station.Operator>();
		}
		return this.operator;
	}

	/**
	 * Gets the value of the creationDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Sets the value of the creationDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCreationDate(Date value) {
		this.creationDate = value;
	}

	/**
	 * Gets the value of the terminationDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public Date getTerminationDate() {
		return terminationDate;
	}

	/**
	 * Sets the value of the terminationDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTerminationDate(Date value) {
		this.terminationDate = value;
	}

	/**
	 * Gets the value of the totalNumberChannels property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getTotalNumberChannels() {
		return totalNumberChannels;
	}

	/**
	 * Sets the value of the totalNumberChannels property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setTotalNumberChannels(BigInteger value) {
		this.totalNumberChannels = value;
	}

	/**
	 * Gets the value of the selectedNumberChannels property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getSelectedNumberChannels() {
		return selectedNumberChannels;
	}

	/**
	 * Sets the value of the selectedNumberChannels property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setSelectedNumberChannels(BigInteger value) {
		this.selectedNumberChannels = value;
	}

	/**
	 * Gets the value of the externalReference property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the externalReference property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getExternalReference().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ExternalReferenceType }
	 * 
	 * 
	 */
	public List<ExternalReferenceType> getExternalReference() {
		if (externalReference == null) {
			externalReference = new ArrayList<ExternalReferenceType>();
		}
		return this.externalReference;
	}

	/**
	 * Gets the value of the channel property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the channel property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getChannel().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Channel }
	 * 
	 * 
	 */
	public List<Channel> getChannels() {
		return this.channels;
	}

	/*
	 * public Channel getChannel(String code, String location) { if
	 * (this.channels == null) { return null; } for (Channel c : this.channels)
	 * { if (c.getCode().equals(code) && c.getLocationCode().equals(location)) {
	 * return c; } } return null; }
	 */
	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
	 *         &lt;element name="Contact" type="{http://www.fdsn.org/xml/station/1}PersonType" maxOccurs="unbounded" minOccurs="0"/>
	 *         &lt;element name="WebSite" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "agency", "contact", "webSite" })
	public static class Operator {

		@XmlElement(name = "Agency", required = true)
		protected List<String> agency;
		@XmlElement(name = "Contact")
		protected List<PersonType> contact;
		@XmlElement(name = "WebSite")
		@XmlSchemaType(name = "anyURI")
		protected String webSite;

		/**
		 * Gets the value of the agency property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the agency property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAgency().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
		 * 
		 * 
		 */
		public List<String> getAgency() {
			if (agency == null) {
				agency = new ArrayList<String>();
			}
			return this.agency;
		}

		/**
		 * Gets the value of the contact property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the contact property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getContact().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link PersonType }
		 * 
		 * 
		 */
		public List<PersonType> getContact() {
			if (contact == null) {
				contact = new ArrayList<PersonType>();
			}
			return this.contact;
		}

		/**
		 * Gets the value of the webSite property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getWebSite() {
			return webSite;
		}

		/**
		 * Sets the value of the webSite property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setWebSite(String value) {
			this.webSite = value;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Station other = (Station) obj;
		if (network == null) {
			if (other.network != null) {
				return false;
			}
		} else if (!network.equals(other.network)) {
			return false;
		}

		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Station [code=" + code + ", startDate=" + startDate + ", endDate=" + endDate + ", totalNumberChannels="
				+ totalNumberChannels + ", selectedNumberChannels=" + selectedNumberChannels + "]";
	}

}
