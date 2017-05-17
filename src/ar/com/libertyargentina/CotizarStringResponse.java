/**
 * CotizarStringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public class CotizarStringResponse  implements java.io.Serializable {
    private static final long serialVersionUID = -8884815293832694158L;
    private ar.com.libertyargentina.CotizarStringResponseCotizarStringResult cotizarStringResult;

    public CotizarStringResponse() {
    }

    public CotizarStringResponse(
           ar.com.libertyargentina.CotizarStringResponseCotizarStringResult cotizarStringResult) {
           this.cotizarStringResult = cotizarStringResult;
    }


    /**
     * Gets the cotizarStringResult value for this CotizarStringResponse.
     * 
     * @return cotizarStringResult
     */
    public ar.com.libertyargentina.CotizarStringResponseCotizarStringResult getCotizarStringResult() {
        return cotizarStringResult;
    }


    /**
     * Sets the cotizarStringResult value for this CotizarStringResponse.
     * 
     * @param cotizarStringResult
     */
    public void setCotizarStringResult(ar.com.libertyargentina.CotizarStringResponseCotizarStringResult cotizarStringResult) {
        this.cotizarStringResult = cotizarStringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof CotizarStringResponse)) return false;
        CotizarStringResponse other = (CotizarStringResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cotizarStringResult==null && other.getCotizarStringResult()==null) || 
             (this.cotizarStringResult!=null &&
              this.cotizarStringResult.equals(other.getCotizarStringResult())));
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
        if (getCotizarStringResult() != null) {
            _hashCode += getCotizarStringResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CotizarStringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">CotizarStringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cotizarStringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "CotizarStringResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">>CotizarStringResponse>CotizarStringResult"));
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
