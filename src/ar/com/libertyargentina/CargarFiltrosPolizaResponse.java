/**
 * CargarFiltrosPolizaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public class CargarFiltrosPolizaResponse  implements java.io.Serializable {
    private static final long serialVersionUID = 2250238136157642435L;
    private ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult cargarFiltrosPolizaResult;

    public CargarFiltrosPolizaResponse() {
    }

    public CargarFiltrosPolizaResponse(
           ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult cargarFiltrosPolizaResult) {
           this.cargarFiltrosPolizaResult = cargarFiltrosPolizaResult;
    }


    /**
     * Gets the cargarFiltrosPolizaResult value for this CargarFiltrosPolizaResponse.
     * 
     * @return cargarFiltrosPolizaResult
     */
    public ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult getCargarFiltrosPolizaResult() {
        return cargarFiltrosPolizaResult;
    }


    /**
     * Sets the cargarFiltrosPolizaResult value for this CargarFiltrosPolizaResponse.
     * 
     * @param cargarFiltrosPolizaResult
     */
    public void setCargarFiltrosPolizaResult(ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult cargarFiltrosPolizaResult) {
        this.cargarFiltrosPolizaResult = cargarFiltrosPolizaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof CargarFiltrosPolizaResponse)) return false;
        CargarFiltrosPolizaResponse other = (CargarFiltrosPolizaResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cargarFiltrosPolizaResult==null && other.getCargarFiltrosPolizaResult()==null) || 
             (this.cargarFiltrosPolizaResult!=null &&
              this.cargarFiltrosPolizaResult.equals(other.getCargarFiltrosPolizaResult())));
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
        if (getCargarFiltrosPolizaResult() != null) {
            _hashCode += getCargarFiltrosPolizaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CargarFiltrosPolizaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">CargarFiltrosPolizaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargarFiltrosPolizaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "CargarFiltrosPolizaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">>CargarFiltrosPolizaResponse>CargarFiltrosPolizaResult"));
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
