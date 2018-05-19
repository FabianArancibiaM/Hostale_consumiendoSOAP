
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
 *         &lt;element name="Promedio_perdida_mensualResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "promedioPerdidaMensualResult"
})
@XmlRootElement(name = "Promedio_perdida_mensualResponse")
public class PromedioPerdidaMensualResponse {

    @XmlElement(name = "Promedio_perdida_mensualResult")
    protected String promedioPerdidaMensualResult;

    /**
     * Obtiene el valor de la propiedad promedioPerdidaMensualResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromedioPerdidaMensualResult() {
        return promedioPerdidaMensualResult;
    }

    /**
     * Define el valor de la propiedad promedioPerdidaMensualResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromedioPerdidaMensualResult(String value) {
        this.promedioPerdidaMensualResult = value;
    }

}
