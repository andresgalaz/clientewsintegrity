/**
 * ConsultaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public class ConsultaResponse  implements java.io.Serializable {
    private static final long serialVersionUID = 7738679963332559406L;
    private ar.com.libertyargentina.ConsultaResponseConsultaResult consultaResult;

    public ConsultaResponse() {
    }

    public ConsultaResponse(
           ar.com.libertyargentina.ConsultaResponseConsultaResult consultaResult) {
           this.consultaResult = consultaResult;
    }


    /**
     * Gets the consultaResult value for this ConsultaResponse.
     * 
     * @return consultaResult
     */
    public ar.com.libertyargentina.ConsultaResponseConsultaResult getConsultaResult() {
        return consultaResult;
    }


    /**
     * Sets the consultaResult value for this ConsultaResponse.
     * 
     * @param consultaResult
     */
    public void setConsultaResult(ar.com.libertyargentina.ConsultaResponseConsultaResult consultaResult) {
        this.consultaResult = consultaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof ConsultaResponse)) return false;
        ConsultaResponse other = (ConsultaResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consultaResult==null && other.getConsultaResult()==null) || 
             (this.consultaResult!=null &&
              this.consultaResult.equals(other.getConsultaResult())));
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
        if (getConsultaResult() != null) {
            _hashCode += getConsultaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">ConsultaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consultaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "ConsultaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">>ConsultaResponse>ConsultaResult"));
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
