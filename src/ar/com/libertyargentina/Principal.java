package ar.com.libertyargentina;

public class Principal {

    public static void main(String[] args) {
        ServiceSoapProxy stub = new ServiceSoapProxy( "http://localhost:7080/LibertyWS/service.asmx?WSDL" );
        System.out.println( stub.getEndpoint() );
    }
}
