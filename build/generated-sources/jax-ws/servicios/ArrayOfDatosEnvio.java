
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDatosEnvio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDatosEnvio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatosEnvio" type="{http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes}DatosEnvio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatosEnvio", namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", propOrder = {
    "datosEnvio"
})
public class ArrayOfDatosEnvio {

    @XmlElement(name = "DatosEnvio", nillable = true)
    protected List<DatosEnvio> datosEnvio;

    /**
     * Gets the value of the datosEnvio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosEnvio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosEnvio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosEnvio }
     * 
     * 
     */
    public List<DatosEnvio> getDatosEnvio() {
        if (datosEnvio == null) {
            datosEnvio = new ArrayList<DatosEnvio>();
        }
        return this.datosEnvio;
    }

}
