/**
 * ArchivoPdf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JaimeNet.Liberty.webservices;

public class ArchivoPdf  implements java.io.Serializable {
    private static final long serialVersionUID = -858347952586027990L;

    private boolean procesoOk;
    private java.lang.String nombreArchivo;
    private byte[] contenidoArchivo;
    private java.lang.String mensajeError;

    public ArchivoPdf() {
    }

    public ArchivoPdf(
           boolean procesoOk,
           java.lang.String nombreArchivo,
           byte[] contenidoArchivo,
           java.lang.String mensajeError) {
           this.procesoOk = procesoOk;
           this.nombreArchivo = nombreArchivo;
           this.contenidoArchivo = contenidoArchivo;
           this.mensajeError = mensajeError;
    }


    /**
     * Gets the procesoOk value for this ArchivoPdf.
     * 
     * @return procesoOk
     */
    public boolean isProcesoOk() {
        return procesoOk;
    }


    /**
     * Sets the procesoOk value for this ArchivoPdf.
     * 
     * @param procesoOk
     */
    public void setProcesoOk(boolean procesoOk) {
        this.procesoOk = procesoOk;
    }


    /**
     * Gets the nombreArchivo value for this ArchivoPdf.
     * 
     * @return nombreArchivo
     */
    public java.lang.String getNombreArchivo() {
        return nombreArchivo;
    }


    /**
     * Sets the nombreArchivo value for this ArchivoPdf.
     * 
     * @param nombreArchivo
     */
    public void setNombreArchivo(java.lang.String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }


    /**
     * Gets the contenidoArchivo value for this ArchivoPdf.
     * 
     * @return contenidoArchivo
     */
    public byte[] getContenidoArchivo() {
        return contenidoArchivo;
    }


    /**
     * Sets the contenidoArchivo value for this ArchivoPdf.
     * 
     * @param contenidoArchivo
     */
    public void setContenidoArchivo(byte[] contenidoArchivo) {
        this.contenidoArchivo = contenidoArchivo;
    }


    /**
     * Gets the mensajeError value for this ArchivoPdf.
     * 
     * @return mensajeError
     */
    public java.lang.String getMensajeError() {
        return mensajeError;
    }


    /**
     * Sets the mensajeError value for this ArchivoPdf.
     * 
     * @param mensajeError
     */
    public void setMensajeError(java.lang.String mensajeError) {
        this.mensajeError = mensajeError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof ArchivoPdf)) return false;
        ArchivoPdf other = (ArchivoPdf) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.procesoOk == other.isProcesoOk() &&
            ((this.nombreArchivo==null && other.getNombreArchivo()==null) || 
             (this.nombreArchivo!=null &&
              this.nombreArchivo.equals(other.getNombreArchivo()))) &&
            ((this.contenidoArchivo==null && other.getContenidoArchivo()==null) || 
             (this.contenidoArchivo!=null &&
              java.util.Arrays.equals(this.contenidoArchivo, other.getContenidoArchivo()))) &&
            ((this.mensajeError==null && other.getMensajeError()==null) || 
             (this.mensajeError!=null &&
              this.mensajeError.equals(other.getMensajeError())));
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
        _hashCode += (isProcesoOk() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNombreArchivo() != null) {
            _hashCode += getNombreArchivo().hashCode();
        }
        if (getContenidoArchivo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContenidoArchivo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContenidoArchivo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensajeError() != null) {
            _hashCode += getMensajeError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchivoPdf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Liberty.JaimeNet/webservices", "ArchivoPdf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procesoOk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Liberty.JaimeNet/webservices", "ProcesoOk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreArchivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Liberty.JaimeNet/webservices", "NombreArchivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contenidoArchivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Liberty.JaimeNet/webservices", "ContenidoArchivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Liberty.JaimeNet/webservices", "MensajeError"));
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
