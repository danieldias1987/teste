
package com.everis.academia.java.agenda.digital.web.soap.generated;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CidadeSOAP", targetNamespace = "http://soap.web.digital.agenda.java.academia.everis.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CidadeSOAP {


    /**
     * 
     * @param cidade
     */
    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://soap.web.digital.agenda.java.academia.everis.com/", className = "com.everis.academia.java.agenda.digital.web.soap.generated.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://soap.web.digital.agenda.java.academia.everis.com/", className = "com.everis.academia.java.agenda.digital.web.soap.generated.DeleteResponse")
    @Action(input = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/deleteRequest", output = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/deleteResponse")
    public void delete(
        @WebParam(name = "cidade", targetNamespace = "")
        Cidade cidade);

    /**
     * 
     * @return
     *     returns java.util.List<com.everis.academia.java.agenda.digital.web.soap.generated.Cidade>
     * @throws BusinessException_Exception
     */
    @WebMethod
    @WebResult(name = "cidade", targetNamespace = "")
    @RequestWrapper(localName = "read", targetNamespace = "http://soap.web.digital.agenda.java.academia.everis.com/", className = "com.everis.academia.java.agenda.digital.web.soap.generated.Read")
    @ResponseWrapper(localName = "readResponse", targetNamespace = "http://soap.web.digital.agenda.java.academia.everis.com/", className = "com.everis.academia.java.agenda.digital.web.soap.generated.ReadResponse")
    @Action(input = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/readRequest", output = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/readResponse", fault = {
        @FaultAction(className = BusinessException_Exception.class, value = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/read/Fault/BusinessException")
    })
    public List<Cidade> read()
        throws BusinessException_Exception
    ;

    /**
     * 
     * @param cidade
     * @throws BusinessException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "create", targetNamespace = "http://soap.web.digital.agenda.java.academia.everis.com/", className = "com.everis.academia.java.agenda.digital.web.soap.generated.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://soap.web.digital.agenda.java.academia.everis.com/", className = "com.everis.academia.java.agenda.digital.web.soap.generated.CreateResponse")
    @Action(input = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/createRequest", output = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/createResponse", fault = {
        @FaultAction(className = BusinessException_Exception.class, value = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/create/Fault/BusinessException")
    })
    public void create(
        @WebParam(name = "cidade", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Cidade> cidade)
        throws BusinessException_Exception
    ;

    /**
     * 
     * @param cidade
     * @return
     *     returns com.everis.academia.java.agenda.digital.web.soap.generated.Cidade
     * @throws BusinessException_Exception
     */
    @WebMethod
    @WebResult(name = "cdidade", targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://soap.web.digital.agenda.java.academia.everis.com/", className = "com.everis.academia.java.agenda.digital.web.soap.generated.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://soap.web.digital.agenda.java.academia.everis.com/", className = "com.everis.academia.java.agenda.digital.web.soap.generated.UpdateResponse")
    @Action(input = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/updateRequest", output = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/updateResponse", fault = {
        @FaultAction(className = BusinessException_Exception.class, value = "http://soap.web.digital.agenda.java.academia.everis.com/CidadeSOAP/update/Fault/BusinessException")
    })
    public Cidade update(
        @WebParam(name = "cidade", targetNamespace = "")
        Cidade cidade)
        throws BusinessException_Exception
    ;

}
