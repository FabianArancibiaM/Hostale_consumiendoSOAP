
package Modelo.WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fecha_mayor_augeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fechaMayorAugeResult"
})
@XmlRootElement(name = "Fecha_mayor_augeResponse")
public class FechaMayorAugeResponse {

    @XmlElement(name = "Fecha_mayor_augeResult")
    protected String fechaMayorAugeResult;

    /**
     * Obtiene el valor de la propiedad fechaMayorAugeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaMayorAugeResult() {
        return fechaMayorAugeResult;
    }

    /**
     * Define el valor de la propiedad fechaMayorAugeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaMayorAugeResult(String value) {
        this.fechaMayorAugeResult = value;
    }

}
