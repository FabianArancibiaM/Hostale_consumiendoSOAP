
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
 *         &lt;element name="Ciudad_mas_solicita_serviciosResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ciudadMasSolicitaServiciosResult"
})
@XmlRootElement(name = "Ciudad_mas_solicita_serviciosResponse")
public class CiudadMasSolicitaServiciosResponse {

    @XmlElement(name = "Ciudad_mas_solicita_serviciosResult")
    protected String ciudadMasSolicitaServiciosResult;

    /**
     * Obtiene el valor de la propiedad ciudadMasSolicitaServiciosResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadMasSolicitaServiciosResult() {
        return ciudadMasSolicitaServiciosResult;
    }

    /**
     * Define el valor de la propiedad ciudadMasSolicitaServiciosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadMasSolicitaServiciosResult(String value) {
        this.ciudadMasSolicitaServiciosResult = value;
    }

}
