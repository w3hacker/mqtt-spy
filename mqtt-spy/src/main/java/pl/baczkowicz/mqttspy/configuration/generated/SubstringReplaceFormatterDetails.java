//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.27 at 11:19:46 AM GMT 
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
 * <p>Java class for SubstringReplaceFormatterDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstringReplaceFormatterDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://baczkowicz.pl/mqtt-spy-configuration}SubstringFormatterDetails">
 *       &lt;sequence>
 *         &lt;element name="ReplaceWith" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstringReplaceFormatterDetails", propOrder = {
    "replaceWith"
})
public class SubstringReplaceFormatterDetails
    extends SubstringFormatterDetails
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "ReplaceWith", required = true)
    protected String replaceWith;

    /**
     * Default no-arg constructor
     * 
     */
    public SubstringReplaceFormatterDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SubstringReplaceFormatterDetails(final String startTag, final String endTag, final boolean keepTags, final String replaceWith) {
        super(startTag, endTag, keepTags);
        this.replaceWith = replaceWith;
    }

    /**
     * Gets the value of the replaceWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceWith() {
        return replaceWith;
    }

    /**
     * Sets the value of the replaceWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceWith(String value) {
        this.replaceWith = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            String theReplaceWith;
            theReplaceWith = this.getReplaceWith();
            toStringBuilder.append("replaceWith", theReplaceWith);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof SubstringReplaceFormatterDetails)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final SubstringReplaceFormatterDetails that = ((SubstringReplaceFormatterDetails) object);
        equalsBuilder.append(this.getReplaceWith(), that.getReplaceWith());
    }

    public boolean equals(Object object) {
        if (!(object instanceof SubstringReplaceFormatterDetails)) {
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
        super.hashCode(hashCodeBuilder);
        hashCodeBuilder.append(this.getReplaceWith());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final SubstringReplaceFormatterDetails copy = ((target == null)?((SubstringReplaceFormatterDetails) createCopy()):((SubstringReplaceFormatterDetails) target));
        super.copyTo(copy, copyBuilder);
        {
            String sourceReplaceWith;
            sourceReplaceWith = this.getReplaceWith();
            String copyReplaceWith = ((String) copyBuilder.copy(sourceReplaceWith));
            copy.setReplaceWith(copyReplaceWith);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new SubstringReplaceFormatterDetails();
    }

}
