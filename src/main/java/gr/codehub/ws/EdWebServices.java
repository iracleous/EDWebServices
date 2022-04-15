package gr.codehub.ws;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface EdWebServices {
    @WebMethod(operationName = "echoString")
    String getHelloWorld(@WebParam(name="PurchaseName") String name);

    @WebMethod(operationName = "greeting")
    String getGreeting(String name);

    @WebMethod(operationName = "emptyParameterMethod")
    String getGreeting ();
}
