//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.02 at 08:05:17 PM BST 
//


package pl.baczkowicz.mqttspy.versions.generated;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for LatestVersions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatestVersions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatestVersion" type="{http://baczkowicz.pl/mqtt-spy-versions}LatestVersion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatestVersions", propOrder = {
    "latestVersion"
})
public class LatestVersions
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "LatestVersion")
    protected List<LatestVersion> latestVersion;

    /**
     * Gets the value of the latestVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latestVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatestVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LatestVersion }
     * 
     * 
     */
    public List<LatestVersion> getLatestVersion() {
        if (latestVersion == null) {
            latestVersion = new ArrayList<LatestVersion>();
        }
        return this.latestVersion;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            List<LatestVersion> theLatestVersion;
            theLatestVersion = this.getLatestVersion();
            toStringBuilder.append("latestVersion", theLatestVersion);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof LatestVersions)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final LatestVersions that = ((LatestVersions) object);
        equalsBuilder.append(this.getLatestVersion(), that.getLatestVersion());
    }

    public boolean equals(Object object) {
        if (!(object instanceof LatestVersions)) {
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
        hashCodeBuilder.append(this.getLatestVersion());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final LatestVersions copy = ((target == null)?((LatestVersions) createCopy()):((LatestVersions) target));
        {
            List<LatestVersion> sourceLatestVersion;
            sourceLatestVersion = this.getLatestVersion();
            List<LatestVersion> copyLatestVersion = ((List<LatestVersion> ) copyBuilder.copy(sourceLatestVersion));
            copy.latestVersion = null;
            List<LatestVersion> uniqueLatestVersionl = copy.getLatestVersion();
            uniqueLatestVersionl.addAll(copyLatestVersion);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new LatestVersions();
    }

}
