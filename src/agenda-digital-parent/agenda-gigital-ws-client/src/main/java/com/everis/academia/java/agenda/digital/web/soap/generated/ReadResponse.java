
package com.everis.academia.java.agenda.digital.web.soap.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cidade" type="{http://soap.web.digital.agenda.java.academia.everis.com/}cidade" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readResponse", propOrder = {
    "cidade"
})
public class ReadResponse {

    protected List<Cidade> cidade;

    /**
     * Gets the value of the cidade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cidade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCidade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cidade }
     * 
     * 
     */
    public List<Cidade> getCidade() {
        if (cidade == null) {
            cidade = new ArrayList<Cidade>();
        }
        return this.cidade;
    }

}
