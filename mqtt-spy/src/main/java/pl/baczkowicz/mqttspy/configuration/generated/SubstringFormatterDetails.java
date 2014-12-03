//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.03 at 07:13:49 PM GMT 
//


package pl.baczkowicz.mqttspy.configuration.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for SubstringFormatterDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstringFormatterDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EndTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KeepTags" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstringFormatterDetails", propOrder = {
    "startTag",
    "endTag",
    "keepTags"
})
@XmlSeeAlso({
    SubstringReplaceFormatterDetails.class,
    SubstringConversionFormatterDetails.class,
    SubstringExtractFormatterDetails.class
})
public abstract class SubstringFormatterDetails implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "StartTag", required = true)
    protected String startTag;
    @XmlElement(name = "EndTag", required = true)
    protected String endTag;
    @XmlElement(name = "KeepTags")
    protected boolean keepTags;

    /**
     * Default no-arg constructor
     * 
     */
    public SubstringFormatterDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SubstringFormatterDetails(final String startTag, final String endTag, final boolean keepTags) {
        this.startTag = startTag;
        this.endTag = endTag;
        this.keepTags = keepTags;
    }

    /**
     * Gets the value of the startTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTag() {
        return startTag;
    }

    /**
     * Sets the value of the startTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTag(String value) {
        this.startTag = value;
    }

    /**
     * Gets the value of the endTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTag() {
        return endTag;
    }

    /**
     * Sets the value of the endTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTag(String value) {
        this.endTag = value;
    }

    /**
     * Gets the value of the keepTags property.
     * 
     */
    public boolean isKeepTags() {
        return keepTags;
    }

    /**
     * Sets the value of the keepTags property.
     * 
     */
    public void setKeepTags(boolean value) {
        this.keepTags = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            String theStartTag;
            theStartTag = this.getStartTag();
            toStringBuilder.append("startTag", theStartTag);
        }
        {
            String theEndTag;
            theEndTag = this.getEndTag();
            toStringBuilder.append("endTag", theEndTag);
        }
        {
            boolean theKeepTags;
            theKeepTags = this.isKeepTags();
            toStringBuilder.append("keepTags", theKeepTags);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof SubstringFormatterDetails)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final SubstringFormatterDetails that = ((SubstringFormatterDetails) object);
        equalsBuilder.append(this.getStartTag(), that.getStartTag());
        equalsBuilder.append(this.getEndTag(), that.getEndTag());
        equalsBuilder.append(this.isKeepTags(), that.isKeepTags());
    }

    public boolean equals(Object object) {
        if (!(object instanceof SubstringFormatterDetails)) {
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
        hashCodeBuilder.append(this.getStartTag());
        hashCodeBuilder.append(this.getEndTag());
        hashCodeBuilder.append(this.isKeepTags());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        final SubstringFormatterDetails copy = ((SubstringFormatterDetails) target);
        {
            String sourceStartTag;
            sourceStartTag = this.getStartTag();
            String copyStartTag = ((String) copyBuilder.copy(sourceStartTag));
            copy.setStartTag(copyStartTag);
        }
        {
            String sourceEndTag;
            sourceEndTag = this.getEndTag();
            String copyEndTag = ((String) copyBuilder.copy(sourceEndTag));
            copy.setEndTag(copyEndTag);
        }
        {
            boolean sourceKeepTags;
            sourceKeepTags = this.isKeepTags();
            boolean copyKeepTags = ((boolean) copyBuilder.copy(sourceKeepTags));
            copy.setKeepTags(copyKeepTags);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

}
