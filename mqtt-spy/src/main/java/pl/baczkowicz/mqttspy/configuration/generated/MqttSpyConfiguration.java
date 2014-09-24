//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.24 at 06:18:56 PM BST 
//


package pl.baczkowicz.mqttspy.configuration.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for MqttSpyConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MqttSpyConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Connectivity" type="{http://baczkowicz.pl/mqtt-spy-configuration}Connectivity"/>
 *         &lt;element name="Formatting" type="{http://baczkowicz.pl/mqtt-spy-configuration}Formatting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MqttSpyConfiguration", propOrder = {
    "connectivity",
    "formatting"
})
public class MqttSpyConfiguration
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "Connectivity", required = true)
    protected Connectivity connectivity;
    @XmlElement(name = "Formatting")
    protected Formatting formatting;

    /**
     * Gets the value of the connectivity property.
     * 
     * @return
     *     possible object is
     *     {@link Connectivity }
     *     
     */
    public Connectivity getConnectivity() {
        return connectivity;
    }

    /**
     * Sets the value of the connectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connectivity }
     *     
     */
    public void setConnectivity(Connectivity value) {
        this.connectivity = value;
    }

    /**
     * Gets the value of the formatting property.
     * 
     * @return
     *     possible object is
     *     {@link Formatting }
     *     
     */
    public Formatting getFormatting() {
        return formatting;
    }

    /**
     * Sets the value of the formatting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formatting }
     *     
     */
    public void setFormatting(Formatting value) {
        this.formatting = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            Connectivity theConnectivity;
            theConnectivity = this.getConnectivity();
            toStringBuilder.append("connectivity", theConnectivity);
        }
        {
            Formatting theFormatting;
            theFormatting = this.getFormatting();
            toStringBuilder.append("formatting", theFormatting);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof MqttSpyConfiguration)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final MqttSpyConfiguration that = ((MqttSpyConfiguration) object);
        equalsBuilder.append(this.getConnectivity(), that.getConnectivity());
        equalsBuilder.append(this.getFormatting(), that.getFormatting());
    }

    public boolean equals(Object object) {
        if (!(object instanceof MqttSpyConfiguration)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getConnectivity());
        hashCodeBuilder.append(this.getFormatting());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final MqttSpyConfiguration copy = ((target == null)?((MqttSpyConfiguration) createCopy()):((MqttSpyConfiguration) target));
        {
            Connectivity sourceConnectivity;
            sourceConnectivity = this.getConnectivity();
            Connectivity copyConnectivity = ((Connectivity) copyBuilder.copy(sourceConnectivity));
            copy.setConnectivity(copyConnectivity);
        }
        {
            Formatting sourceFormatting;
            sourceFormatting = this.getFormatting();
            Formatting copyFormatting = ((Formatting) copyBuilder.copy(sourceFormatting));
            copy.setFormatting(copyFormatting);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new MqttSpyConfiguration();
    }

}
