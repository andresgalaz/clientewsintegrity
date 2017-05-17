/**
 * GeneraPDFPoliza.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public class GeneraPDFPoliza  implements java.io.Serializable {
    private static final long serialVersionUID = 1612376761573697236L;

    private java.lang.String seccion;
    private java.lang.String poliza;
    private java.lang.String endoso;
    private java.lang.String marcaAgua;
    private ar.com.libertyargentina.GeneraPDFPolizaFiltros filtros;
    private java.lang.String productor;
    private java.lang.String ticket;
    private java.lang.String documento;

    public GeneraPDFPoliza() {
    }

    public GeneraPDFPoliza(
           java.lang.String seccion,
           java.lang.String poliza,
           java.lang.String endoso,
           java.lang.String marcaAgua,
           ar.com.libertyargentina.GeneraPDFPolizaFiltros filtros,
           java.lang.String productor,
           java.lang.String ticket,
           java.lang.String documento) {
           this.seccion = seccion;
           this.poliza = poliza;
           this.endoso = endoso;
           this.marcaAgua = marcaAgua;
           this.filtros = filtros;
           this.productor = productor;
           this.ticket = ticket;
           this.documento = documento;
    }


    /**
     * Gets the seccion value for this GeneraPDFPoliza.
     * 
     * @return seccion
     */
    public java.lang.String getSeccion() {
        return seccion;
    }


    /**
     * Sets the seccion value for this GeneraPDFPoliza.
     * 
     * @param seccion
     */
    public void setSeccion(java.lang.String seccion) {
        this.seccion = seccion;
    }


    /**
     * Gets the poliza value for this GeneraPDFPoliza.
     * 
     * @return poliza
     */
    public java.lang.String getPoliza() {
        return poliza;
    }


    /**
     * Sets the poliza value for this GeneraPDFPoliza.
     * 
     * @param poliza
     */
    public void setPoliza(java.lang.String poliza) {
        this.poliza = poliza;
    }


    /**
     * Gets the endoso value for this GeneraPDFPoliza.
     * 
     * @return endoso
     */
    public java.lang.String getEndoso() {
        return endoso;
    }


    /**
     * Sets the endoso value for this GeneraPDFPoliza.
     * 
     * @param endoso
     */
    public void setEndoso(java.lang.String endoso) {
        this.endoso = endoso;
    }


    /**
     * Gets the marcaAgua value for this GeneraPDFPoliza.
     * 
     * @return marcaAgua
     */
    public java.lang.String getMarcaAgua() {
        return marcaAgua;
    }


    /**
     * Sets the marcaAgua value for this GeneraPDFPoliza.
     * 
     * @param marcaAgua
     */
    public void setMarcaAgua(java.lang.String marcaAgua) {
        this.marcaAgua = marcaAgua;
    }


    /**
     * Gets the filtros value for this GeneraPDFPoliza.
     * 
     * @return filtros
     */
    public ar.com.libertyargentina.GeneraPDFPolizaFiltros getFiltros() {
        return filtros;
    }


    /**
     * Sets the filtros value for this GeneraPDFPoliza.
     * 
     * @param filtros
     */
    public void setFiltros(ar.com.libertyargentina.GeneraPDFPolizaFiltros filtros) {
        this.filtros = filtros;
    }


    /**
     * Gets the productor value for this GeneraPDFPoliza.
     * 
     * @return productor
     */
    public java.lang.String getProductor() {
        return productor;
    }


    /**
     * Sets the productor value for this GeneraPDFPoliza.
     * 
     * @param productor
     */
    public void setProductor(java.lang.String productor) {
        this.productor = productor;
    }


    /**
     * Gets the ticket value for this GeneraPDFPoliza.
     * 
     * @return ticket
     */
    public java.lang.String getTicket() {
        return ticket;
    }


    /**
     * Sets the ticket value for this GeneraPDFPoliza.
     * 
     * @param ticket
     */
    public void setTicket(java.lang.String ticket) {
        this.ticket = ticket;
    }


    /**
     * Gets the documento value for this GeneraPDFPoliza.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this GeneraPDFPoliza.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof GeneraPDFPoliza)) return false;
        GeneraPDFPoliza other = (GeneraPDFPoliza) obj;
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
              this.endoso.equals(other.getEndoso()))) &&
            ((this.marcaAgua==null && other.getMarcaAgua()==null) || 
             (this.marcaAgua!=null &&
              this.marcaAgua.equals(other.getMarcaAgua()))) &&
            ((this.filtros==null && other.getFiltros()==null) || 
             (this.filtros!=null &&
              this.filtros.equals(other.getFiltros()))) &&
            ((this.productor==null && other.getProductor()==null) || 
             (this.productor!=null &&
              this.productor.equals(other.getProductor()))) &&
            ((this.ticket==null && other.getTicket()==null) || 
             (this.ticket!=null &&
              this.ticket.equals(other.getTicket()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento())));
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
        if (getMarcaAgua() != null) {
            _hashCode += getMarcaAgua().hashCode();
        }
        if (getFiltros() != null) {
            _hashCode += getFiltros().hashCode();
        }
        if (getProductor() != null) {
            _hashCode += getProductor().hashCode();
        }
        if (getTicket() != null) {
            _hashCode += getTicket().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneraPDFPoliza.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">GeneraPDFPoliza"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marcaAgua");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "marcaAgua"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filtros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "filtros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", ">>GeneraPDFPoliza>filtros"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "productor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "ticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://libertyargentina.com.ar/", "documento"));
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
