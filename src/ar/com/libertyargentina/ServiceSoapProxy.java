package ar.com.libertyargentina;

public class ServiceSoapProxy implements ar.com.libertyargentina.ServiceSoap {
  private String _endpoint = null;
  private ar.com.libertyargentina.ServiceSoap serviceSoap = null;
  
  public ServiceSoapProxy() {
    _initServiceSoapProxy();
  }
  
  public ServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceSoapProxy();
  }
  
  private void _initServiceSoapProxy() {
    try {
      serviceSoap = (new ar.com.libertyargentina.ServiceLocator()).getServiceSoap();
      if (serviceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceSoap != null)
      ((javax.xml.rpc.Stub)serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ar.com.libertyargentina.ServiceSoap getServiceSoap() {
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap;
  }
  
  public ar.com.libertyargentina.CotizarRamasStringResponseCotizarRamasStringResult cotizarRamasString(java.lang.String XML) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.cotizarRamasString(XML);
  }
  
  public ar.com.libertyargentina.CotizarStringResponseCotizarStringResult cotizarString(java.lang.String XML) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.cotizarString(XML);
  }
  
  public ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult consultaPorDni(java.lang.String XML) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.consultaPorDni(XML);
  }
  
  public ar.com.libertyargentina.ConsultaResponseConsultaResult consulta(java.lang.String XML) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.consulta(XML);
  }
  
  public ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult cargarFiltrosPoliza(java.lang.String seccion, java.lang.String poliza, java.lang.String endoso) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.cargarFiltrosPoliza(seccion, poliza, endoso);
  }
  
  public JaimeNet.Liberty.webservices.ArchivoPdf generaPDFPoliza(java.lang.String seccion, java.lang.String poliza, java.lang.String endoso, java.lang.String marcaAgua, ar.com.libertyargentina.GeneraPDFPolizaFiltros filtros, java.lang.String productor, java.lang.String ticket, java.lang.String documento) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.generaPDFPoliza(seccion, poliza, endoso, marcaAgua, filtros, productor, ticket, documento);
  }
  
  public ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult obtenerCertificadoJaime(java.lang.String XML) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.obtenerCertificadoJaime(XML);
  }
  
  public ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult obtenerCertificado(java.lang.String XML) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.obtenerCertificado(XML);
  }
  
  
}