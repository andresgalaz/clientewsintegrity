/**
 * ObtenerCertificadoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public class ObtenerCertificadoResponse  implements java.io.Serializable {
    private static final long serialVersionUID = -2296452306633131486L;
    private ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult obtenerCertificadoResult;

    public ObtenerCertificadoResponse() {
    }

    public ObtenerCertificadoResponse(
           ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult obtenerCertificadoResult) {
           this.obtenerCertificadoResult = obtenerCertificadoResult;
    }


    /**
     * Gets the obtenerCertificadoResult value for this ObtenerCertificadoResponse.
     * 
     * @return obtenerCertificadoResult
     */
    public ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult getObtenerCertificadoResult() {
        return obtenerCertificadoResult;
    }


    /**
     * Sets the obtenerCertificadoResult value for this ObtenerCertificadoResponse.
     * 
     * @param obtenerCertificadoResult
     */
    public void setObtenerCertificadoResult(ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult obtenerCertificadoResult) {
        this.obtenerCertificadoResult = obtenerCertificadoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof ObtenerCertificadoResponse)) return false;
        ObtenerCertificadoResponse other = (ObtenerCertificadoResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.obtenerCertificadoResult==null && other.getObtenerCertificadoResult()==null) || 
             (this.obtenerCertificadoResult!=null &&
              this.obtenerCertificadoResult.equals(other.getObtenerCertificadoResult())));
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
        if (getObtenerCertificadoResult() != null) {
            _hashCode += getObtenerCertificadoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerCertificadoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">obtenerCertificadoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obtenerCertificadoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "obtenerCertificadoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">>obtenerCertificadoResponse>obtenerCertificadoResult"));
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
