package gr.codehub;

import gr.codehub.client.EdWebServices;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class EdWebServicesConsumer {
    private static final String URL_LOCATION = "http://localhost:9999/ws/hello";
    private static final String NAMESPACE_URI = "http://ws.codehub.gr/";
    private static final String WS_SERVICE_NAME = "CodeHubService";


    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(URL_LOCATION);
        QName qname = new QName(NAMESPACE_URI, WS_SERVICE_NAME);

        Service service = Service.create(url, qname);
        EdWebServices edWs = service.getPort(EdWebServices.class);

        String wsResponse = edWs.echoString("Dimitris");
        System.out.println(wsResponse);
    }

}
