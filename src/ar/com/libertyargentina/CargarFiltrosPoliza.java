/**
 * CargarFiltrosPoliza.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public class CargarFiltrosPoliza  implements java.io.Serializable {
    private static final long serialVersionUID = 4889868524563716610L;

    private java.lang.String seccion;

    private java.lang.String poliza;

    private java.lang.String endoso;

    public CargarFiltrosPoliza() {
    }

    public CargarFiltrosPoliza(
           java.lang.String seccion,
           java.lang.String poliza,
           java.lang.String endoso) {
           this.seccion = seccion;
           this.poliza = poliza;
           this.endoso = endoso;
    }


    /**
     * Gets the seccion value for this CargarFiltrosPoliza.
     * 
     * @return seccion
     */
    public java.lang.String getSeccion() {
        return seccion;
    }


    /**
     * Sets the seccion value for this CargarFiltrosPoliza.
     * 
     * @param seccion
     */
    public void setSeccion(java.lang.String seccion) {
        this.seccion = seccion;
    }


    /**
     * Gets the poliza value for this CargarFiltrosPoliza.
     * 
     * @return poliza
     */
    public java.lang.String getPoliza() {
        return poliza;
    }


    /**
     * Sets the poliza value for this CargarFiltrosPoliza.
     * 
     * @param poliza
     */
    public void setPoliza(java.lang.String poliza) {
        this.poliza = poliza;
    }


    /**
     * Gets the endoso value for this CargarFiltrosPoliza.
     * 
     * @return endoso
     */
    public java.lang.String getEndoso() {
        return endoso;
    }


    /**
     * Sets the endoso value for this CargarFiltrosPoliza.
     * 
     * @param endoso
     */
    public void setEndoso(java.lang.String endoso) {
        this.endoso = endoso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof CargarFiltrosPoliza)) return false;
        CargarFiltrosPoliza other = (CargarFiltrosPoliza) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seccion==null && other.getSeccion()==null) || 
             (this.seccion!=null &&
              this.seccion.equals(other.getSeccion()))) &&
            ((this.poliza==null && other.getPoliza()==null) || 
             (this.poliza!=null &&
              this.poliza.equals(other.getPoliza()))) &&
            ((this.endoso==null && other.getEndoso()==null) || 
             (this.endoso!=null &&
              this.endoso.equals(other.getEndoso())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSeccion() != null) {
            _hashCode += getSeccion().hashCode();
        }
        if (getPoliza() != null) {
            _hashCode += getPoliza().hashCode();
        }
        if (getEndoso() != null) {
            _hashCode += getEndoso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CargarFiltrosPoliza.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">CargarFiltrosPoliza"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "seccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poliza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "poliza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endoso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "endoso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
