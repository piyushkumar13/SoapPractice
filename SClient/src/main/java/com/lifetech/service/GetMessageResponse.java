
package com.lifetech.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMessageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMessageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PiyushMessageToWorld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMessageResponse", propOrder = {
    "piyushMessageToWorld"
})
public class GetMessageResponse {

    @XmlElement(name = "PiyushMessageToWorld")
    protected String piyushMessageToWorld;

    /**
     * Gets the value of the piyushMessageToWorld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiyushMessageToWorld() {
        return piyushMessageToWorld;
    }

    /**
     * Sets the value of the piyushMessageToWorld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiyushMessageToWorld(String value) {
        this.piyushMessageToWorld = value;
    }

}
