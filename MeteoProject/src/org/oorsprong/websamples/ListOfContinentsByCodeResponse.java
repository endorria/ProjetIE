
package org.oorsprong.websamples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfContinentsByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftContinent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfContinentsByCodeResult"
})
@XmlRootElement(name = "ListOfContinentsByCodeResponse")
public class ListOfContinentsByCodeResponse {

    @XmlElement(name = "ListOfContinentsByCodeResult", required = true)
    protected ArrayOftContinent listOfContinentsByCodeResult;

    /**
     * Obtient la valeur de la propri�t� listOfContinentsByCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftContinent }
     *     
     */
    public ArrayOftContinent getListOfContinentsByCodeResult() {
        return listOfContinentsByCodeResult;
    }

    /**
     * D�finit la valeur de la propri�t� listOfContinentsByCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftContinent }
     *     
     */
    public void setListOfContinentsByCodeResult(ArrayOftContinent value) {
        this.listOfContinentsByCodeResult = value;
    }

}
