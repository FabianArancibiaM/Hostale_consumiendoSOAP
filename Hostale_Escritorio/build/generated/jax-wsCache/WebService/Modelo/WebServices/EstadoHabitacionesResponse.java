
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
 *         &lt;element name="Estado_habitacionesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "estadoHabitacionesResult"
})
@XmlRootElement(name = "Estado_habitacionesResponse")
public class EstadoHabitacionesResponse {

    @XmlElement(name = "Estado_habitacionesResult")
    protected String estadoHabitacionesResult;

    /**
     * Obtiene el valor de la propiedad estadoHabitacionesResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoHabitacionesResult() {
        return estadoHabitacionesResult;
    }

    /**
     * Define el valor de la propiedad estadoHabitacionesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoHabitacionesResult(String value) {
        this.estadoHabitacionesResult = value;
    }

}
