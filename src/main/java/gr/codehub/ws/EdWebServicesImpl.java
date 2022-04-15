package gr.codehub.ws;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "gr.codehub.ws.EdWebServices",
        name="CodeHubService", serviceName="CodeHubService" )

public class EdWebServicesImpl implements EdWebServices {
    @Override
    public String getHelloWorld(String name) {
        Date dateNow  = new Date();
        return "Hello "+ name +" at "+ dateNow;
    }

    @Override
    public String getGreeting(String name) {
        if (name == null) return "You gave null";
        return "Hello. Your name has  " + name.length() + " characters";
    }

    @Override
    public String getGreeting() {
        return "The service is on!";
    }
}
