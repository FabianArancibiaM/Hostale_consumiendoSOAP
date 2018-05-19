
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
 *         &lt;element name="Metodo_pago_mas_usadoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "metodoPagoMasUsadoResult"
})
@XmlRootElement(name = "Metodo_pago_mas_usadoResponse")
public class MetodoPagoMasUsadoResponse {

    @XmlElement(name = "Metodo_pago_mas_usadoResult")
    protected String metodoPagoMasUsadoResult;

    /**
     * Obtiene el valor de la propiedad metodoPagoMasUsadoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoPagoMasUsadoResult() {
        return metodoPagoMasUsadoResult;
    }

    /**
     * Define el valor de la propiedad metodoPagoMasUsadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoPagoMasUsadoResult(String value) {
        this.metodoPagoMasUsadoResult = value;
    }

}
