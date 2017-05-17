/**
 * ServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.com.libertyargentina;

public class ServiceSoapStub extends org.apache.axis.client.Stub implements ar.com.libertyargentina.ServiceSoap {
    private java.util.Vector                           cachedSerClasses     = new java.util.Vector();
    private java.util.Vector                           cachedSerQNames      = new java.util.Vector();
    private java.util.Vector                           cachedSerFactories   = new java.util.Vector();
    private java.util.Vector                           cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName( "CotizarRamasString" );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "XML" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        oper.setReturnType( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>CotizarRamasStringResponse>CotizarRamasStringResult" ) );
        oper.setReturnClass( ar.com.libertyargentina.CotizarRamasStringResponseCotizarRamasStringResult.class );
        oper.setReturnQName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "CotizarRamasStringResult" ) );
        oper.setStyle( org.apache.axis.constants.Style.WRAPPED );
        oper.setUse( org.apache.axis.constants.Use.LITERAL );
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName( "CotizarString" );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "XML" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        oper.setReturnType( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>CotizarStringResponse>CotizarStringResult" ) );
        oper.setReturnClass( ar.com.libertyargentina.CotizarStringResponseCotizarStringResult.class );
        oper.setReturnQName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "CotizarStringResult" ) );
        oper.setStyle( org.apache.axis.constants.Style.WRAPPED );
        oper.setUse( org.apache.axis.constants.Use.LITERAL );
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName( "ConsultaPorDni" );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "XML" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        oper.setReturnType( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>ConsultaPorDniResponse>ConsultaPorDniResult" ) );
        oper.setReturnClass( ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult.class );
        oper.setReturnQName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "ConsultaPorDniResult" ) );
        oper.setStyle( org.apache.axis.constants.Style.WRAPPED );
        oper.setUse( org.apache.axis.constants.Use.LITERAL );
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName( "Consulta" );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "XML" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        oper.setReturnType( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>ConsultaResponse>ConsultaResult" ) );
        oper.setReturnClass( ar.com.libertyargentina.ConsultaResponseConsultaResult.class );
        oper.setReturnQName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "ConsultaResult" ) );
        oper.setStyle( org.apache.axis.constants.Style.WRAPPED );
        oper.setUse( org.apache.axis.constants.Use.LITERAL );
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName( "CargarFiltrosPoliza" );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "seccion" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "poliza" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "endoso" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        oper.setReturnType( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>CargarFiltrosPolizaResponse>CargarFiltrosPolizaResult" ) );
        oper.setReturnClass( ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult.class );
        oper.setReturnQName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "CargarFiltrosPolizaResult" ) );
        oper.setStyle( org.apache.axis.constants.Style.WRAPPED );
        oper.setUse( org.apache.axis.constants.Use.LITERAL );
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName( "GeneraPDFPoliza" );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "seccion" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "poliza" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "endoso" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "marcaAgua" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "filtros" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>GeneraPDFPoliza>filtros" ),
                ar.com.libertyargentina.GeneraPDFPolizaFiltros.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "productor" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "ticket" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "documento" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        oper.setReturnType( new javax.xml.namespace.QName( "http://Liberty.JaimeNet/webservices", "ArchivoPdf" ) );
        oper.setReturnClass( JaimeNet.Liberty.webservices.ArchivoPdf.class );
        oper.setReturnQName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "GeneraPDFPolizaResult" ) );
        oper.setStyle( org.apache.axis.constants.Style.WRAPPED );
        oper.setUse( org.apache.axis.constants.Use.LITERAL );
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName( "obtenerCertificadoJaime" );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "XML" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        oper.setReturnType( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>obtenerCertificadoJaimeResponse>obtenerCertificadoJaimeResult" ) );
        oper.setReturnClass( ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult.class );
        oper.setReturnQName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "obtenerCertificadoJaimeResult" ) );
        oper.setStyle( org.apache.axis.constants.Style.WRAPPED );
        oper.setUse( org.apache.axis.constants.Use.LITERAL );
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName( "obtenerCertificado" );
        param = new org.apache.axis.description.ParameterDesc( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "XML" ),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "string" ), java.lang.String.class, false, false );
        param.setOmittable( true );
        oper.addParameter( param );
        oper.setReturnType( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>obtenerCertificadoResponse>obtenerCertificadoResult" ) );
        oper.setReturnClass( ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult.class );
        oper.setReturnQName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "obtenerCertificadoResult" ) );
        oper.setStyle( org.apache.axis.constants.Style.WRAPPED );
        oper.setUse( org.apache.axis.constants.Use.LITERAL );
        _operations[7] = oper;

    }

    public ServiceSoapStub() throws org.apache.axis.AxisFault {
        this( null );
    }

    public ServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this( service );
        super.cachedEndpoint = endpointURL;
    }

    public ServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion( "1.2" );
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        // javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        // java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        // java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        // java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        // java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        // java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        // java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        // java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        // java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName( "http://Liberty.JaimeNet/webservices", "ArchivoPdf" );
        cachedSerQNames.add( qName );
        cls = JaimeNet.Liberty.webservices.ArchivoPdf.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>CargarFiltrosPolizaResponse>CargarFiltrosPolizaResult" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>ConsultaPorDniResponse>ConsultaPorDniResult" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>ConsultaResponse>ConsultaResult" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ConsultaResponseConsultaResult.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>CotizarRamasStringResponse>CotizarRamasStringResult" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.CotizarRamasStringResponseCotizarRamasStringResult.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>CotizarStringResponse>CotizarStringResult" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.CotizarStringResponseCotizarStringResult.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>GeneraPDFPoliza>filtros" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.GeneraPDFPolizaFiltros.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>obtenerCertificadoJaimeResponse>obtenerCertificadoJaimeResult" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">>obtenerCertificadoResponse>obtenerCertificadoResult" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">CargarFiltrosPoliza" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.CargarFiltrosPoliza.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">CargarFiltrosPolizaResponse" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.CargarFiltrosPolizaResponse.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">Consulta" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.Consulta.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">ConsultaPorDni" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ConsultaPorDni.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">ConsultaPorDniResponse" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ConsultaPorDniResponse.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">ConsultaResponse" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ConsultaResponse.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">CotizarString" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.CotizarString.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">CotizarStringResponse" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.CotizarStringResponse.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">DataSet" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.DataSet.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">GeneraPDFPoliza" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.GeneraPDFPoliza.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">GeneraPDFPolizaResponse" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.GeneraPDFPolizaResponse.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">obtenerCertificado" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ObtenerCertificado.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">obtenerCertificadoJaime" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ObtenerCertificadoJaime.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">obtenerCertificadoJaimeResponse" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ObtenerCertificadoJaimeResponse.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

        qName = new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", ">obtenerCertificadoResponse" );
        cachedSerQNames.add( qName );
        cls = ar.com.libertyargentina.ObtenerCertificadoResponse.class;
        cachedSerClasses.add( cls );
        cachedSerFactories.add( beansf );
        cachedDeserFactories.add( beandf );

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession( super.maintainSession );
            }
            if (super.cachedUsername != null) {
                _call.setUsername( super.cachedUsername );
            }
            if (super.cachedPassword != null) {
                _call.setPassword( super.cachedPassword );
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress( super.cachedEndpoint );
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout( super.cachedTimeout );
            }
            if (super.cachedPortName != null) {
                _call.setPortName( super.cachedPortName );
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty( key, super.cachedProperties.get( key ) );
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle( null );
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get( i );
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get( i );
                        java.lang.Object x = cachedSerFactories.get( i );
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                    cachedSerFactories.get( i );
                            java.lang.Class df = (java.lang.Class)
                                    cachedDeserFactories.get( i );
                            _call.registerTypeMapping( cls, qName, sf, df, false );
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                    cachedSerFactories.get( i );
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                    cachedDeserFactories.get( i );
                            _call.registerTypeMapping( cls, qName, sf, df, false );
                        }
                    }
                }
            }
            return _call;
        } catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault( "Failure trying to get the Call object", _t );
        }
    }

    public ar.com.libertyargentina.CotizarRamasStringResponseCotizarRamasStringResult cotizarRamasString(java.lang.String XML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation( _operations[0] );
        _call.setUseSOAPAction( true );
        _call.setSOAPActionURI( "http://libertyargentina.com.ar/CotizarRamasString" );
        _call.setEncodingStyle( null );
        _call.setProperty( org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE );
        _call.setProperty( org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE );
        _call.setSOAPVersion( org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS );
        _call.setOperationName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "CotizarRamasString" ) );

        setRequestHeaders( _call );
        setAttachments( _call );
        try {
            java.lang.Object _resp = _call.invoke( new java.lang.Object[] { XML } );

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            else {
                extractAttachments( _call );
                try {
                    return (ar.com.libertyargentina.CotizarRamasStringResponseCotizarRamasStringResult) _resp;
                } catch (java.lang.Exception _exception) {
                    return (ar.com.libertyargentina.CotizarRamasStringResponseCotizarRamasStringResult) org.apache.axis.utils.JavaUtils.convert( _resp,
                            ar.com.libertyargentina.CotizarRamasStringResponseCotizarRamasStringResult.class );
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ar.com.libertyargentina.CotizarStringResponseCotizarStringResult cotizarString(java.lang.String XML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation( _operations[1] );
        _call.setUseSOAPAction( true );
        _call.setSOAPActionURI( "http://libertyargentina.com.ar/CotizarString" );
        _call.setEncodingStyle( null );
        _call.setProperty( org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE );
        _call.setProperty( org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE );
        _call.setSOAPVersion( org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS );
        _call.setOperationName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "CotizarString" ) );

        setRequestHeaders( _call );
        setAttachments( _call );
        try {
            java.lang.Object _resp = _call.invoke( new java.lang.Object[] { XML } );

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            else {
                extractAttachments( _call );
                try {
                    return (ar.com.libertyargentina.CotizarStringResponseCotizarStringResult) _resp;
                } catch (java.lang.Exception _exception) {
                    return (ar.com.libertyargentina.CotizarStringResponseCotizarStringResult) org.apache.axis.utils.JavaUtils.convert( _resp,
                            ar.com.libertyargentina.CotizarStringResponseCotizarStringResult.class );
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult consultaPorDni(java.lang.String XML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation( _operations[2] );
        _call.setUseSOAPAction( true );
        _call.setSOAPActionURI( "http://libertyargentina.com.ar/ConsultaPorDni" );
        _call.setEncodingStyle( null );
        _call.setProperty( org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE );
        _call.setProperty( org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE );
        _call.setSOAPVersion( org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS );
        _call.setOperationName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "ConsultaPorDni" ) );

        setRequestHeaders( _call );
        setAttachments( _call );
        try {
            java.lang.Object _resp = _call.invoke( new java.lang.Object[] { XML } );

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            else {
                extractAttachments( _call );
                try {
                    return (ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult) _resp;
                } catch (java.lang.Exception _exception) {
                    return (ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult) org.apache.axis.utils.JavaUtils.convert( _resp,
                            ar.com.libertyargentina.ConsultaPorDniResponseConsultaPorDniResult.class );
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ar.com.libertyargentina.ConsultaResponseConsultaResult consulta(java.lang.String XML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation( _operations[3] );
        _call.setUseSOAPAction( true );
        _call.setSOAPActionURI( "http://libertyargentina.com.ar/Consulta" );
        _call.setEncodingStyle( null );
        _call.setProperty( org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE );
        _call.setProperty( org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE );
        _call.setSOAPVersion( org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS );
        _call.setOperationName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "Consulta" ) );

        setRequestHeaders( _call );
        setAttachments( _call );
        try {
            java.lang.Object _resp = _call.invoke( new java.lang.Object[] { XML } );

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            else {
                extractAttachments( _call );
                try {
                    return (ar.com.libertyargentina.ConsultaResponseConsultaResult) _resp;
                } catch (java.lang.Exception _exception) {
                    return (ar.com.libertyargentina.ConsultaResponseConsultaResult) org.apache.axis.utils.JavaUtils.convert( _resp,
                            ar.com.libertyargentina.ConsultaResponseConsultaResult.class );
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult cargarFiltrosPoliza(
            java.lang.String seccion,
            java.lang.String poliza,
            java.lang.String endoso) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation( _operations[4] );
        _call.setUseSOAPAction( true );
        _call.setSOAPActionURI( "http://libertyargentina.com.ar/CargarFiltrosPoliza" );
        _call.setEncodingStyle( null );
        _call.setProperty( org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE );
        _call.setProperty( org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE );
        _call.setSOAPVersion( org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS );
        _call.setOperationName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "CargarFiltrosPoliza" ) );

        setRequestHeaders( _call );
        setAttachments( _call );
        try {
            java.lang.Object _resp = _call.invoke( new java.lang.Object[] { seccion, poliza, endoso } );

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            else {
                extractAttachments( _call );
                try {
                    return (ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult) _resp;
                } catch (java.lang.Exception _exception) {
                    return (ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult) org.apache.axis.utils.JavaUtils.convert( _resp,
                            ar.com.libertyargentina.CargarFiltrosPolizaResponseCargarFiltrosPolizaResult.class );
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public JaimeNet.Liberty.webservices.ArchivoPdf generaPDFPoliza(
            java.lang.String seccion,
            java.lang.String poliza,
            java.lang.String endoso,
            java.lang.String marcaAgua,
            ar.com.libertyargentina.GeneraPDFPolizaFiltros filtros,
            java.lang.String productor,
            java.lang.String ticket,
            java.lang.String documento) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation( _operations[5] );
        _call.setUseSOAPAction( true );
        _call.setSOAPActionURI( "http://libertyargentina.com.ar/GeneraPDFPoliza" );
        _call.setEncodingStyle( null );
        _call.setProperty( org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE );
        _call.setProperty( org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE );
        _call.setSOAPVersion( org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS );
        _call.setOperationName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "GeneraPDFPoliza" ) );

        setRequestHeaders( _call );
        setAttachments( _call );
        try {
            java.lang.Object _resp = _call.invoke( new java.lang.Object[] { seccion, poliza, endoso, marcaAgua, filtros, productor, ticket, documento } );

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            else {
                extractAttachments( _call );
                try {
                    return (JaimeNet.Liberty.webservices.ArchivoPdf) _resp;
                } catch (java.lang.Exception _exception) {
                    return (JaimeNet.Liberty.webservices.ArchivoPdf) org.apache.axis.utils.JavaUtils.convert( _resp, JaimeNet.Liberty.webservices.ArchivoPdf.class );
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult obtenerCertificadoJaime(java.lang.String XML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation( _operations[6] );
        _call.setUseSOAPAction( true );
        _call.setSOAPActionURI( "http://libertyargentina.com.ar/obtenerCertificadoJaime" );
        _call.setEncodingStyle( null );
        _call.setProperty( org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE );
        _call.setProperty( org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE );
        _call.setSOAPVersion( org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS );
        _call.setOperationName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "obtenerCertificadoJaime" ) );

        setRequestHeaders( _call );
        setAttachments( _call );
        try {
            java.lang.Object _resp = _call.invoke( new java.lang.Object[] { XML } );

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            else {
                extractAttachments( _call );
                try {
                    return (ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult) _resp;
                } catch (java.lang.Exception _exception) {
                    return (ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult) org.apache.axis.utils.JavaUtils.convert( _resp,
                            ar.com.libertyargentina.ObtenerCertificadoJaimeResponseObtenerCertificadoJaimeResult.class );
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult obtenerCertificado(java.lang.String XML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation( _operations[7] );
        _call.setUseSOAPAction( true );
        _call.setSOAPActionURI( "http://libertyargentina.com.ar/obtenerCertificado" );
        _call.setEncodingStyle( null );
        _call.setProperty( org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE );
        _call.setProperty( org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE );
        _call.setSOAPVersion( org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS );
        _call.setOperationName( new javax.xml.namespace.QName( "http://libertyargentina.com.ar/", "obtenerCertificado" ) );

        setRequestHeaders( _call );
        setAttachments( _call );
        try {
            java.lang.Object _resp = _call.invoke( new java.lang.Object[] { XML } );

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            else {
                extractAttachments( _call );
                try {
                    return (ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult) _resp;
                } catch (java.lang.Exception _exception) {
                    return (ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult) org.apache.axis.utils.JavaUtils.convert( _resp,
                            ar.com.libertyargentina.ObtenerCertificadoResponseObtenerCertificadoResult.class );
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
