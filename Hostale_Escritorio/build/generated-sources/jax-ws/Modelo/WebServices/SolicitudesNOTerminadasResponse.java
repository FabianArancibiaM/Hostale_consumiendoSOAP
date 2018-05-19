
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
 *         &lt;element name="Solicitudes_NO_terminadasResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "solicitudesNOTerminadasResult"
})
@XmlRootElement(name = "Solicitudes_NO_terminadasResponse")
public class SolicitudesNOTerminadasResponse {

    @XmlElement(name = "Solicitudes_NO_terminadasResult")
    protected String solicitudesNOTerminadasResult;

    /**
     * Obtiene el valor de la propiedad solicitudesNOTerminadasResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolicitudesNOTerminadasResult() {
        return solicitudesNOTerminadasResult;
    }

    /**
     * Define el valor de la propiedad solicitudesNOTerminadasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolicitudesNOTerminadasResult(String value) {
        this.solicitudesNOTerminadasResult = value;
    }

}
