/**
 * ConsultaPorDniResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public class ConsultaPorDniResponse  implements java.io.Serializable {
    private static final long serialVersionUID = 8227760235278044963L;
    private ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult consultaPorDniResult;

    public ConsultaPorDniResponse() {
    }

    public ConsultaPorDniResponse(
           ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult consultaPorDniResult) {
           this.consultaPorDniResult = consultaPorDniResult;
    }


    /**
     * Gets the consultaPorDniResult value for this ConsultaPorDniResponse.
     * 
     * @return consultaPorDniResult
     */
    public ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult getConsultaPorDniResult() {
        return consultaPorDniResult;
    }


    /**
     * Sets the consultaPorDniResult value for this ConsultaPorDniResponse.
     * 
     * @param consultaPorDniResult
     */
    public void setConsultaPorDniResult(ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult consultaPorDniResult) {
        this.consultaPorDniResult = consultaPorDniResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof ConsultaPorDniResponse)) return false;
        ConsultaPorDniResponse other = (ConsultaPorDniResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consultaPorDniResult==null && other.getConsultaPorDniResult()==null) || 
             (this.consultaPorDniResult!=null &&
              this.consultaPorDniResult.equals(other.getConsultaPorDniResult())));
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
        if (getConsultaPorDniResult() != null) {
            _hashCode += getConsultaPorDniResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaPorDniResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">ConsultaPorDniResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consultaPorDniResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "ConsultaPorDniResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">>ConsultaPorDniResponse>ConsultaPorDniResult"));
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
