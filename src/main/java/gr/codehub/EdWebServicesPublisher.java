package gr.codehub;

import gr.codehub.ws.EdWebServicesImpl;

import javax.xml.ws.Endpoint;

public class EdWebServicesPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new EdWebServicesImpl());
    }
}

