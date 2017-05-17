/**
 * ObtenerCertificadoJaimeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public class ObtenerCertificadoJaimeResponse  implements java.io.Serializable {
    private static final long serialVersionUID = -2154961643208104568L;
    private ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult obtenerCertificadoJaimeResult;

    public ObtenerCertificadoJaimeResponse() {
    }

    public ObtenerCertificadoJaimeResponse(
           ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult obtenerCertificadoJaimeResult) {
           this.obtenerCertificadoJaimeResult = obtenerCertificadoJaimeResult;
    }


    /**
     * Gets the obtenerCertificadoJaimeResult value for this ObtenerCertificadoJaimeResponse.
     * 
     * @return obtenerCertificadoJaimeResult
     */
    public ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult getObtenerCertificadoJaimeResult() {
        return obtenerCertificadoJaimeResult;
    }


    /**
     * Sets the obtenerCertificadoJaimeResult value for this ObtenerCertificadoJaimeResponse.
     * 
     * @param obtenerCertificadoJaimeResult
     */
    public void setObtenerCertificadoJaimeResult(ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult obtenerCertificadoJaimeResult) {
        this.obtenerCertificadoJaimeResult = obtenerCertificadoJaimeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof ObtenerCertificadoJaimeResponse)) return false;
        ObtenerCertificadoJaimeResponse other = (ObtenerCertificadoJaimeResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.obtenerCertificadoJaimeResult==null && other.getObtenerCertificadoJaimeResult()==null) || 
             (this.obtenerCertificadoJaimeResult!=null &&
              this.obtenerCertificadoJaimeResult.equals(other.getObtenerCertificadoJaimeResult())));
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
        if (getObtenerCertificadoJaimeResult() != null) {
            _hashCode += getObtenerCertificadoJaimeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerCertificadoJaimeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">obtenerCertificadoJaimeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obtenerCertificadoJaimeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "obtenerCertificadoJaimeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">>obtenerCertificadoJaimeResponse>obtenerCertificadoJaimeResult"));
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
