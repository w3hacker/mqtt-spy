//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.19 at 02:41:23 PM GMT 
//


package pl.baczkowicz.mqttspy.common.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for MessageLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageLog">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://baczkowicz.pl/mqtt-spy/common>MessageLogEnum">
 *       &lt;attribute name="logQos" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="logRetained" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="logConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="logSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="logBeforeScripts" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageLog", propOrder = {
    "value"
})
public class MessageLog implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlValue
    protected MessageLogEnum value;
    @XmlAttribute(name = "logQos")
    protected Boolean logQos;
    @XmlAttribute(name = "logRetained")
    protected Boolean logRetained;
    @XmlAttribute(name = "logConnection")
    protected Boolean logConnection;
    @XmlAttribute(name = "logSubscription")
    protected Boolean logSubscription;
    @XmlAttribute(name = "logBeforeScripts")
    protected Boolean logBeforeScripts;

    /**
     * Default no-arg constructor
     * 
     */
    public MessageLog() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MessageLog(final MessageLogEnum value, final Boolean logQos, final Boolean logRetained, final Boolean logConnection, final Boolean logSubscription, final Boolean logBeforeScripts) {
        this.value = value;
        this.logQos = logQos;
        this.logRetained = logRetained;
        this.logConnection = logConnection;
        this.logSubscription = logSubscription;
        this.logBeforeScripts = logBeforeScripts;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link MessageLogEnum }
     *     
     */
    public MessageLogEnum getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageLogEnum }
     *     
     */
    public void setValue(MessageLogEnum value) {
        this.value = value;
    }

    /**
     * Gets the value of the logQos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogQos() {
        return logQos;
    }

    /**
     * Sets the value of the logQos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogQos(Boolean value) {
        this.logQos = value;
    }

    /**
     * Gets the value of the logRetained property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogRetained() {
        return logRetained;
    }

    /**
     * Sets the value of the logRetained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogRetained(Boolean value) {
        this.logRetained = value;
    }

    /**
     * Gets the value of the logConnection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogConnection() {
        return logConnection;
    }

    /**
     * Sets the value of the logConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogConnection(Boolean value) {
        this.logConnection = value;
    }

    /**
     * Gets the value of the logSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogSubscription() {
        return logSubscription;
    }

    /**
     * Sets the value of the logSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogSubscription(Boolean value) {
        this.logSubscription = value;
    }

    /**
     * Gets the value of the logBeforeScripts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogBeforeScripts() {
        return logBeforeScripts;
    }

    /**
     * Sets the value of the logBeforeScripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogBeforeScripts(Boolean value) {
        this.logBeforeScripts = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            MessageLogEnum theValue;
            theValue = this.getValue();
            toStringBuilder.append("value", theValue);
        }
        {
            Boolean theLogQos;
            theLogQos = this.isLogQos();
            toStringBuilder.append("logQos", theLogQos);
        }
        {
            Boolean theLogRetained;
            theLogRetained = this.isLogRetained();
            toStringBuilder.append("logRetained", theLogRetained);
        }
        {
            Boolean theLogConnection;
            theLogConnection = this.isLogConnection();
            toStringBuilder.append("logConnection", theLogConnection);
        }
        {
            Boolean theLogSubscription;
            theLogSubscription = this.isLogSubscription();
            toStringBuilder.append("logSubscription", theLogSubscription);
        }
        {
            Boolean theLogBeforeScripts;
            theLogBeforeScripts = this.isLogBeforeScripts();
            toStringBuilder.append("logBeforeScripts", theLogBeforeScripts);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof MessageLog)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final MessageLog that = ((MessageLog) object);
        equalsBuilder.append(this.getValue(), that.getValue());
        equalsBuilder.append(this.isLogQos(), that.isLogQos());
        equalsBuilder.append(this.isLogRetained(), that.isLogRetained());
        equalsBuilder.append(this.isLogConnection(), that.isLogConnection());
        equalsBuilder.append(this.isLogSubscription(), that.isLogSubscription());
        equalsBuilder.append(this.isLogBeforeScripts(), that.isLogBeforeScripts());
    }

    public boolean equals(Object object) {
        if (!(object instanceof MessageLog)) {
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
        hashCodeBuilder.append(this.getValue());
        hashCodeBuilder.append(this.isLogQos());
        hashCodeBuilder.append(this.isLogRetained());
        hashCodeBuilder.append(this.isLogConnection());
        hashCodeBuilder.append(this.isLogSubscription());
        hashCodeBuilder.append(this.isLogBeforeScripts());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final MessageLog copy = ((target == null)?((MessageLog) createCopy()):((MessageLog) target));
        {
            MessageLogEnum sourceValue;
            sourceValue = this.getValue();
            MessageLogEnum copyValue = ((MessageLogEnum) copyBuilder.copy(sourceValue));
            copy.setValue(copyValue);
        }
        {
            Boolean sourceLogQos;
            sourceLogQos = this.isLogQos();
            Boolean copyLogQos = ((Boolean) copyBuilder.copy(sourceLogQos));
            copy.setLogQos(copyLogQos);
        }
        {
            Boolean sourceLogRetained;
            sourceLogRetained = this.isLogRetained();
            Boolean copyLogRetained = ((Boolean) copyBuilder.copy(sourceLogRetained));
            copy.setLogRetained(copyLogRetained);
        }
        {
            Boolean sourceLogConnection;
            sourceLogConnection = this.isLogConnection();
            Boolean copyLogConnection = ((Boolean) copyBuilder.copy(sourceLogConnection));
            copy.setLogConnection(copyLogConnection);
        }
        {
            Boolean sourceLogSubscription;
            sourceLogSubscription = this.isLogSubscription();
            Boolean copyLogSubscription = ((Boolean) copyBuilder.copy(sourceLogSubscription));
            copy.setLogSubscription(copyLogSubscription);
        }
        {
            Boolean sourceLogBeforeScripts;
            sourceLogBeforeScripts = this.isLogBeforeScripts();
            Boolean copyLogBeforeScripts = ((Boolean) copyBuilder.copy(sourceLogBeforeScripts));
            copy.setLogBeforeScripts(copyLogBeforeScripts);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new MessageLog();
    }

}
