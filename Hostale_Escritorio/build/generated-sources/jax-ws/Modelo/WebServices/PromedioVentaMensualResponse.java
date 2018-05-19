
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
 *         &lt;element name="Promedio_venta_mensualResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "promedioVentaMensualResult"
})
@XmlRootElement(name = "Promedio_venta_mensualResponse")
public class PromedioVentaMensualResponse {

    @XmlElement(name = "Promedio_venta_mensualResult")
    protected String promedioVentaMensualResult;

    /**
     * Obtiene el valor de la propiedad promedioVentaMensualResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromedioVentaMensualResult() {
        return promedioVentaMensualResult;
    }

    /**
     * Define el valor de la propiedad promedioVentaMensualResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromedioVentaMensualResult(String value) {
        this.promedioVentaMensualResult = value;
    }

}
