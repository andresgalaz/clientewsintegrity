/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public interface ServiceSoap extends java.rmi.Remote {
    public ar.com.libertyargentina.CotizarRamasStringResponseCotizarRamasStringResult cotizarRamasString(java.lang.String XML) throws java.rmi.RemoteException;
    public ar.com.libertyargentina.CotizarStringResponseCotizarStringResult cotizarString(java.lang.String XML) throws java.rmi.RemoteException;
    public ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult consultaPorDni(java.lang.String XML) throws java.rmi.RemoteException;
    public ar.com.libertyargentina.ConsultaResponseConsultaResult consulta(java.lang.String XML) throws java.rmi.RemoteException;
    public ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult cargarFiltrosPoliza(java.lang.String seccion, java.lang.String poliza, java.lang.String endoso) throws java.rmi.RemoteException;
    public JaimeNet.Liberty.webservices.ArchivoPdf generaPDFPoliza(java.lang.String seccion, java.lang.String poliza, java.lang.String endoso, java.lang.String marcaAgua, ar.com.libertyargentina.GeneraPDFPolizaFiltros filtros, java.lang.String productor, java.lang.String ticket, java.lang.String documento) throws java.rmi.RemoteException;
    public ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult obtenerCertificadoJaime(java.lang.String XML) throws java.rmi.RemoteException;
    public ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult obtenerCertificado(java.lang.String XML) throws java.rmi.RemoteException;
}
