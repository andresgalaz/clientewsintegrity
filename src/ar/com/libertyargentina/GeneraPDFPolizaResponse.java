/**
 * GeneraPDFPolizaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public class GeneraPDFPolizaResponse  implements java.io.Serializable {
    private static final long serialVersionUID = 3122451030073236932L;
    private JaimeNet.Liberty.webservices.ArchivoPdf generaPDFPolizaResult;

    public GeneraPDFPolizaResponse() {
    }

    public GeneraPDFPolizaResponse(
           JaimeNet.Liberty.webservices.ArchivoPdf generaPDFPolizaResult) {
           this.generaPDFPolizaResult = generaPDFPolizaResult;
    }


    /**
     * Gets the generaPDFPolizaResult value for this GeneraPDFPolizaResponse.
     * 
     * @return generaPDFPolizaResult
     */
    public JaimeNet.Liberty.webservices.ArchivoPdf getGeneraPDFPolizaResult() {
        return generaPDFPolizaResult;
    }


    /**
     * Sets the generaPDFPolizaResult value for this GeneraPDFPolizaResponse.
     * 
     * @param generaPDFPolizaResult
     */
    public void setGeneraPDFPolizaResult(JaimeNet.Liberty.webservices.ArchivoPdf generaPDFPolizaResult) {
        this.generaPDFPolizaResult = generaPDFPolizaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof GeneraPDFPolizaResponse)) return false;
        GeneraPDFPolizaResponse other = (GeneraPDFPolizaResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.generaPDFPolizaResult==null && other.getGeneraPDFPolizaResult()==null) || 
             (this.generaPDFPolizaResult!=null &&
              this.generaPDFPolizaResult.equals(other.getGeneraPDFPolizaResult())));
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
        if (getGeneraPDFPolizaResult() != null) {
            _hashCode += getGeneraPDFPolizaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneraPDFPolizaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">GeneraPDFPolizaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generaPDFPolizaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "GeneraPDFPolizaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Liberty.JaimeNet/webservices", "ArchivoPdf"));
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
