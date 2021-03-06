
package gr.codehub.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EdWebServices", targetNamespace = "http://ws.codehub.gr/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface EdWebServices {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.codehub.gr/EdWebServices/greetingRequest", output = "http://ws.codehub.gr/EdWebServices/greetingResponse")
    public String greeting(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.codehub.gr/EdWebServices/emptyParameterMethodRequest", output = "http://ws.codehub.gr/EdWebServices/emptyParameterMethodResponse")
    public String emptyParameterMethod();

    /**
     * 
     * @param purchaseName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.codehub.gr/EdWebServices/echoStringRequest", output = "http://ws.codehub.gr/EdWebServices/echoStringResponse")
    public String echoString(
        @WebParam(name = "PurchaseName", partName = "PurchaseName")
        String purchaseName);

}
